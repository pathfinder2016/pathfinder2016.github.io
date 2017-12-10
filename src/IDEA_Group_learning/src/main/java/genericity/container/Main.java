package genericity.container;

public class Main {
    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>(1);
        Container<String> strContainer = new Container<>("hello");

        System.out.println(intContainer.getData());
        System.out.println(strContainer.getData());

        // 编译阶段，类型抹除
        System.out.println(intContainer.getClass().getName());
        System.out.println(strContainer.getClass().getName());
    }
}