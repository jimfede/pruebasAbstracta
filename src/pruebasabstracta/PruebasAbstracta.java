/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasabstracta;

import static java.lang.Integer.parseInt;
import static java.lang.System.console;
import java.util.ArrayList;
import java.util.List;

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
        lstNumeros.add(9);
        lstNumeros.add(8);
        lstNumeros.add(7);
        List<Integer> lstNumeros2 = new ArrayList<>();
        lstNumeros2.add(4);
        lstNumeros2.add(4);
        lstNumeros2.add(4);
        lstNumeros2.add(4);
        lstNumeros2.add(4);

        System.out.println(sumaFor(lstNumeros));
        System.out.println(sumaWhile(lstNumeros));
        System.out.println(sumaRecursive(lstNumeros));
        System.out.println(altElem(lstNumeros, lstNumeros2));
    }

// Problem 1
    public static Integer sumaFor(ArrayList<Integer> lstNumeros) {
        int resultado = 0;
        for (Integer i = 0; i < lstNumeros.size(); i++) {
            resultado += lstNumeros.get(i);
        }
        return resultado;
    }

    public static Integer sumaWhile(ArrayList<Integer> lstNumeros) {
        int resultado = 0;
        int i = 0;
        while (i < lstNumeros.size()) {
            resultado += lstNumeros.get(i);
            i++;
        }
        return resultado;
    }

    public static Integer sumaRecursive(List<Integer> lstNumeros) {
        if (lstNumeros.isEmpty() == true) {
            return 0;
        } else {
            return lstNumeros.get(0) + sumaRecursive(lstNumeros.subList(1, lstNumeros.size()));
        }
    }

    // Problem 2
    public static List altElem(List lst1, List lst2) {
        List<Integer> lstRes = new ArrayList<>();
        int lsize;
        List<Integer> lst1end = new ArrayList<>();
        List<Integer> lst2end = new ArrayList<>();
        if (lst1.size() > lst2.size()) {
            lsize = lst2.size();
            lst1end = lst1.subList(lsize, lst1.size());
        } else {
            lsize = lst1.size();
            lst2end = lst2.subList(lsize, lst2.size());
        }
        for (int i = 0; i < lsize; i++) {
            lstRes.add((Integer) lst1.get(i));
            lstRes.add((Integer) lst2.get(i));
        }
        if (lst1.size() > lst2.size()) {
            lstRes.addAll(lst1end);
        } else {
            lstRes.addAll(lst2end);
        }
        return lstRes;
    }
}
