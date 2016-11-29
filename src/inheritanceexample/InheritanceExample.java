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
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 7, "White");
        Cat cat = new Cat("Fluffy" , 5, "Black" , 9);
        Cat cat2 = new Cat("Spike" , 2, "Brown" , 9);
        Dog dog2 = new Dog("Gidget", 1, "Brindle");
        
        Pet[] pets = {dog, cat, dog2, cat2};
        
        // go through each pet in the array
        for(Pet pet: pets){
            // prints out the pet
            System.out.println(pet);
            
            // checking if the pet is actually a cat
            if(pet instanceof Cat){
                // change the pet back into a Cat (cast)
                Cat c = (Cat)pet;
                System.out.println("This is a cat with " 
                        + c.getLives() + " lives");
            }
        }
        
        
    }
    
}
