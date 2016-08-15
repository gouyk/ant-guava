package guava.eventbus;

/**
 * Created by yingkuigou on 2016/8/15.
 */
public enum EventEnum {
    EVENT_TYPE_A(1, "事件A"), EVENT_TYPE_B(2, "事件B");

    public Integer key;

    public String value;

    private EventEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public static EventEnum get(Integer key) {
        EventEnum[] values = EventEnum.values();
        for (EventEnum obj : values) {
            if (obj.key == key) {
                return obj;
            }
        }
        return null;
    }
}
