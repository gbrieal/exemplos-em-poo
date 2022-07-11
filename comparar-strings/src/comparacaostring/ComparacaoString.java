/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author DELL
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String n1 = "Gabriel";
    String n2 = "Gabriel";
    String n3 = new String("Gabriel");
    String res;
    
    res = (n1.equals(n3))?"igual":"diferente";
    
        System.out.println(res);
    
    }
    
}
