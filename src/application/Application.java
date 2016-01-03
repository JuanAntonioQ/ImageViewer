package application;

import control.Command;
import control.NextImageCommand;
import control.PrevImageCommand;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import model.Image;
import view.ImageDisplay;


public class Application extends JFrame {
    
    private final Map<String,Command> commands = new HashMap<>();
    
    public static void main(String[] args){
        new Application().setVisible(true);
    }
    
    private ImageDisplay imageDisplay;
    
    public Application(){
        this.deployUI();
        this.createCommands();
    }

    private void deployUI() {
        this.setTitle("Image Viewer");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(500, 500));
        this.setLocationRelativeTo(null);
        this.getContentPane().add(imagePanel());
        this.getContentPane().add(toolbar(), BorderLayout.SOUTH);
    }

    private void createCommands() {
        commands.put("next", new NextImageCommand(imageDisplay));
        commands.put("prev", new PrevImageCommand(imageDisplay));
    }

    private ImagePanel imagePanel() {
        ImagePanel imagePanel = new ImagePanel(image());
        imageDisplay = imagePanel;
        return imagePanel;
    }

    private Image image(){
        return new FileImageReader("C:\\Users\\Public\\Pictures\\Sample Pictures").read();
    }
    
    private Component toolbar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
