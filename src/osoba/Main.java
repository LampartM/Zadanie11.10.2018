/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoba;

/**
 *
 * @author Maciek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Osoba[] tab = new Osoba[6];
         
         tab[0] = new Piekarz("Andrzej ", "Kowalski", 30);
         tab[1] = new Nauczyciel("Bogdan", "Zbyszewski", 77);
         tab[2] = new Murarz("Janusz", "Nowak", 55);
         tab[3] = new Mechanik("Mirek", "Mechanik", 60);
         
         
         for(int i=0; i<4; i++)
         {
             System.out.println(tab[i].PokazDane());
         }
        
    }
    
}
