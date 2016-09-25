package com.libqa.pattern.adapter;

/**
 * @Author : yion
 * @Date : 2016. 9. 25.
 * @Description :
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. name : " + fileName);
    }
}
