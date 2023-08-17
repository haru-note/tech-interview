package net.harunote.pattern.adapter;

/**
 * @Author : CodeVillains
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
