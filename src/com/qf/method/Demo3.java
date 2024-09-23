package com.qf.method;
// 返回值问题
public class Demo3 {
    public static void main(String[] args) {
        // 调用带返回值的方法，接收方法执行完后的返回值，可以使用变量接收返回值
        int rec = sum(1,2);
        System.out.println(rec);
        System.out.println("----------------");
        double area = area(2);
        System.out.println(area);
        System.out.println("----------------");
        int show = show();
        System.out.println(show);
    }
    // 传入两个数，计算他们的和并将结果返回
    public static int sum(int a, int b){
        return (a+b);
    }
    // 设计方法，传入圆的半径r，返回圆的面积
    public static double area(int r){
        double area = 3.14*r*r;
        return area;
    }
    // 设计方法，返回一个int值，无参有返回值
    public static int show(){
        return 20;
    }
}
