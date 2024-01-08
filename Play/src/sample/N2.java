package sample;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class N2 extends JFrame {
    private int currentMessageIndex = 0;
    private String[] messages = {
            "こんにちは、冒険者よ。",
            "この先には危険が待ち構えている。",
            "スペースキーを押して次に進もう。"
    };

    public N2() {
        super("RPG Conversation");

        JLabel messageLabel = new JLabel(messages[currentMessageIndex]);
        add(messageLabel);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Not used
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    if (currentMessageIndex < messages.length - 1) {
                        currentMessageIndex++;
                        messageLabel.setText(messages[currentMessageIndex]);
                    } else {
                        dispose();
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Not used
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setFocusable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new N2());
    }
}
