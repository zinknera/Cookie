/*
 * To change this license header, choose License Headers in Project Properties.a
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookie;

import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class CookieMain {

    myStapel stapel = new myStapel();
    ConsumerThread cons;
    ProducerThread prod;
    

    public static void main(String[] args) {
        CookieMain obj = new CookieMain();
        obj.start();
    }

    private void start() {
        Cookie c = new Cookie();
        
        cons = new ConsumerThread(stapel);
        prod = new ProducerThread(stapel);
        
        Thread p1 = new Thread(prod);
        
        
        Thread c1 = new Thread(cons);
        Thread c2 = new Thread(cons);
        Thread c3 = new Thread(cons);
        
        p1.start();
        c1.start();
        c2.start();
        c3.start();
        
        System.out.println("fertig");
    }
}
