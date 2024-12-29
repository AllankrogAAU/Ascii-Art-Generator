import java.awt.image.BufferedImage;
import java.io.IOException;

public interface ImageProcessor {
    BufferedImage loadImage(String path) throws IOException;
    BufferedImage resizeImage(BufferedImage image, int width, int height);
    BufferedImage convertToGreyScale(BufferedImage image);
}
