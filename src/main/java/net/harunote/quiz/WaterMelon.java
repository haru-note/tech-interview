package net.harunote.quiz;

/**
 * @Author : CodeVillains
 * @Description : water_melon함수는 정수 n을 매개변수로 입력받습니다.
 * 길이가 n이고, 수박수박수...와 같은 패턴을 유지하는 문자열을 리턴하도록 함수를 완성하세요.
 * 예를들어 n이 4이면 '수박수박'을 리턴하고 3이라면 '수박수'를 리턴하면 됩니다.
 */
public class WaterMelon {
    public String waterMelon(int n){
        /*
        String result = "";
        for (int i = 1; i <= n; i++) {
            // 홀수면 수
            if (i % 2 == 1) {
                result +="수";
            } else {
                result +="박";
            }
            // 짝수면 박
        }
        return result;
        */

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 1; i <= n; i++) {
            stringBuffer.append(i % 2 == 1 ? "수" : "박");
        }

        return stringBuffer.toString();
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.waterMelon(3));
        System.out.println("n이 4인 경우: " + wm.waterMelon(4));
    }
}
