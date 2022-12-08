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

public class Bilgisayar extends Oyuncu{
    private String bilgID;
    private String bilgAdi;
    private int bilgSkor;
    static int BilgisayarSkor;

public Bilgisayar(String oyuncuID,String oyuncuAdi,int skor){
super(oyuncuID,oyuncuAdi,skor);
this.bilgID=oyuncuID;
this.bilgAdi=oyuncuAdi;
this.bilgSkor=skor;
}

    public void setBilgID(String bilgID) {
        this.bilgID = bilgID;
        bilgID = "1";
    }

    public void setBilgAdi(String bilgAdi) {
        this.bilgAdi = bilgAdi;
        bilgAdi = "Bilgisayar";
    }

    public void setbilgSkor(int bilgSkor) {
        this.bilgSkor =bilgSkor;
        bilgSkor = BilgisayarSkor;
    }

    public String getBilgID() {
        return bilgID;
    }

    public String getBilgAdi() {
        return bilgAdi;
    }

    public int getbilgSkor() {
        return bilgSkor;
    }

}
