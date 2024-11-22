package ru.netology;

public class Radio {
    private int currentChannel;

    private int currentVolume;

    private int minChannel = 0;

    private int maxChannel;


    public Radio() {

        this.maxChannel = 9;
    }

    public Radio(int channelCount) {
        this.maxChannel = channelCount;

    }

    public int getCurrentChannel() {
        return currentChannel;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setMaxVolume() {
        currentVolume = 100;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < minChannel) {
            return;
        }

        if (newCurrentChannel > maxChannel) {
            return;
        }

        currentChannel = newCurrentChannel;

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }

        if (newCurrentVolume > 100) {
            return;
        }

        currentVolume = newCurrentVolume;
    }


    public void nextChannel() {
        if (currentChannel != maxChannel) {
            currentChannel++;
            return;
        } else {
            currentChannel = minChannel;
            return;
        }


    }

    public void prevChannel() {
        if (currentChannel != minChannel) {
            currentChannel --;
            return;
        } else {
            currentChannel = maxChannel;
            return;
        }
    }

    public void increaseVolume() {
        currentVolume = currentVolume + 1;

        if (currentVolume >= 100) {
            setMaxVolume();
        }


    }

    public void decreaseVolume() {
        currentVolume = currentVolume - 1;

        if (currentVolume <= 0) {
            setMinVolume();
        }
    }


}
