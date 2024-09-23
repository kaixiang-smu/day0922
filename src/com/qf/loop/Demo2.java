package com.qf.loop;
// for循环
public class Demo2 {
    public static void main(String[] args) {
        // 输出1-10
        for (int i = 1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println("\r\n~~~~~~~~~~~~~~~~~~~~~~");
        // 输出10-1
        for (int j=10;j>0;j--){
            System.out.print(j+" ");
        }
        System.out.println("\r\n~~~~~~~~~~~~~~~~~~~~~~");
        // 输出1-100的偶数
        for (int k=1;k<=100;k++){
            if(k%2==0){
                System.out.print(k+" ");
            }
        }
        System.out.println("\r\n~~~~~~~~~~~~~~~~~~~~~~");
        // 输出1-100的和
        int s = 0;
        for (int m=1;m<=100;m++){
            s+=m;
        }
        System.out.print(s);
        System.out.println("\r\n~~~~~~~~~~~~~~~~~~~~~~");
        // 使用for循环完成水仙花数
        for (int n = 100;n<1000;n++){
            if (Math.pow(n%10,3)+Math.pow(n/10%10,3)+Math.pow(n/100,3)==n){
                System.out.print(n+" ");
            }
        }
        System.out.println("\r\n~~~~~~~~~~~~~~~~~~~~~~");
        // 输出1-100的奇数和，偶数和
        int oddSum = 0;
        int evenSum = 0;
        for (int i=1;i<=100;i++){
            if (i%2==1){
                oddSum+=i;
            }else {
                evenSum+=i;
            }
        }
        System.out.println("1-100奇数和="+oddSum+",偶数和="+evenSum);
    }
}
