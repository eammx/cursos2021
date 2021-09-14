/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionfuncional;

/**
 *
 * @author emarin
 */
public class PruebaLambda {

    public static void main(String[] args) {
        ISaludar saluda = (usuario) -> { System.out.println("Hola " + usuario);};
        saluda.saludar("Ernesto");
    }
}
