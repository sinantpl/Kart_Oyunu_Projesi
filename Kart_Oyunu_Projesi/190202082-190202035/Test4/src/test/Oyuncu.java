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
    static int FM1,FM2,FM3,FR1,FR2,FR3,FN1,FN2,FN3,FS1,FS2,FS3,FRa1,FRa2,FRa3,FH1,FH2,FH3,FL1,FL2,FL3,FP1,FP2,FP3;
    static int BL1,BL2,BL3,BS1,BS2,BS3,BK1,BK2,BK3,BKD1,BKD2,BKD3,BJ1,BJ2,BJ3,BB1,BB2,BB3,BA1,BA2,BA3,BKL1,BKL2,BKL3;
    
    public static String KartListesi(int x,String spor){
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
        if (spor.equals("futbol")) {
            return futbol[x];
        }
        else if (spor.equals("basketbol")) {
            return basket[x];
        }
        return null;
        }
    public static int SkorGoster(String spor,int x,String y){
        
        if (spor.equals("futbol")) {
            if (y.equals("Penaltı")) {
                
                if (KartListesi(x,"futbol").equals("Messi")) {
                    return FM1;
                }
                if(KartListesi(x,"futbol").equals("Ronaldo")){
                    return FR1;
                }
               if (KartListesi(x,"futbol").equals("Neymar")) {
                    return FN1;
                }
                 if (KartListesi(x,"futbol").equals("Salah")) {
                    return FS1;
                }
                 if (KartListesi(x,"futbol").equals("Ramos")) {
                    return FRa1;
                }
                if(KartListesi(x,"futbol").equals("Haaland")){
                    return FH1;
                }
                 if (KartListesi(x,"futbol").equals("Lukaku")) {
                    return FL1;
                }
                 if (KartListesi(x,"futbol").equals("Pogba")) {
                    return FP1;
                }
            }
             if (y.equals("Serbest Vurus")) {
                 if (KartListesi(x,"futbol").equals("Messi")) {
                    return FM2;
                }
                if(KartListesi(x,"futbol").equals("Ronaldo")){
                    return FR2;
                }
               if (KartListesi(x,"futbol").equals("Neymar")) {
                    return FN2;
                }
                 if (KartListesi(x,"futbol").equals("Salah")) {
                    return FS2;
                }
                 if (KartListesi(x,"futbol").equals("Ramos")) {
                    return FRa2;
                }
                if(KartListesi(x,"futbol").equals("Haaland")){
                    return FH2;
                }
                 if (KartListesi(x,"futbol").equals("Lukaku")) {
                    return FL2;
                }
                 if (KartListesi(x,"futbol").equals("Pogba")) {
                    return FP2;
                }
            }
            if (y.equals("Kaleciyle Karşı Karşıya")) {
                if (KartListesi(x,"futbol").equals("Messi")) {
                    return FM3;
                }
                if(KartListesi(x,"futbol").equals("Ronaldo")){
                    return FR3;
                }
               if (KartListesi(x,"futbol").equals("Neymar")) {
                    return FN3;
                }
                 if (KartListesi(x,"futbol").equals("Salah")) {
                    return FS3;
                }
                 if (KartListesi(x,"futbol").equals("Ramos")) {
                    return FRa3;
                }
                if(KartListesi(x,"futbol").equals("Haaland")){
                    return FH3;
                }
                 if (KartListesi(x,"futbol").equals("Lukaku")) {
                    return FL3;
                }
                 if (KartListesi(x,"futbol").equals("Pogba")) {
                    return FP3;
                }
            }
        }
        else if (spor.equals("basketbol")) {
            if(y.equals("İkilik")){
                if (KartListesi(x,"basketbol").equals("Lebron James")) {
                    return BL1;
                }
                if(KartListesi(x,"basketbol").equals("Stephen Curry")){
                    return BS1;
                }
               if (KartListesi(x,"basketbol").equals("Kyrie Irving")) {
                    return BK1;
                }
                 if (KartListesi(x,"basketbol").equals("Kevin Durant")) {
                    return BKD1;
                }
                 if (KartListesi(x,"basketbol").equals("Jayson Tatum")) {
                    return BJ1;
                }
                if(KartListesi(x,"basketbol").equals("Ben Simmons")){
                    return BB1;
                }
                 if (KartListesi(x,"basketbol").equals("Anthony Davis")) {
                    return BA1;
                }
                 if (KartListesi(x,"basketbol").equals("Kawhi Leonard")) {
                    return BKL1;
                }
            }
            else if (y.equals("Üçlük")) {
                 if (KartListesi(x,"basketbol").equals("Lebron James")) {
                    return BL2;
                }
                if(KartListesi(x,"basketbol").equals("Stephen Curry")){
                    return BS2;
                }
               if (KartListesi(x,"basketbol").equals("Kyrie Irving")) {
                    return BK2;
                }
                 if (KartListesi(x,"basketbol").equals("Kevin Durant")) {
                    return BKD2;
                }
                 if (KartListesi(x,"basketbol").equals("Jayson Tatum")) {
                    return BJ2;
                }
                if(KartListesi(x,"basketbol").equals("Ben Simmons")){
                    return BB2;
                }
                 if (KartListesi(x,"basketbol").equals("Anthony Davis")) {
                    return BA2;
                }
                 if (KartListesi(x,"basketbol").equals("Kawhi Leonard")) {
                    return BKL2;
                }
            }
            else if (y.equals("Serbest Atış")) {
                 if (KartListesi(x,"basketbol").equals("Lebron James")) {
                    return BL3;
                }
                if(KartListesi(x,"basketbol").equals("Stephen Curry")){
                    return BS3;
                }
               if (KartListesi(x,"basketbol").equals("Kyrie Irving")) {
                    return BK3;
                }
                 if (KartListesi(x,"basketbol").equals("Kevin Durant")) {
                    return BKD3;
                }
                 if (KartListesi(x,"basketbol").equals("Jayson Tatum")) {
                    return BJ3;
                }
                if(KartListesi(x,"basketbol").equals("Ben Simmons")){
                    return BB3;
                }
                 if (KartListesi(x,"basketbol").equals("Anthony Davis")) {
                    return BA3;
                }
                 if (KartListesi(x,"basketbol").equals("Kawhi Leonard")) {
                    return BKL3;
                }
            }
        }
        return 0;
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
    public static int random(int m){
        int a1=1;
        int a2=2;
        int a3=3;
        int a4=4;
        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(a1);
        sayilar.add(a2);
        sayilar.add(a3);
        sayilar.add(a4);
        Collections.shuffle(sayilar);
        return sayilar.get(m);
    }
    public static int kartSec(int m,int n){
        if (m==1) {
            System.out.println("istediginiz kartı seciniz.");
        }
        else if (m==2) {
            return random(n);
        }
        return 0;
    }
            
}
