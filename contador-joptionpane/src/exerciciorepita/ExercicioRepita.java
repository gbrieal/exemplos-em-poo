/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, cont=0, npares=0, nimpares=0, n100=0;
        float media;
    do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></br></html>"));
        s += n;
        cont++;
        if (n%2 == 0){
            npares++;
        } else {
            nimpares++;
        } if (n>100) {
            n100++;
    }
    } while (n!=0);
    media = s/(cont-1);
    JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr>" + "<br>Somatório dos números </hmtl>" + s + 
            "<br>Quantidade de números digitados " + (cont-1) +
            "<br>Total de pares " + (npares-1) +
            "<br>Total de ímpares " + nimpares +
            "<br>Total de números acima de 100 " + n100 +
            "<br>Média dos valores " + media +
            " <hr>");
    }   
}
