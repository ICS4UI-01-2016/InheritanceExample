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
public class Cat extends Pet{
    
    private int lives;
    
    public Cat(String name, int age, 
            String colour, int lives){
        // calling the Pet constructor
        super(name, age, colour);
        // saving cat specific variables
        this.lives = lives;
    }
    
    public int getLives(){
        return this.lives;
    }
    
    @Override
    public String toString(){
       String output = "Cat-> Name: " + this.getName() 
               + "   Age: " + this.getAge() 
               + "   Colour: " + this.getColour()
               + "   Lives: " + this.lives; 
       return output;
    }
}
