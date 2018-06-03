/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author MUP
 */
public class tunner extends JPanel{

    /**
     * @return the x1
     */
    public int getX1() {
        return x1;
    }

    /**
     * @return the x2
     */
    public int getX2() {
        return x2;
    }

    /**
     * @return the x3
     */
    public int getX3() {
        return x3;
    }

    /**
     * @return the x4
     */
    public int getX4() {
        return x4;
    }

    /**
     * @return the h1
     */
    public int getH1() {
        return h1;
    }

    /**
     * @return the h2
     */
    public int getH2() {
        return h2;
    }

    /**
     * @return the h3
     */
    public int getH3() {
        return h3;
    }

    /**
     * @return the h4
     */
    public int getH4() {
        return h4;
    }
    
    private int x1=100,x2=x1+120,x3=x2+130,x4=x3+150; /*x: theo chiều ngang,
                                                               y  theo chiều dọc*/
    private int h1,h2,h3,h4;
    private static boolean b1=true,b2=true,b3=true,b4=true;

    public void paint(Graphics ve){
        random();
        ve.setColor(Color.green);
        ve.fillRect(getX1(), 0, 50, getH1());
        ve.setColor(Color.green);
        ve.fillRect(getX1(), getH1()+100, 50, 500); //+100 để tạo khoảng trống cho chim bay
        
        ve.setColor(Color.green);
        ve.fillRect(getX2(), 0, 50, getH2());
        ve.setColor(Color.green);
        ve.fillRect(getX2(), getH2()+100, 50, 500);
        
        ve.setColor(Color.green);
        ve.fillRect(getX3(), 0, 50, getH3());
        ve.setColor(Color.green);
        ve.fillRect(getX3(), getH3()+100, 50, 500);
        
        ve.setColor(Color.green);
        ve.fillRect(getX4(), 0, 50, getH4());
        ve.setColor(Color.green);
        ve.fillRect(getX4(), getH4()+100, 50, 500);
    }
    public void giamX(){
        x1--;
        x2--;
        x3--;
        x4--;
    }
    public void tangX(){
        x1++;
        x2++;
        x3++;
        x4++;
    }
    public void laplai(){
        if(getX1()== -50){
            x1=500;
            b1=true;
        }
        if(getX2()== -50){
            x2=500;
            b2=true;
        }
        if(getX3()== -50){
            x3=500;
            b3=true;
        }
        if(getX4()== -50){
            x4=500;
            b4=true;
        }
    }
    public void random(){
        Random rd = new Random();
        if(b1==true){
            h1= rd.nextInt(200);
            b1=false;
        }
        if(b2==true){
            h2= rd.nextInt(200);
            b2=false;
        }
        if(b3==true){
            h3= rd.nextInt(200);
            b3=false;
        }
        if(b4==true){
            h4= rd.nextInt(200);
            b4=false;
        }
    }
}
