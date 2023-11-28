package org.example.refactoringGuru.structural.bridge.remote;

import org.example.refactoringGuru.structural.bridge.device.Device;

public class BasicRemote implements Remote {
    private final Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
