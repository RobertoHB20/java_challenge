package Patterns.Structural.Proxy.Live;

public class AccessToInternet implements IInternet{

    @Override
    public void connectTo(String url) throws Exception {

        System.out.println("Conectado a: " + url);

    }
}
