package com.qf.homework;

public class Demo4 {
    /**
     * 方法递归调用实现
     * 写一个函数，接收一个整数n，返回n！
     * 5！=5*4*3*2*1
     * @param
     */
    // 阶乘(使用循环实现)
    public static int jiecheng1(int n){
        int mul = 1;
        while (n!=0){
            mul*=n;
            n-=1;
        }
        return mul;
    }
    // 阶乘(使用方法递归调用实现)
    // 1!=1
    // 2!=2*1!=2*m(1)
    // 3!=3*2!=3*m(2)
    // 4!=4*3!=4*m(3)
    // .......
    //n!=n*(n-1)!=n*m(n-1)
    public static int jiecheng2(int n){
        if (n==1){
            return 1;
        }else {
            return (n*jiecheng2(n-1));
        }
    }
    public static void main(String[] args) {
        int result = jiecheng1(4);
        System.out.println(result);

        int result1 = jiecheng2(5);
        System.out.println(result1);
    }

}
