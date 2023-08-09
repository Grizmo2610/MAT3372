package bridge.ex2;

public interface Device {
    boolean isEnabled();

    void enable();
    void disable();
    int getVolume();
    void setVolume(double percent);
    int getChanel();
    void setChanel(int chanel);
}
