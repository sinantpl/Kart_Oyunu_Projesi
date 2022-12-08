/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Mertcan
 */

public class Kullanici extends Oyuncu{
    private String kullaniciID;
    private String kullaniciAdı;
    private int kullaniciSkor;
    static String KullaniciIsim;
    static int KullaniciSkor;
    
    public Kullanici(String oyuncuID,String oyuncuAdı,int skor) {
        super(oyuncuID,oyuncuAdı,skor);
        this.kullaniciID=oyuncuID;
        this.kullaniciAdı=oyuncuAdı;
        this.kullaniciSkor=skor; 
    }

    public void setKullaniciID(String kullaniciID) {
        this.kullaniciID = kullaniciID;
        kullaniciID = "2";
    }

    public void setKullaniciAdı(String kullaniciAdı) {
        this.kullaniciAdı = kullaniciAdı;
        kullaniciAdı = KullaniciIsim;
    }

    public void setKullaniciSkor(int kullaniciSkor) {
        this.kullaniciSkor = kullaniciSkor;
        kullaniciSkor = KullaniciSkor;
    }

    public String getKullaniciID() {
        return kullaniciID;
    }

    public String getKullaniciAdı() {
        return kullaniciAdı;
    }

    public int getKullaniciSkor() {
        return kullaniciSkor;
    }
    
    
}
