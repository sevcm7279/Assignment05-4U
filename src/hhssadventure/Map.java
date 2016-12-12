/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sevcm7279
 */
public class Map {
    
    private ArrayList<Screen> screens;
    private ArrayList startScreen;
    private String location;
    private String direction;
    
    public Map (String fileName){
        // initialize the startScreen array
        startScreen = new ArrayList();
        try {
            // make the scanner for the text file
            Scanner input = new Scanner(new File (fileName));
            // make screens
            // loop to the end of the to first two lines
            for (int i = 0; i < 2; i++) {
                startScreen.add(input.nextLine());
            }
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        screens = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File(fileName));
            while (input.hasNext()){
                Screen s = new Screen(input);
                screens.add(s);
            }
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
    
    public void getStartScreen(){
        
    }
    
    public void getScreen(){
        
    }
}
