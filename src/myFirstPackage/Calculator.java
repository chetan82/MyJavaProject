package myFirstPackage;

import mySecondPackage.MethodPractice1;
import mySecondPackage.MethodPractice2;

/**
 * Created by User on 19/11/2017.
 */
public class Calculator {
    public static void main(String[] args) {
//        int a=12;
//        int b=34;
//        int c;

        int a=12, b=34, c;
        c = a+ b;


        int num1 =23, num2=56, num3;
        num3 = num1 - num2;

        System.out.println("Addition of a and b: "+c);
        System.out.println("Subtraction of num1 and num2: "+num3);
        MethodPractice1 m1 =new MethodPractice1();
    }
}
