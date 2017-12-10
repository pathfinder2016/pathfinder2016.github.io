package genericity.add;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * 如果我们在定义add函数的时候，不加上<T extends Addable<T>>，那么就会出现编译错误，因为，编译器并不知道o1是什么类型，是否支持调用add方法。加上extends的限制就是告诉编译器，T是Addable的子类型，是可以调用add方法的。
     * @param t1
     * @param t2
     * @param <T>
     * @return
     */
    public static <T extends Addable<T>> T add(T t1, T t2){
        return t1.add(t2);
    }
}