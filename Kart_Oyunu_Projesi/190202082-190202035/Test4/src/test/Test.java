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
    
    public static String PozisyonBilgisi(String spor) {
        
        if(spor.equals("futbol")){
           int a = (int) (Math.random() * 3 + 1);
            if (a == 1) {
                
                return "Penaltı";
            } else if (a == 2) {
                
                return "Serbest Vurus";
            } else if (a == 3) {
                
                return "Kaleciyle Karşı Karşıya";
            }
        return null;
        }
        
        else if (spor.equals("basketbol")) {
             int a = (int) (Math.random() * 3 + 1);
            if (a == 1) {
                
                return "İkilik";
                
            } else if (a == 2) {
                
                return "Üçlük";
            } else if (a == 3) {
                
                return "Serbest Atış";
            }
        }
            return null;
            
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
        
        Oyuncu.FM1=futbolcu[0].getPenalti(); Oyuncu.FM2=futbolcu[0].getSerbestAtis(); Oyuncu.FM3=futbolcu[0].getKaleciKarsiKarsiya();
        Oyuncu.FR1=futbolcu[1].getPenalti(); Oyuncu.FR2=futbolcu[1].getSerbestAtis(); Oyuncu.FR3=futbolcu[1].getKaleciKarsiKarsiya();
        Oyuncu.FN1=futbolcu[2].getPenalti(); Oyuncu.FN2=futbolcu[2].getSerbestAtis(); Oyuncu.FN3=futbolcu[2].getKaleciKarsiKarsiya();
        Oyuncu.FS1=futbolcu[3].getPenalti(); Oyuncu.FS2=futbolcu[3].getSerbestAtis(); Oyuncu.FS3=futbolcu[3].getKaleciKarsiKarsiya();
        Oyuncu.FRa1=futbolcu[4].getPenalti(); Oyuncu.FRa2=futbolcu[4].getSerbestAtis(); Oyuncu.FRa3=futbolcu[4].getKaleciKarsiKarsiya();
        Oyuncu.FH1=futbolcu[5].getPenalti(); Oyuncu.FH2=futbolcu[5].getSerbestAtis(); Oyuncu.FH3=futbolcu[5].getKaleciKarsiKarsiya();
        Oyuncu.FL1=futbolcu[6].getPenalti(); Oyuncu.FL2=futbolcu[6].getSerbestAtis(); Oyuncu.FL3=futbolcu[6].getKaleciKarsiKarsiya();
        Oyuncu.FP1=futbolcu[7].getPenalti(); Oyuncu.FP2=futbolcu[7].getSerbestAtis(); Oyuncu.FP3=futbolcu[7].getKaleciKarsiKarsiya();    
        Oyuncu.BL1=basketbolcu[0].getIkilik(); Oyuncu.BL2=basketbolcu[0].getUcluk(); Oyuncu.BL3=basketbolcu[0].getSerbestAtis();
        Oyuncu.BS1=basketbolcu[1].getIkilik(); Oyuncu.BS2=basketbolcu[1].getUcluk(); Oyuncu.BS3=basketbolcu[1].getSerbestAtis();
        Oyuncu.BK1=basketbolcu[2].getIkilik(); Oyuncu.BK2=basketbolcu[2].getUcluk(); Oyuncu.BK3=basketbolcu[2].getSerbestAtis();
        Oyuncu.BKD1=basketbolcu[3].getIkilik(); Oyuncu.BKD2=basketbolcu[3].getUcluk(); Oyuncu.BKD3=basketbolcu[3].getSerbestAtis();
        Oyuncu.BJ1=basketbolcu[4].getIkilik(); Oyuncu.BJ2=basketbolcu[4].getUcluk(); Oyuncu.BJ3=basketbolcu[4].getSerbestAtis();
        Oyuncu.BB1=basketbolcu[5].getIkilik(); Oyuncu.BB2=basketbolcu[5].getUcluk(); Oyuncu.BB3=basketbolcu[5].getSerbestAtis();
        Oyuncu.BA1=basketbolcu[6].getIkilik(); Oyuncu.BA2=basketbolcu[6].getUcluk(); Oyuncu.BA3=basketbolcu[6].getSerbestAtis();
        Oyuncu.BKL1=basketbolcu[7].getIkilik(); Oyuncu.BKL2=basketbolcu[7].getUcluk(); Oyuncu.BKL3=basketbolcu[7].getSerbestAtis();
        
        ArrayList<String> randoms = new ArrayList<String>();
        randoms.add("1");
        randoms.add("2");
        randoms.add("3");
        randoms.add("4");
        Collections.shuffle(randoms);
        Oyun2.r1=(randoms.get(0));
        Oyun2.r2=(randoms.get(1));
        Oyun2.r3=(randoms.get(2));
        Oyun2.r4=(randoms.get(3));
        ArrayList<String> randoms2 = new ArrayList<String>();
        randoms2.add("1");
        randoms2.add("2");
        randoms2.add("3");
        randoms2.add("4");
        Collections.shuffle(randoms2);
        Oyun2.R1=(randoms2.get(0));
        Oyun2.R2=(randoms2.get(1));
        Oyun2.R3=(randoms2.get(2));
        Oyun2.R4=(randoms2.get(3));
        
        Arayüz menu = new Arayüz();
        menu.setSize(1368, 768);
        menu.setVisible(true);
        
    }
}
