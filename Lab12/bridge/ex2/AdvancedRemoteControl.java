package bridge.ex2;

public class AdvancedRemoteControl extends Remote{

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
    }
}
