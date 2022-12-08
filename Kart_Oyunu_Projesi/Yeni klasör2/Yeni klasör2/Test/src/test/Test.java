/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Mertcan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    public void PozisyonBilgisi() {
        

        int a = (int) (Math.random() * 3 + 1);
            if (a == 1) {
                System.out.print(" Penaltı: " );
            } else if (a == 2) {
                System.out.print(" Serbest Vuruş: " );
            } else if (a == 3) {
                System.out.print(" Kaleciyle Karşı Karşıya: " );
            }
        
         
            if (a == 1) {
                System.out.print(" İkilik: " );
            } else if (a == 2) {
                System.out.print(" Üçlük: " );
            } else if (a == 3) {
                System.out.print(" Serbest Atış: ");
            }
        }

    public static void main(String[] args) {
        // TODO code application logic here

        Futbolcu futbolcu[] = new Futbolcu[8];
        futbolcu[0] = new Futbolcu("Messi", "Barcelona", 95, 95, 95);
        futbolcu[1] = new Futbolcu("Ronaldo", "Juventus", 95, 95, 95);
        futbolcu[2] = new Futbolcu("Neymar", "PSG", 91, 90, 93);
        futbolcu[3] = new Futbolcu("Salah", "Liverpool", 90, 85, 92);
        futbolcu[4] = new Futbolcu("Ramos", "Real Madrid", 92, 75, 80);
        futbolcu[5] = new Futbolcu("Haaland", "B.Dortmund", 85, 79, 94);
        futbolcu[6] = new Futbolcu("Lukaku", "Inter", 88, 80, 93);
        futbolcu[7] = new Futbolcu("Pogba", "M.United", 93, 88, 87);
        Basketbolcu basketbolcu[] = new Basketbolcu[8];
        basketbolcu[0] = new Basketbolcu("Lebron James", "Los Angeles Lakers", 95, 95, 95);
        basketbolcu[1] = new Basketbolcu("Stephen Curry", "Golden State Warriors", 95, 95, 95);
        basketbolcu[2] = new Basketbolcu("Kyrie Irving", "Brooklyn Nets", 88, 80, 82);
        basketbolcu[3] = new Basketbolcu("Kevin Durant", "Brooklyn Nets", 85, 90, 88);
        basketbolcu[4] = new Basketbolcu("Jayson Tatum", "Boston Celtics", 83, 80, 75);
        basketbolcu[5] = new Basketbolcu("Ben Simmons", "Philadelphia 76ers", 80, 70, 75);
        basketbolcu[6] = new Basketbolcu("Anthony Davis", "Los Angeles Lakers", 91, 79, 80);
        basketbolcu[7] = new Basketbolcu("Kawhi Leonard", "Clippers", 92, 87, 88);
        
        Oyun2.ad1=futbolcu[0].getFutbolcuAdi();
        Oyun2.ad2=futbolcu[1].getFutbolcuAdi();
        Oyun2.ad3=futbolcu[2].getFutbolcuAdi();
        Oyun2.ad4=futbolcu[3].getFutbolcuAdi();
        Oyun2.ad5=futbolcu[4].getFutbolcuAdi();
        Oyun2.ad6=futbolcu[5].getFutbolcuAdi();
        Oyun2.ad7=futbolcu[6].getFutbolcuAdi();
        Oyun2.ad8=futbolcu[7].getFutbolcuAdi();
        
        Oyun2.bd1=basketbolcu[0].getBasketbolcuAdi();
        Oyun2.bd2=basketbolcu[1].getBasketbolcuAdi();
        Oyun2.bd3=basketbolcu[2].getBasketbolcuAdi();
        Oyun2.bd4=basketbolcu[3].getBasketbolcuAdi();
        Oyun2.bd5=basketbolcu[4].getBasketbolcuAdi();
        Oyun2.bd6=basketbolcu[5].getBasketbolcuAdi();
        Oyun2.bd7=basketbolcu[6].getBasketbolcuAdi();
        Oyun2.bd8=basketbolcu[7].getBasketbolcuAdi();
        
        Arayüz menu = new Arayüz();
        menu.setSize(1368, 768);
        menu.setVisible(true);
        
    }
}
