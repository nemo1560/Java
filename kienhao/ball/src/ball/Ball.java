/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ball;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author MUP
 */
public class Ball extends JFrame implements Runnable, MouseListener{
    private Thread luong;
    private float x=50;
    private float y=50;
    private boolean b=true;
    @SuppressWarnings("LeakingThisInConstructor")
    public Ball() {
        setSize(300, 300);
        setLocation(50, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        luong(new Thread(this));
        addMouseListener(this);
        
    }
   
    @Override
    public void paint(Graphics g){
        super.paint(g); //gọi lại phương thức paint.
        //g.drawRect(x, y, 20, 20);
        g.drawRoundRect((int)x, (int)y, 30, 30, 50, 50);
    }
    public void update(){
        if(land()==true){
            y++;
        }
            
    }
    public boolean land(){
        if(y >= 260){
            for(int i =1; i<=5;i++){
                y=40;
            }
        }
        return b;
    }
    public static Thread luong(Thread thread){
        thread.start();
        return thread;
    }
   
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args) {
        new Ball();
        
    }

    @Override
    @SuppressWarnings("static-access")
    public void run() {
        while (true) {
            try {
                luong.sleep(5);
                repaint();
                update();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
