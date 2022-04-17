package Patterns.Behavior.State.Live;

import lombok.Setter;

@Setter
public class MobileAlertStateContext {
    private MobileAlertState currentState;

    public MobileAlertStateContext() {
        this.currentState = new Sound();
    }

    public void alert(){
        currentState.alert(this);
    }
}
