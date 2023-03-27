package net.harunote.pattern.adapter;

/**
 * @Author : yion
 * @Date : 2016. 9. 25.
 * @Description :
 */
public class AdapterPatternApp {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();


        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
