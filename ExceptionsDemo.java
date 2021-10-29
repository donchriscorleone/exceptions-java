/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christopherii
 */
public class ExceptionsDemo {
    public static void show() {
        try {
            FileReader reader = new FileReader("text.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExceptionsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
