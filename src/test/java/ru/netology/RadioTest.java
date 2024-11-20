package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.PackageUtils;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testCurrentChannel() {
        Radio chan = new Radio();
        chan.setCurrentChannel(5);

        int expected = 5;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testCurrentVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(35);

        int expected = 35;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxChannel() {
        Radio chan = new Radio();
        chan.setMaxChannel();

        int expected = 9;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinChannel() {
        Radio chan = new Radio();
        chan.setMinChannel();

        int expected = 0;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCurrentChannelBeAboveMax() {
        Radio chan = new Radio();
        chan.setCurrentChannel(10);

        int expected = 0;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCurrentChannelBeLowMin() {
        Radio chan = new Radio();
        chan.setCurrentChannel(-1);

        int expected = 0;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinVolume() {
        Radio vol = new Radio();
        vol.setMinVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxVolume() {
        Radio vol = new Radio();
        vol.setMaxVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCurrentVolumeBeAboveMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(101);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCurrentVolumeBeLowMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testFromMinChannelToNext() {
        Radio chan = new Radio();
        chan.setCurrentChannel(0);

        chan.nextChannel();

        int expected = 1;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextChannel() {
        Radio chan = new Radio();
        chan.setCurrentChannel(3);

        chan.nextChannel();

        int expected = 4;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFromPenultChannelToMax() {
        Radio chan = new Radio();
        chan.setCurrentChannel(8);

        chan.nextChannel();

        int expected = 9;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotNextChannelAboveMax() {
        Radio chan = new Radio();
        chan.setCurrentChannel(9);
        chan.nextChannel();

        int expected = 0;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevChannel() {
        Radio chan = new Radio();
        chan.setCurrentChannel(5);
        chan.prevChannel();

        int expected = 4;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFromMaxChannelToPrev() {
        Radio chan = new Radio();
        chan.setCurrentChannel(9);

        chan.prevChannel();

        int expected = 8;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFromSecondChannelToMin() {
        Radio chan = new Radio();
        chan.setCurrentChannel(1);

        chan.prevChannel();

        int expected = 0;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotPrevChannelBelowMin() {
        Radio chan = new Radio();
        chan.setCurrentChannel(-1);
        chan.prevChannel();

        int expected = 9;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(50);
        vol.increaseVolume();

        int expected = 51;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotAmbitVolumeAboveMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(35);
        vol.decreaseVolume();

        int expected = 34;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotAmbitVolumeLowMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(-1);
        vol.decreaseVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}