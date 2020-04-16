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
public class HocSinh extends CaNhan{
    private String lop;
    private String nangkhieu;

    public HocSinh(String lop, String nangkhieu, String a, int b, String c, String d) {
        super(a, b, c, d);
        this.lop = lop;
        this.nangkhieu = nangkhieu;
    }
    
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangkhieu;
    }
    public void setNangKhieu(String nangkhieu) {
        this.nangkhieu = nangkhieu;
    }
    
    @Override
    public String HienThiTT(){
        return super.HienThiTT() 
            + "\nLop: " + lop 
            + "\nNang Khieu: " + nangkhieu;
    }
    
}
