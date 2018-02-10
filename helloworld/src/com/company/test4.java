package com.company;

/**
 * Created by Donaldzou on 2017-04-26.
 */
public class test4 {
    public static void main (String[] args){
        int[] a = new int [101];
        for (int i = 1; i <= 100; i++)
            a[i] = i;
        System.out.println("_________");
        for (int element : a)
            System.out.println(element);
        }
    }
