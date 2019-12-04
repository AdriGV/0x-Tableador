/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;





/**
 *
 * @author CicloM
 */
public final class UtilesBasesNum {
    
   public static final int binADec(String numero) {
        return Integer.parseInt(numero, 2);
    }

    public static final String decABin(int numero) {
        return Integer.toBinaryString(numero);
    }

    public static final String hexADec(String numero) {
        return String.valueOf(Integer.parseInt(numero, 16));
    }

    public static final String decAHex(int numero) {
        return Integer.toHexString(numero);
    }

    public static final int octADec(String numero) {
        return Integer.parseInt(numero, 8);
    }

    public static final String decAOct(int numero) {
        return Integer.toOctalString(numero);
    }
}
