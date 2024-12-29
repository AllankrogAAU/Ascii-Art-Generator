import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BasicImageProcessor implements ImageProcessor {

    @Override
    public BufferedImage loadImage(String path) throws IOException {
        return ImageIO.read(new File(path));
    }

    @Override
    public BufferedImage resizeImage(BufferedImage image, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(image, 0, 0, width, height, null);
        g.dispose();
        return resizedImage;
    }

    @Override
    public BufferedImage convertToGreyScale(BufferedImage image) {
        BufferedImage grayImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        Graphics g = grayImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return grayImage;
    }
}
