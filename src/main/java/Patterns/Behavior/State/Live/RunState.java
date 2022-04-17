package Patterns.Behavior.State.Live;

public class RunState {

    public static void main(String[] args) {
        MobileAlertStateContext context = new MobileAlertStateContext();

        context.alert();
        context.alert();
        context.setCurrentState(new Vibration());
        context.alert();
        context.alert();
        context.setCurrentState(new Silence());
        context.alert();
        context.alert();
    }
}
