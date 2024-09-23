package com.qf.method;

public class Demo4 {
    // 程序唯一入口
    public static void main(String[] args) {
        System.out.println("老师");
        String result = classLeaderClean();
        System.out.println(result);
    }
    // 组员-扫地
    public static String studentClean(){
        System.out.println("学生");
        System.out.println("学生扫地");
        return "学生完成扫地";
    }
    // 组长-扫地
    public static String groupLeaderClean(){
        // 调用组员，让其扫地
        System.out.println("组长");
        String result = studentClean();
        System.out.println(result);
        return "组长完成扫地";
    }
    // 班长-扫地
    public static String classLeaderClean(){
        // 调用组长，让其扫地
        System.out.println("班长");
        String result = groupLeaderClean();
        System.out.println(result);
        return "班长完成扫地";
    }
}
