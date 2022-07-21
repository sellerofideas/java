/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author ideapad 330 81fe002b
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //CONDIÇÃO SIMPLES
        Scanner teclado = new Scanner(System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Parabéns pequeno Gafanhoto! A média é: "+ m);
    }
    
}

/*CONDIÇÃO COMPOSTA

*int nasc = telclado.netxt();
*    int i = 2021 - nasc;
*    if (i>=18){
*   System.out.println("Maior");
*        }else {
*System.out.println("Menor")
*}
*}
*/

/*CONDIÇÃO COMPOSTA ENCADEADA/ANINHADA

*int nasc = teclado.nextInt();
*int i = 2021 - nasc;
*if((i<=16 && i<18)|| (i>70)){
*    System.out.println("Opcional");
*        }else{
*    System.out.println("Obrigatório");
*        }
*/