package genericity.container;

class Container<T> {

    private final T data;

    Container(T data) {
        this.data = data;
    }

    T getData(){
        return this.data;
    }
}