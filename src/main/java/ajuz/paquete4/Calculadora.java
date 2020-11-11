/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajuz.paquete4;

/**
 *
 * @author adolfo.urrutia
 */
public class Calculadora {
    public Double procesar(TipoOperacion tipoOperacion, Double operando1, Double operando2){
        return tipoOperacion.calcular(operando1, operando2);
    }
}
