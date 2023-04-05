/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package header.first.design.patterns.chapter2.javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("should i do it?");
//        button.addActionListener(new AngleListener());
//        button.addActionListener(new DevilListener());

            
        // lamda expression
        button.addActionListener(event->System.out.println("Don't do it, u might regret it!"));
        button.addActionListener(event->System.out.println("come on, do it"));
        
        
        frame.add(button);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class AngleListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, u might regret it!");
        }

    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("come on, do it");
        }

    }

}
