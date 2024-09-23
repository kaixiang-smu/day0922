package com.qf.loop;
// 演示do-while循环
public class Demo1 {
    public static void main(String[] args) {
        // 输出1-10
        int i = 1;
        do {
            System.out.print(i+" ");
            i++;
        }while (i<=10);
        // 输出1-100的偶数
        System.out.println("\r\n~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int j = 1;
        do {
            if (j%2==0){
                System.out.println(j);
            }
            j++;
        }while (j<=100);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int j1 = 2;
        do {
            System.out.println(j1);
            j1+=2;
        }while (j1<=100);
    }
}
