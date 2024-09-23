package com.qf.loop;

import java.util.Scanner;

/**
 * 循环次数已知，用for
 * 循环次数位置未知，用while
 */
// break关键词
public class Demo4 {
    public static void main(String[] args) {
        /**
         * ATM机取钱:假设密码是数字123，允许输入3次
         * 如果输入正确,直接进入,给出提示:欢迎使用天地银行
         * 如果不正确，继续下一次输入
         * 如果三次都不对,，给出提示:卡已锁死,请联系客服~
         */
        /**
        int count = 1;
        int passWordReal = 123;
        while (count<=3){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入密码：");
            int passWord = scanner.nextInt();
            if (passWordReal == passWord){
                System.out.println("欢迎使用天地银行~");
                break;
            }else {
                count++;
            }
        }
        if (count==4){
            System.out.println("卡已锁死，请联系客服~");
        }
        */
        /**
        int count=1;
        int passWordReal = 123;
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用天地银行~");
        for (;count<=3;count++){
            System.out.println("您一共有三次机会，正在第"+count+"次输入，请输入密码：");
            int passWord = scanner.nextInt();
            if (passWordReal == passWord){
                System.out.println("欢迎登录~");
                break;
            }else {
                System.out.println("密码输入错误，您还有"+(3-count)+"次机会");
            }
            if (count==3){
                System.out.println("卡已锁死，请联系客服~");
            }
        }
         */
        // 逢7过
        for (int i = 1; i < 101; i++) {
            if(i%10==7||i/10==7||i%7==0){
                System.out.print("过 ");
                continue;
            }
            System.out.print(i+" ");
            if (i%10==0){
                System.out.println();
            }
        }
        /**
         *  &&&*
         *  &&***
         *  &*****
         *  *******
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 百钱买百鸡
        /**
        int i,j;
        for (i=1;i<30;i++){
            for (j=1;j<40;j++){
                if(i+j+(100-3*i-2*j)*3==100){
                    System.out.println("公鸡："+i+"只；母鸡："+j+"只；小鸡："+(100-i-j)+"只");
                }
            }
        }*/
        for (int g = 0; g <= 33; g++) {
            for (int m = 0; m <= 50; m++) {
                for (int x = 0; x < 100; x++) {
                    if (x%3==0&&(g*3+m*2+x/3==100)&&(g+m+x==100)){
                        System.out.println("公鸡："+g+"只；母鸡："+m+"只；小鸡："+x+"只");

                    }
                }
            }
        }
    }
}
