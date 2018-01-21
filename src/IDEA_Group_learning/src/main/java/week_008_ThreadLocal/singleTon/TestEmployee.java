package week_008_ThreadLocal.singleTon;

public class TestEmployee implements Runnable{

    public static void main(String[] args) {
        SingleTonEmployee employee1 = SingleTonEmployee.getInstance();
    }

    @Override
    public void run() {
        int currentSalary = Thread.
    }
}