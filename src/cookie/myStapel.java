/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookie;

import java.util.Stack;

/**
 *
 * @author alex
 */
public class myStapel {
    private static Stack stack = new Stack();

    public myStapel() {
    
    }
    public void push(Cookie c){
        stack.push(c);
        
        
    }
    public Cookie pull(){
        return ((Cookie)stack.pop());
    }
    public int getSize(){
        return stack.size();
    }
    
}
