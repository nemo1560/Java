/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;



import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author MUP
 */
public class Game extends JFrame implements MouseListener{
    mainframe main = new mainframe();
    bird fly = new bird();
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Game(){
        setSize(500, 500);
        setLocation(300, 200);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(main);
        addMouseListener(this);
        main.th.start(); //cach viet thread t2
    }
    
    public static void main(String[] args) {
        Game game = new Game();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
                fly.giamY();
    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {
 
    }
}
