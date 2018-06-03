/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author MUP
 */
public class check {
    bird bird = new bird();
    tunner tunner = new tunner();
    mainframe mainframe = new mainframe();

    @SuppressWarnings("CallToThreadStopSuspendOrResumeManager")
    public check() {
        if(bird.getX()==tunner.getX1()){
            mainframe.th.stop();
        }
    } 
}
