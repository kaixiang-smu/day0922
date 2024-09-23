package com.qf.method;

public class Demo2 {
    public static void main(String[] args) {
        // 方法有参数，调用时需要传参数
        // 即给方法的变量赋值
//        printNum(20);
//        check(101);
        // 方法有多个参数，要按照顺序和个数和类型传入
//        sum(12, 23);
//        eat(2, "饺子");
        circle(2.0);
    }
    // 设计方法打印从1到指定值
    // 方法设计参数，就是()中定义变量
    public static void printNum(int n){
        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
        }
    }
    // 设计方法，输出给定数据是否是奇数/偶数
    public static void check(int num){
        if (num%2==1){
            System.out.println(num+"是奇数");
        }else {
            System.out.println(num+"是偶数");
        }
    }
    // 参数可以是多个
    // 设计方法，输出传入两个整数的和
    public static void sum(int i, int j){
        System.out.println(i+","+j+"的和是"+(i+j));
    }
    // 设计方法，输出今天你吃的几碗饭
    public static void eat(int n, String food){
        System.out.println("我今天吃了"+n+"碗"+food);
    }
    // 写一个方法，输入圆的半径，输出其周长
    public static void circle(double radius){
        System.out.println("圆的周长是："+(2*3.14*radius));
    }
}
