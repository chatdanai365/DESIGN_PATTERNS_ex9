public class App {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        SmartHome sprinkler = new Sprinkler();
        SmartHome coffeepot = new CoffeePot();
        Alarm alarm = new Alarm();

        mediator.addAlarm(alarm);
        mediator.addSmartHome(sprinkler);
        mediator.addSmartHome(coffeepot);

        alarm.setMediator(mediator);
        sprinkler.setMediator(mediator);
        coffeepot.setMediator(mediator);

        mediator.doAlarm(); // wake up the whole house!
    }
}