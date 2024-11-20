package ru.netology;

public class Radio {
    private int currentChannel;

    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMinChannel() {
        currentChannel = 0;
    }

    public void setMaxChannel() {
        currentChannel = 9;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setMaxVolume() {
        currentVolume = 100;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0) {
            return;
        }

        if (newCurrentChannel > 9) {
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
       // if (currentChannel >= 0) {
            currentChannel = currentChannel + 1;
       // }
        if (currentChannel > 9) {
            setMinChannel();
        }

    }

    public void prevChannel() {
       // if (currentChannel <= 9) {
            currentChannel = currentChannel - 1;
      //  }
        if (currentChannel < 0) {
            setMaxChannel();
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
