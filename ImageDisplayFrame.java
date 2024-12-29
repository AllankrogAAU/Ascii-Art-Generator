import java.awt.image.BufferedImage;
import javax.swing.*;

public class ImageDisplayFrame extends JFrame {

    public ImageDisplayFrame(BufferedImage image) {
        setTitle("Image Display");
        setSize(image.getWidth(), image.getHeight());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel(new ImageIcon(image)));
    }
}
