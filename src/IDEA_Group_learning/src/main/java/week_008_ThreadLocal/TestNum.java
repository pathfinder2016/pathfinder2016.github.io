package week_008_ThreadLocal;

public class TestNum {
//     ①通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
        public Integer initialValue() { //返回该线程局部变量的初始值
            return 0;
        }
    };

//    // 如果没有用ThreadLocal， 会是这个样子的
//    /*private static Integer seqNum = 0;
//
//    public Integer get() {
//        return seqNum;
//    }
//
//    public void set(Integer seqNum) {
//        this.seqNum = seqNum;
//    }
//
//    // ②获取下一个序列值
//    int getNextNum() {
//        set(get() + 1);
//        return get();
//    }*/

    // ②获取下一个序列值
    int getNextNum() {
        seqNum.set(seqNum.get() + 1);
        return seqNum.get();
    }

    public static void main(String[] args) {
        TestNum sn = new TestNum();
        // ③ 3个线程共享sn，各自产生序列号
        TestClient t1 = new TestClient(sn);
        TestClient t2 = new TestClient(sn);
        TestClient t3 = new TestClient(sn);
        t1.start();
        t2.start();
        t3.start();
    }

    private static class TestClient extends Thread {
        private TestNum sn;

        TestClient(TestNum sn) {
            this.sn = sn;
        }

        public void run() {
            for (int i = 0; i < 3; i++) {
                // ④每个线程打出3个序列值
                System.out.println("thread[" + Thread.currentThread().getName() + "] --> sn["
                        + sn.getNextNum() + "]");
            }
        }
    }
}