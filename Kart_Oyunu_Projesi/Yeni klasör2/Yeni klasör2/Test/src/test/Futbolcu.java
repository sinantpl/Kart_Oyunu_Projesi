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

public class Futbolcu extends Sporcu{
    private String futbolcuAdi;
    private String futbolcuTakim;
    private int penalti;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;
    
    public Futbolcu(String sporcuIsim,String sporcuTakim,int penalti,int serbestAtis,int kaleciKarsiKarsiya){
        
        super(sporcuIsim, sporcuTakim);
        this.futbolcuAdi=sporcuIsim;
        this.futbolcuTakim=sporcuTakim;
        this.penalti=penalti;
        this.serbestAtis=serbestAtis;
        this.kaleciKarsiKarsiya=kaleciKarsiKarsiya;
    }

    public void setFutbolcuAdi(String futbolcuAdi) {
        this.futbolcuAdi = futbolcuAdi;
    }

    public void setFutbolcuTakim(String futbolcuTakim) {
        this.futbolcuTakim = futbolcuTakim;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public String getFutbolcuAdi() {
        return futbolcuAdi;
    }

    public String getFutbolcuTakim() {
        return futbolcuTakim;
    }

    public int getPenalti() {
        return penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
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
        System.out.println("Penaltı:"+getPenalti());
        System.out.println("Serbest Vuruş:"+getSerbestAtis());
        System.out.println("Kaleciyle Karşı Karşıya:"+getKaleciKarsiKarsiya());
    }
    
}