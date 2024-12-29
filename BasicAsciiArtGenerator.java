
import java.awt.image.BufferedImage;

public class BasicAsciiArtGenerator implements AsciiArtGenerator {

    private final String asciiChars = "@#S%?*+;:,. ";

    @Override
    public String generateAsciiArt(BufferedImage image) {
        StringBuilder asciiArt = new StringBuilder();
        int width = image.getWidth();
        int height = image.getHeight();
        int levels = asciiChars.length();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = image.getRGB(x, y) & 0xFF;
                int charIndex = (rgb * (levels - 1)) / 255;
                asciiArt.append(asciiChars.charAt(charIndex));
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}
