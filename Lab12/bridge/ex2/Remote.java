package bridge.ex2;

public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if (device.isEnabled())
            device.disable();
        else
            device.enable();
    }

    public void volumeUp(){
        device.setVolume(device.getVolume() + 10);
    }

    public void volumeDown(){
        device.setVolume(device.getVolume() - 10);
    }

    public void channelUp(){
        device.setChanel(device.getChanel() + 1);
    }

    public void channelDown(){
        device.setChanel(device.getChanel() - 1);
    }
}

