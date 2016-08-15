import guava.eventbus.Event;
import guava.eventbus.EventEnum;
import guava.eventbus.EventManage;

/**
 * Created by yingkuigou on 2016/8/15.
 */
public class TestEventBus {

    public static void main(String[] args) {
        EventManage.keyPost(EventEnum.EVENT_TYPE_A.key);
        EventManage.asynPost(new Event.asynEvent());
        EventManage.synPost(new Event.synEvent());
    }
}
