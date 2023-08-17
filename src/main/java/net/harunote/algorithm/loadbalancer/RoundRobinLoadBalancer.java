package net.harunote.algorithm.loadbalancer;

import java.util.List;

public class RoundRobinLoadBalancer {
    private List<String> serverList;
    private int currentIndex = 0;

    public RoundRobinLoadBalancer(List<String> serverList) {
        this.serverList = serverList;
    }

    public String getNextServer() {
        int index = currentIndex % serverList.size();
        currentIndex++;
        return serverList.get(index);
    }

    public static void main(String[] args) {
        // 서버 목록 설정
        List<String> serverList = List.of("1번 서버", "2번 서버", "3번 서버");
        RoundRobinLoadBalancer loadBalancer = new RoundRobinLoadBalancer(serverList);

        // 10개의 요청을 처리할 서버 선택
        for (int i = 0; i < 10; i++) {
            String server = loadBalancer.getNextServer();
            System.out.println("요청 " + (i + 1) + "번째 " + server + "로 진입");
        }
    }
}