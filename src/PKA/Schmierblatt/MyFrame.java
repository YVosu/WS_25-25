package PKA.Schmierblatt;

import javax.swing.*;

public class MyFrame extends JFrame {

    JButton myButton = new JButton("MY BUTTON");

    MyFrame() {

        myButton.setBounds(100, 100, 200, 100);
        myButton.addActionListener((e) -> System.out.println("You clicked a button!"));

        this.add(myButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);

    }
}
