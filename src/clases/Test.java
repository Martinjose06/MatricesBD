/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author mzuleta4
 */
public class Test {
    public static void main(String[] args) {
        int m[][]=new int[5][5];
        m[0][0]=1;
        m[0][1]=2;
        m[0][2]=3;
        m[0][3]=4;
        m[0][4]=5;
        m[1][0]=5;
        m[1][1]=6;
        m[1][2]=7;
        m[1][3]=8;
        m[1][4]=6;
        m[2][0]=9;
        m[2][1]=2;
        m[2][2]=1;
        m[2][3]=10;
        m[2][4]=7;
        m[3][0]=4;
        m[3][1]=3;
        m[3][2]=5;
        m[3][3]=7;
        m[3][4]=1;
        m[4][0]=3;
        m[4][1]=7;
        m[4][2]=7;
        m[4][3]=9;
        m[4][4]=9;
        
        
        
        //System.out.println(Helper.recorridoHaciaDerecha(m, 1));
       // System.out.println(Helper.recorridoHaciaIzquierda(m, 0));
       // System.out.println(Helper.recorridoDiagonalPrincipalArriba(m));
        //System.out.println(Helper.recorridoDiagonalSecundariaAbajo(m));
       // System.out.println(Helper.recorridoDiagonalSecundariaArriba(m));
        System.out.println(Helper.recorridoTres(m));
    }
}
