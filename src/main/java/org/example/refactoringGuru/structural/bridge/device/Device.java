package org.example.refactoringGuru.structural.bridge.device;

public interface Device {//could be abstract class
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);
}
