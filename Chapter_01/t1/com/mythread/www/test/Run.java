package t1.com.mythread.www.test;

import t1.com.mythread.www.MyThread;

public class Run {
    public static void main(String[] args){
        MyThread mythread = new MyThread();
        mythread.start();
        System.out.println("运行结束！");
    }
}
