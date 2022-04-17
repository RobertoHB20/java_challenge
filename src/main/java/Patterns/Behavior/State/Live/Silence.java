package Patterns.Behavior.State.Live;

public class Silence implements MobileAlertState{

    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("....................");
    }
}
