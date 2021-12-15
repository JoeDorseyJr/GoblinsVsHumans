import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    static final int SPRITE_SIZE = 32;

    GamePanel(){}

    public void gameStart(){}
    public void paintComponent(Graphics g){}
    public void draw(Graphics g){}
    public void move(){}
    public void checkCollide(){}
    public void gameOver(Graphics g){}

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
