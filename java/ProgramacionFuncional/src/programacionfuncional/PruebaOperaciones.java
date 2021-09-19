/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionfuncional;

import interfaces.IOperaciones;

/**
 *
 * @author emarin
 */
public class PruebaOperaciones {
    public static void main(String[] args) {
        IOperaciones suma = (val1,val2) -> val1 + val2;
        int resultado = suma.sumar(5, 3);
        System.out.println("resultado: " + resultado);
    }
}
