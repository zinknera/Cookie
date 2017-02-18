/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookie;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class ConsumerThread implements Runnable {

    myStapel stapel;

    public ConsumerThread(myStapel stapel) {
        this.stapel = stapel;
    }

    @Override
    public void run() {
        while (true) {
            try {
//                Thread.sleep(1000);
                eat();
            } catch (Exception e) {
                System.out.println("hab keinen bekommen!!!");
            }

        }
    }

    synchronized public void eat() throws Exception {
        if (stapel.getSize() > 0) {
            stapel.pull().eat();
        }
    }

}
