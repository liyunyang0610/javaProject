package com.chinasofti.lesson02;

public class Singleton01 {
    private Singleton01(){

    }
    private static Singleton01 singleton01;

    public static Singleton01 getSingleton01(){
        if (singleton01==null){
            //双重判断锁机制，保证线程安全
            synchronized(Singleton01.class){
            //需要时才创建
                if (singleton01==null){
                    singleton01=new Singleton01();
                }
            }
        }
        return singleton01;
     }
}
