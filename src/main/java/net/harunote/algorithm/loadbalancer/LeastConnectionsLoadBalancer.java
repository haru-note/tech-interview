package net.harunote.algorithm.loadbalancer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeastConnectionsLoadBalancer {
    private List<String> serverList;
    // 서버 연결수를 측정하기 위해 (서버, 연결수)의 HashMap을 사용
    private Map<String, Integer> connectionsCountMap;

    public LeastConnectionsLoadBalancer(List<String> serverList) {
        this.serverList = new ArrayList<>(serverList); // serverList 복사
        this.connectionsCountMap = new HashMap<>();
        // 서버 추가후 연결수는 초기화함
        for (String server : serverList) {
            connectionsCountMap.put(server, 0);
        }
    }

    public synchronized String getNextServer() {
        String nextServer = null;
        int minConnections = Integer.MAX_VALUE;

        for (String server : serverList) {
            int connections = connectionsCountMap.get(server);
            if (connections < minConnections) {
                minConnections = connections;
                nextServer = server;
            }
        }

        connectionsCountMap.put(nextServer, connectionsCountMap.get(nextServer) + 1);
        return nextServer;
    }

    // 서버 연결 수 감소
    public synchronized void releaseConnection(String server) {
        int connections = connectionsCountMap.get(server);
        if (connections > 0) {
            connectionsCountMap.put(server, connections - 1);
        }
    }

    public static void main(String[] args) {
        List<String> serverList = List.of("1번 서버", "2번 서버", "3번 서버");
        LeastConnectionsLoadBalancer loadBalancer = new LeastConnectionsLoadBalancer(serverList);

        // 요청을 분산하여 처리
        for (int i = 0; i < 10; i++) {
            String server = loadBalancer.getNextServer();
            System.out.println("요청  " + (i + 1) + " 번째 " + server+ "로 진입");
        }

        // 서버1의 연결 수를 2회 감소
        loadBalancer.releaseConnection("1번 서버");
        loadBalancer.releaseConnection("1번 서버");

        // 추가요청
        for (int i = 0; i < 5; i++) {
            String server = loadBalancer.getNextServer();
            System.out.println("추가 요청 " + (i + 1) + " 이 연결된 서버 = " + server);
        }
    }
}
