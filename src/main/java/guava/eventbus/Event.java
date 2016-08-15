package guava.eventbus;

/**
 * Created by yingkuigou on 2016/8/15.
 */
public class Event<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static class synEvent {
        public static void printEvent() {
            System.out.println("同步事件");
        }
    }

    public static class asynEvent {
        public static void printEvent() {
            System.out.println("异步事件");
        }
    }

}
