package Patterns.Structural.Proxy.Live;

public class RunProxy {

    public static void main(String[] args) {

        IInternet internet = new ProxyInternet();
        try{
            internet.connectTo("ibm.com");
            internet.connectTo("facebook.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
