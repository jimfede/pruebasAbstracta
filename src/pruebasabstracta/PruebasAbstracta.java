/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasabstracta;

import static java.lang.Integer.parseInt;
import static java.lang.System.console;
import java.util.ArrayList;

/**
 *
 * @author SALTI002
 */
public class PruebasAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> lstNumeros = new ArrayList<>();
        lstNumeros.add(5);
        lstNumeros.add(1);
        lstNumeros.add(1);

        System.out.println(suma(lstNumeros));
//        numeros = System.console().readLine();
//        suma(numeros);
    }

    public static Integer sumaFor(ArrayList<Integer> lstNumeros) {
        int resultado = 0;
        for (Integer i = 0;  i < lstNumeros.size(); i++) {
            resultado += lstNumeros.get(i);
        }
        return resultado;
    }
    
    public static Integer sumaWhile(ArrayList<Integer> lstNumeros){
        int resultado = 0;
        while (){
        
        }
        return resultado;
    }

}
