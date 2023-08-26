package pl.makalous.biggertest.adapter;

import org.springframework.beans.factory.annotation.Autowired;

public class Adapter implements UserMusicAdapter {
    private final PlayMusic playMusic;

    @Autowired
    Adapter(PlayMusic playMusic) {
        this.playMusic = playMusic;
    }

    @Override
    public void doSomethingFunny(MusicFormat format, String title) {
        switch (format) {
            case MP3:
                playMusic.doSomethingMP3(title);
            case MP4:
                playMusic.doSomethingMP4(title);
            default:
                //WAV
                playMusic.doSomethingMAV(title);
        }
    }
}
