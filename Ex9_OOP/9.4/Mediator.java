import java.util.ArrayList;

public class Mediator {
    ArrayList<SmartHome> sm = new ArrayList<>();
    Alarm alarm;

    public void addSmartHome(SmartHome sm) {
        this.sm.add(sm);
    }

    public void doTask() {
        for (SmartHome sm : sm) 
            sm.doTask();
    }

    public void addAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public void doAlarm() {
        alarm.doAlarm();
    }

    public void endAlarm(String from) {
        alarm.endAlarm(from);
    }
}