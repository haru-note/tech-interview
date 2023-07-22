package net.harunote.quiz;

import java.io.UnsupportedEncodingException;

/**
 * @Author : CodeVillains
 * @Description :
 */
public class BinaryGap {

    public static void main(String[] args) throws UnsupportedEncodingException {
        int x = 2;

        // decimal to binary
        String binaryString = Integer.toBinaryString(x);

        // decimal to hexadecimal
        String hexString = Integer.toHexString(x);

        // ASCII Code to String
        String charAscII = Character.toString((char) x);

        System.out.println("binary : " + binaryString);
        System.out.println("hex : " + hexString);
        System.out.println("ASCII : " + charAscII);


        String str = "1226#24#";

        int val = str.charAt(0) - '0';
        System.out.println(val);


    }
}
