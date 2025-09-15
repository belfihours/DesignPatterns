package structural.facade;

import structural.facade.domain.Codec;
import structural.facade.domain.MP4CompressionCodec;
import structural.facade.domain.OggCompressionCodec;
import structural.facade.domain.VideoFile;

public class CodecFactory {
    public static Codec extract(VideoFile file){
        var type = file.getCodecType();
        return switch (type){
            case "mp4" -> new MP4CompressionCodec();
            case "ogg" -> new OggCompressionCodec();
            default -> throw new UnsupportedOperationException();
        };
    }

    public static Codec extract(String format){
        return switch (format){
            case "mp4" -> new MP4CompressionCodec();
            case "ogg" -> new OggCompressionCodec();
            default -> throw new UnsupportedOperationException();
        };
    }
}
