/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bocadohumansensor;

import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class BocadoHumanSensor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String name = JOptionPane.showInputDialog("Enter name:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
        
        validationSensor person = new validationSensor(name, age);
        person.isAdult();
        
    }
    
}
