package guava.eventbus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.concurrent.Executors;

/**
 * Created by yingkuigou on 2016/8/15.
 */
public class EventManage {

    private static EventBus eventBus;

    private static AsyncEventBus asyncEventBus;

    static {
        eventBus = new EventBus();
        asyncEventBus = new AsyncEventBus(Executors.newCachedThreadPool());
        //订阅事件
        DefEventListener defEventListener = new DefEventListener();
        eventBus.register(defEventListener);
        asyncEventBus.register(defEventListener);

    }

    public static void synPost(Object eventObj) {
        eventBus.post(eventObj);
    }

    public static void asynPost(Object eventObj) {
        asyncEventBus.post(eventObj);
    }

    public static void keyPost(Integer key) {
        eventBus.post(key);
    }

}
