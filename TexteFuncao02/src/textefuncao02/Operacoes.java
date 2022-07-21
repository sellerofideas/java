/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textefuncao02;

/**
 *
 * @author ideapad 330 81fe002b
 */
public class Operacoes {
    
    public static String contador(int i, int f) {
        String s = "";
        for (int c = i; c<= f; c++) {
            s += c + "";
        }
        return s;
    }
    
}

/* Public, Private e protected são MODIFICADORES DE ACESSO que indica qual é o 
* tipo de acesso que o método terá.
*PUBLIC torna o on=bjeto publico, permitindo o acesso de vários outros 
* lugares e pastas do codigo.
*PRIVATE torna o acesso ao método privado. Com ele só podemos trabalhar com ele
* dentro do bloco de código.
*PROTECT permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo.
*
* STATIC permite utilizar um objeto sem precisar instancia-lo/ cria-lo.
*
* VOID indica que o método não vai retornar um valor.
*
* MAIN indica um método proncipal, ou seja, será executado primeiro 
*e de depois execultará os outros. 
*/