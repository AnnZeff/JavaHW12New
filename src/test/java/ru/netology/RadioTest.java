package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.PackageUtils;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testRadioKitWithoutParams(){
        Radio radio = new Radio();

        radio.setCurrentChannel(8);

        int expected = 8;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioKitWithParams(){
        Radio radio = new Radio(25);

        radio.setCurrentChannel(20);

        int expected = 20;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentChannel() {
        Radio chan = new Radio();
        chan.setCurrentChannel(5);

        int expected = 5;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void testCurrentChanneParams() {
        Radio chan = new Radio(25);
        chan.setCurrentChannel(3);

        int expected = 3;
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
    public void testCurrentVolumeParams() {
        Radio vol = new Radio(25);
        vol.setCurrentVolume(40);

        int expected = 40;
        int actual = vol.getCurrentVolume();

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
    public void sholdNotCurrentChannelAboveMaxParams() {
        Radio chan = new Radio (25);
        chan.setCurrentChannel(30);

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
    public void shouldNotCurrentChannelLowMinParams() {
        Radio chan = new Radio(25);
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
    public void testMinVolumeParams() {
        Radio vol = new Radio(25);
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
    public void testMaxVolumeParams() {
        Radio vol = new Radio(25);
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
    public void shouldNotCurrentVolumeBeAboveMaxParams() {
        Radio vol = new Radio(25);
        vol.setCurrentVolume(101);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCurrentVolumeBeLowMinParams() {
        Radio vol = new Radio(25);
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
    public void testFromMinChannelToNextParams() {
        Radio chan = new Radio(25);
        chan.setCurrentChannel(0);

        chan.nextChannel();

        int expected = 1;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextChannelParams() {
        Radio chan = new Radio(25);
        chan.setCurrentChannel(1);

        chan.nextChannel();

        int expected = 2;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFromPenultChannelToMaxParams() {
        Radio chan = new Radio(25);
        chan.setCurrentChannel(24);

        chan.nextChannel();

        int expected = 25;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotNextChannelAboveMaxParams() {
        Radio chan = new Radio(25);
        chan.setCurrentChannel(25);
        chan.nextChannel();

        int expected = 0;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevChannelParams() {
        Radio chan = new Radio(25);
        chan.setCurrentChannel(10);
        chan.prevChannel();

        int expected = 9;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFromMaxChannelToPrevParams() {
        Radio chan = new Radio(25);
        chan.setCurrentChannel(25);

        chan.prevChannel();

        int expected = 24;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFromSecondChannelToMinParams() {
        Radio chan = new Radio(25);
        chan.setCurrentChannel(1);

        chan.prevChannel();

        int expected = 0;
        int actual = chan.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotPrevChannelBelowMinParams() {
        Radio chan = new Radio(25);
        chan.setCurrentChannel(-1);
        chan.prevChannel();

        int expected = 25;
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

    @Test
    public void testIncreaseVolumeParams() {
        Radio vol = new Radio(25);
        vol.setCurrentVolume(50);
        vol.increaseVolume();

        int expected = 51;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotAmbitVolumeAboveMaxParams() {
        Radio vol = new Radio(25);
        vol.setCurrentVolume(100);
        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeParams() {
        Radio vol = new Radio(25);
        vol.setCurrentVolume(35);
        vol.decreaseVolume();

        int expected = 34;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotAmbitVolumeLowMinParams() {
        Radio vol = new Radio(25);
        vol.setCurrentVolume(-1);
        vol.decreaseVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}