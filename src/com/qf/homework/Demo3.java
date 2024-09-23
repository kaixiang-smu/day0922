package com.qf.homework;

public class Demo3 {
    //传入两个数字,计算他们的次幂,将结果返回
    // 例如:(2,3)     2^3 = 2*2*2
    //      (3,4)     3^4 = 3*3*3*3
    public static int pow(int a, int b){
        int c = 1;
        for (int i = 1; i <= b ; i++) {
            c*=a;
        }
        return c;
    }
    public static void main(String[] args) {
        int result = pow(3, 4);
        System.out.println(result);
    }
}
