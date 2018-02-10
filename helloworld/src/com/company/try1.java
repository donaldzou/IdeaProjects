package com.company;
import java.util.*;

/**
 * Created by Donaldzou on 2017-05-12.
 */
public class try1 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int num;
        String sen;
        num = keyboard.nextInt();
        keyboard.nextLine();
        sen = keyboard.nextLine();

        for (int i = 0; i < num; i++){
            System.out.println(sen);
        }
    }
}
