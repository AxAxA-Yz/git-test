package com.itheima;

import java.util.Date;

public class GitTest {
    public static void main(String[] args) {

        long startTime = new Date().getTime();

        System.out.println("hello git project");
        System.out.println("hello git project");
        System.out.println("hello git project");

        int a = 9;
        int b =++a;
        System.out.println(b);

        long endTime = new Date().getTime();
        System.out.println(startTime-endTime);

    }
}
