package structural.facade;

import structural.facade.domain.Codec;
import structural.facade.domain.VideoFile;

import java.io.File;

public class VideoConversionFacade {
    public File conertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade - conversion started.");
        VideoFile videoFile = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(videoFile);
        Codec destinationCodec = CodecFactory.extract(format);
        VideoFile buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile converted = BitrateReader.convert(buffer, destinationCodec);
        File result = AudioMixer.fixAudio(converted);

        System.out.println("VideoConversionFacade - conversion completed.");
        return result;
    }

}
