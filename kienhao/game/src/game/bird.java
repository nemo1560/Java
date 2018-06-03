    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author MUP
 */
public class bird extends JPanel{

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    private static int y=200;
    
    public void paint(Graphics ve){
        ve.setColor(Color.red);
        ve.fillRect(50, getY(), 20, 20);
    }
    public void tangY(){
        y++;
    }
    public void giamY(){
        y-=30;
    }

}
