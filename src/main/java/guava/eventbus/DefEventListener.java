package guava.eventbus;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;

/**
 * Created by yingkuigou on 2016/8/15.
 * 创建事件监听
 */
public class DefEventListener {

    @Subscribe
    @AllowConcurrentEvents
    public void onEvent(Integer eventKey) {
        System.out.println(EventEnum.get(eventKey).value);
    }

    @Subscribe
    @AllowConcurrentEvents
    public void onEvent(Event.asynEvent event) {
        event.printEvent();
    }

    @Subscribe
    @AllowConcurrentEvents
    public void onEvent(Event.synEvent event) {
        event.printEvent();
    }
}
