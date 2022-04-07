package Patterns.Structural.Proxy.Live;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements IInternet{

    private IInternet internet = new AccessToInternet();
    public static List<String> bannedURL;

    static {
        bannedURL = new ArrayList<>();
        bannedURL.add("facebook.com");
        bannedURL.add("twitter.com");
        bannedURL.add("php.net");
    }

    @Override
    public void connectTo(String url) throws Exception {
        if(bannedURL.contains(url)) {
            throw new Exception("URL bloqueada, acceso denegado. Consultar al admin");
        }
        internet.connectTo(url);
    }
}
