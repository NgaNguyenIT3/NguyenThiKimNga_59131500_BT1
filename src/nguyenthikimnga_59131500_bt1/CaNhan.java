/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenthikimnga_59131500_bt1;

/**
 *
 * @author nga
 */
public abstract class CaNhan {
    private String hoten;
    private int tuoi;
    private String diachi;
    private String sdt;
    
    public String getHoTen() {
        return hoten;
    }
    public void setHoTen(String a) {
        this.hoten = a;
    }
    
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int b) {
        this.tuoi = b;
    }
    
    public String getDiaChi() {
        return diachi;
    }
    public void setDiaChi(String c) {
        this.diachi = c;
    }
    
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String d) {
        this.sdt = d;
    }
    
     public CaNhan(String a, int b, String c, String d) {
        this.hoten = a;
        this.tuoi = b;
        this.diachi = c;
        this.sdt = d;
    }
    
    public String HienThiTT(){
        return "Ho ten: " + hoten
            + "\nTuoi: " + tuoi 
            + "\nDia chi: " + diachi  
            + "\nsdt: " + sdt;
    }
    
}
