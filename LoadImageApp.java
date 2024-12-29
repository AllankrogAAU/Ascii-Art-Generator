import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class LoadImageApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageProcessor processor = new BasicImageProcessor();
            AsciiArtGenerator asciiGenerator = new BasicAsciiArtGenerator();

            try {
                BufferedImage img = processor.loadImage("input.png");
                BufferedImage resizedImg = processor.resizeImage(img, 200, 100);
                BufferedImage grayscaleImg = processor.convertToGreyScale(resizedImg);

                String asciiArt = asciiGenerator.generateAsciiArt(grayscaleImg);

                //JFrame imageFrame = new ImageDisplayFrame(grayscaleImg);
                //imageFrame.setVisible(true);

                JFrame asciiFrame = new AsciiArtDisplayFrame(asciiArt);
                asciiFrame.setVisible(true);

            } catch (IOException e) {
                System.err.println("Error loading or processing image: " + e.getMessage());
            }
        });
    }
}
