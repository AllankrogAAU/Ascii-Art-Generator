import java.awt.*;
import javax.swing.*;

public class AsciiArtDisplayFrame extends JFrame {

    public AsciiArtDisplayFrame(String asciiArt) {
        setTitle("ASCII Art Display");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea textArea = new JTextArea(asciiArt);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 8));
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
    }
}
