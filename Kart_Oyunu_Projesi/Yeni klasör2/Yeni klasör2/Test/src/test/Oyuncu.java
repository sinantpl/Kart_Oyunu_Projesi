/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mertcan
 */

public class Oyuncu {
    private String oyuncuID;
    private String oyuncuAdı;
    private int skor;
    static String a1,a2,a3,a4,a5,a6,a7,a8;
    static String b1,b2,b3,b4,b5,b6,b7,b8;
    
    public static void KartListesi(){
        String[] futbol = new String[8];
        futbol[0]=a1;
        futbol[1]=a2;
        futbol[2]=a3;
        futbol[3]=a4;
        futbol[4]=a5;
        futbol[5]=a6;
        futbol[6]=a7;
        futbol[7]=a8;
        String[] basket=new String[8];
        basket[0]=b1;
        basket[1]=b2;
        basket[2]=b3;
        basket[3]=b4;
        basket[4]=b5;
        basket[5]=b6;
        basket[6]=b7;
        basket[7]=b8;
        
    }
    
    
    public Oyuncu(String oyuncuID,String oyuncuAdı,int skor){
        this.oyuncuID=oyuncuID;
        this.oyuncuAdı=oyuncuAdı;
        this.skor=skor;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public void setOyuncuAdı(String oyuncuAdı) {
        this.oyuncuAdı = oyuncuAdı;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public String getOyuncuAdı() {
        return oyuncuAdı;
    }

    public int getSkor() {
        return skor;
    }
    
            
}
