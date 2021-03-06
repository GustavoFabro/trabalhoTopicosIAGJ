package br.unesc.topicos.grc.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

public class FormattedTextFields extends JTextField {
    //somente números
    public FormattedTextFields() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!("" + e.getKeyChar()).matches("[0-9]*\\.?[0-9]*")) {
                    e.consume();
                }
                
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
}
