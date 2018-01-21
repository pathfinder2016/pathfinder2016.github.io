package week_008_ThreadLocal.singleTon;

public class SingleTonEmployee {
    private int salary = 1;
    private static SingleTonEmployee employee = null;

    private SingleTonEmployee() {
    }

    public static SingleTonEmployee getInstance(){
        if(employee == null){
            return new SingleTonEmployee();
        }
        return employee;
    }
}