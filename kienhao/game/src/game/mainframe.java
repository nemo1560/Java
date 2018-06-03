/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author MUP
 */
public class mainframe extends JPanel implements Runnable{
    bird bird = new bird();
    tunner tunner = new tunner();
    Thread th = new Thread(this);
    @SuppressWarnings("CallToThreadStartDuringObjectConstruction")
    /*public mainframe(){
        th.start();
    }*/ //cach viet thread t1.
    
    @Override
    public void paint(Graphics ve){
        ve.setColor(Color.cyan);
        ve.fillRect(0,0, getWidth(), getHeight());
        tunner.paint(ve);
        ve.setColor(Color.green);
        ve.fillRect(0, 400, getWidth(), getHeight());
        ve.setColor(Color.yellow);
        ve.fillRect(0, 410, getWidth(), getHeight());
        bird.paint(ve);
    }

    @Override
    @SuppressWarnings({"static-access", "ResultOfObjectAllocationIgnored"})
    public void run() {
        while (true) {            
          repaint();
          tunner.giamX();
            try {
                th.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
            }
            tunner.laplai();
            bird.tangY();
            if(bird.getY()==0||bird.getY()>=380||bird.getY()==tunner.getH1()||bird.getY()+20==tunner.getH1()+100||bird.getY()==tunner.getH2()||bird.getY()+20==tunner.getH2()+100||bird.getY()==tunner.getH3()||bird.getY()+20==tunner.getH3()+100||bird.getY()==tunner.getH4()||bird.getY()+20==tunner.getH4()+100){
                th.stop();
            }
        }
    }
    
}
