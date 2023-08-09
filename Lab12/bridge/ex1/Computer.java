package bridge.ex1;

public abstract class Computer {
    OperatingSystem os;
    public void startup(){
        os.startup();
    }
    public void loadUrl(String url) {
        os.loadUrl(url);
    }

    public boolean canMoveComputer(){
        return false;
    }
}
