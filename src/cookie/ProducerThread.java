/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookie;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class ProducerThread implements Runnable{
    Random rand = new Random();

    myStapel stapel;
    int cooliesPerSecond = 4;

    public ProducerThread(myStapel stapel) {
        this.stapel = stapel;
    }
    @Override
    public void run() {
        
        while (true) {  
            
            try {
//                Thread.sleep(1000/(rand.nextInt(cooliesPerSecond-1)+1));
                produce();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerThread.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
                System.out.println("cannot produce!");
            }
        }
    }
    
    synchronized public void produce() throws Exception{ 
        if(stapel.getSize() <=30)
            stapel.push(new Cookie());
        
    }
    
}
