package com.libqa.pattern.adapter;

/**
 * @Author : yion
 * @Date : 2016. 9. 25.
 * @Description :
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC File. name = " + fileName);

    }

    @Override
    public void playMp4(String fileName) {


    }
}
