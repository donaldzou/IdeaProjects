package com.company;
import java.util.*;

/**
 * Created by Donaldzou on 2017-05-12.
 */
public class try2 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        double dec = keyboard.nextDouble();

        int sum = num1 + num2;
        if (dec > sum){
            System.out.println(sum);
            System.out.println("Yes");
        }
        else{
            System.out.println(sum);
            System.out.println("No");
        }
    }
}
