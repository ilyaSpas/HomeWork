package org.example;

import javax.swing.*;
import java.awt.*;

public class Chat extends JPanel {
    private JTextArea textArea;
    Chat() {
        textArea = new JTextArea(20,35);
        add(textArea);
    }

    public void sendMSG(String msg){
        String oldText = textArea.getText();
        oldText = oldText + "\n" + msg;
        textArea.setText(oldText);
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g) {
    }
}
