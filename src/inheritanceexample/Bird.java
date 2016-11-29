/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author lamon
 */
public class Bird extends Pet{
    
    public Bird(String name, int age, String colour){
        super(name,age,colour);
    }
    
    @Override
    public void speak() {
        System.out.println("TWEET");
    }
    
    public void speak(int numTimes){
        for(int i = 0 ; i < numTimes; i++){
            System.out.print("TWEET");
        }
        System.out.println("");
    }
    
}
