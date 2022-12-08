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

public class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;
    
    
    
    public Sporcu(String sporcuIsim,String sporcuTakim){
        
        this.sporcuIsim=sporcuIsim;
        this.sporcuTakim=sporcuTakim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }
    public String getSporcuIsim() {
        return sporcuIsim;

    }
    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }
    
    public void sporcuPuaniGoster(){
            System.out.println(getSporcuIsim());
}
}