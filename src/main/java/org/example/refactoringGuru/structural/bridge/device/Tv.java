package org.example.refactoringGuru.structural.bridge.device;

public class Tv implements Device {
    private boolean on;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "volume=" + volume +
                ", channel=" + channel +
                ", enabled=" + isEnabled() +
                '}';
    }
}
