package Patterns.Behavior.State.Live;

public class Vibration implements MobileAlertState{

    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Brrrr... Brrrr... Brrrr...");
    }
}
