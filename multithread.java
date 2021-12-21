public class multithread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread : " + t);
        t.setName("MYthread");
        System.out.println("after name change");
        String s = t.getName();
        System.out.println("thread name :" + s);
    }
}
