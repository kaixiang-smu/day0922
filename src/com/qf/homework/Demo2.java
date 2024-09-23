package com.qf.homework;

public class Demo2 {
    // 写一个方法将一个整数逆序打印
    // int a = 3456；
    // 输出：6543
    public static void print(int a){
        while (a!=0){
            System.out.print(a%10);
            a/=10;
        }
    }
    public static void main(String[] args) {
        print(1234567);
    }
}
