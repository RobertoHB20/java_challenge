package Patterns.Behavior.ChainOfResponsability.Live;

public interface Chain {

    void setNextChain(Chain nextChain);
    int calculate(Numbers request);
}
