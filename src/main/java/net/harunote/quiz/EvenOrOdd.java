package net.harunote.quiz;

/**
 * @Author : CodeVillains
 * @Description : evenOrOdd 메소드는 int형 num을 매개변수로 받습니다. num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하도록
 * evenOrOdd에 코드를 작성해 보세요. num은 0이상의 정수이며, num이 음수인 경우는 없습니다.
 */
public class EvenOrOdd {

    public static void main(String[] args) {
        int num = 4;

        EvenOrOdd eo = new EvenOrOdd();
        System.out.println(num + " 은(는)" + eo.evenOrOdd(num) + " 입니다");

        // return (num % 2 == 0) ? "Even" : "Odd";
    }

    public String evenOrOdd(int num) {
        String result = "";
        if (num % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        return result;
    }
}
