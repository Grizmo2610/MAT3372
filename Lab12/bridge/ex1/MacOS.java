package bridge.ex1;

public class MacOS implements OperatingSystem{
    @Override
    public void startup() {
        System.out.println("Start up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Loading" + url);
    }
}
