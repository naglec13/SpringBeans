package screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Service
@Scope("prototype")
public class ColorFrame extends JFrame {
    @Autowired
    private Color color;

    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace(){
        Random random = new Random();
        setLocation(random.nextInt(1700),random.nextInt(800));
        getContentPane().setBackground(color);
        repaint();
    }
}
