package week_008_ThreadLocal.staticVar;

public class StaticVar implements Runnable{

    private static int staticInteger = 1;

    public static void main(String[] args) {
        StaticVar staticVar = new StaticVar();
        for (int i = 0; i < 3000; i++) {
            new Thread(staticVar, "Thread_"+i).start();
        }
    }

    //要修改共享资源，才能更好地看到结果
    @Override
    public void run() {
        staticInteger = 4;
        System.out.println("["+Thread.currentThread().getName()+"]"+"获取staticInteger的值为 "+staticInteger);
        staticInteger = 10;
        System.out.println("["+Thread.currentThread().getName()+"]"+"获取staticInteger * 2的值为 "+staticInteger * 2);
    }
}