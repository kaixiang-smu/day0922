package com.qf.method;

public class Demo1 {
    /**
     * 方法定义演示
     */
    public static void methodName(){
    }
    public static void methodName(int a, double b){
    }
    public static int methodName(String s){
        return 0;
    }
    /**
     * 方法的语法解释：
     * public 词义：公共的；作用：访问权限，目前每个方法都要定义（固定的）
     * static 词义：静态的；作用：后续再说（面向对象）目前每个方法都要定义（固定的）
     * 第三处：方法的返回值类型
     *       方法的返回值是方法的功能执行完返回的结果数据
     *       返回值类型是结果的数据类型（如：int,double,String等）
     *       如果方法执行完返回的整数，此处写int
     *       如果方法执行完返回的小数，此处写double
     *       如果方法执行完返回的字符串，此处写String
     *       如果方法执行完没有返回数据，此处写void
     *       方法也可以不返回，写void，意思是空
     *    ----------------------------------------
     *       如果返回值类型是void，方法体内{}不写return值；
     *       如果返回值类型不是void，方法体内{}一定要写return值；
     * 第四处：方法名，见名知意，小写的驼峰原则
     * （） ：括号叫做参数列表，参数就是方法执行需要的数据
     *      列表：可以有任意个参数，多个之间逗号隔开
     *      具体写法：数据类型 变量名，与之前声明变量完全一样
     *  {} ：方法体，方法执行的具体逻辑代码
     */
    // 定义一个方法，输出一句你好
    public static void hello() {
        System.out.println("你好！Java！");
    }
    // 程序有一个唯一入口
    public static void main(String[] args) {
        // 调用方法
//        hello();
        printNum();
    }
    // 定义一个方法，输出1-10
    public static void printNum(){
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i+" ");
        }
    }
}
