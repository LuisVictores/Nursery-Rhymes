/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nursery.rhymes;

/**
 *
 * @author mlarrubia
 */
public class NurseryRhymes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        farm("cow", "moo");
        farm("duck", "quack");        
        farm("chicken", "cluck");
        monkeys(10);
        monkeys(9);
        monkeys(8);
        hickory_dickory(1);
        hickory_dickory(2);
        hickory_dickory(3);
        
        // TODO: call your new methods here ( you must write them first! ) 
        
        
    }
    
    
    
    public static void farm(String animal, String sound){
        System.out.println("Old MacDonald had a farm \n" +
                "e-i-e-i-o \n" +
                "And on that farm he had a " + animal + " \n" +
                "e-i-e-i-o\n" +
                "With a " + sound + " " + sound + " here \n" +
                "And a " + sound + " " + sound + " there \n" +
                "Here a " + sound + ", there a " + sound + " \n" +
                "Everywhere a " + sound + " " + sound + "\n" +
                "Old MacDonald had a farm \n" +
                "e-i-e-i-o");
        System.out.println();
    }
    
    public static void monkeys(int number){
        System.out.println(number + " little monkeys jumping on the bed\n" +
                "One fell off and bumped his head\n" +
                "Mama called the doctor, and the doctor said\n" +
                "\"No more monkeys jumping on the bed!\"");
        System.out.println();
    }
    
    public static void hickory_dickory(int time){
        System.out.println("Hickory dickory dock\n" +
                "The mouse ran up the clock\n" +
                "The clock struck " + time + "\n" +
                "The mouse ran down\n" +
                "Hickory dickory dock");
        System.out.println();
    }
    
    // TODO add your new methods here
    
}