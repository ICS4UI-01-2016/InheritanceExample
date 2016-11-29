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
public class Dog extends Pet{
    
    public Dog(String name, int age, String colour){
        // a call to the Pet constructor
        super(name, age, colour);
    }
    
    @Override
    public String toString(){
       String output = "Dog-> Name: " + this.getName() 
               + "  Age: " + this.getAge() 
               + "   Colour: " + this.getColour(); 
       return output;
    }
}
