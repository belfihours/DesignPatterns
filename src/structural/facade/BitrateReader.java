package structural.facade;

import structural.facade.domain.Codec;
import structural.facade.domain.VideoFile;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader - reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile file, Codec codec) {
        System.out.println("BitrateReader - converting file...");
        return file;
    }
}
