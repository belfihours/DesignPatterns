package structural.facade;

import structural.facade.domain.VideoFile;

import java.io.File;

public class AudioMixer {
    public static File fixAudio(VideoFile result) {
        System.out.println("AudioMixer - fixing audio...");
        return new File(result.getName());
    }
}
