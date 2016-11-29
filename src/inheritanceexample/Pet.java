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
public abstract class Pet {
    private String name;
    private int age;
    private String colour;
    
    
    public Pet(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getColour(){
        return this.colour;
    }
    
    public int getAge(){
        return this.age;
    }
    
    
    public abstract void speak();
    
}
