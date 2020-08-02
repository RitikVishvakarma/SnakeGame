package snakegame;
import javax.swing.*;
public class Snake extends JFrame {
    Snake(){
        
        add(new Board());
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String []args){
        
        new Snake().setVisible(true);
    }
}
