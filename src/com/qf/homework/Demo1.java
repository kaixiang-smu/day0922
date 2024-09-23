package com.qf.homework;

public class Demo1 {
    // 写一个函数，计算从1到某个数以内所有能被3或者17整除的数的和
    public static int add(int num){
        int sum=0;
        for (int i=1;i<=num;i++){
            if (i%3==0||i%17==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = add(20);
        System.out.println(result);
    }
}
