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

public class Basketbolcu extends Sporcu {
    private String basketbolcuAdi;
    private String basketbolcuTakim;
    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    public Basketbolcu(String sporcuIsim,String sporcuTakim,int ikilik,int ucluk,int serbestAtis){
        super(sporcuIsim, sporcuTakim);
        this.basketbolcuAdi=sporcuIsim;
        this.basketbolcuTakim=sporcuTakim;
        this.ikilik=ikilik;
        this.ucluk=ucluk;
        this.serbestAtis=serbestAtis;
    }

    public void setBasketbolcuAdi(String basketbolcuAdi) {
        this.basketbolcuAdi = basketbolcuAdi;
    }

    public void setBasketbolcuTakim(String basketbolcuTakim) {
        this.basketbolcuTakim = basketbolcuTakim;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public String getBasketbolcuAdi() {
        return basketbolcuAdi;
    }

    public String getBasketbolcuTakim() {
        return basketbolcuTakim;
    }

    public int getIkilik() {
        return ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }
 public boolean kullanildiMi(int x){
        if(x==1){
            System.out.println("kullanildi");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean kullanildiMi2(int x){
        if(x==1){
            System.out.println("kullanildi");
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster(); 
        System.out.println("İkilik:"+ikilik);
        System.out.println("Üçlük:"+ucluk);
        System.out.println("Serbest Atış:"+serbestAtis);
    }
    
    
}
