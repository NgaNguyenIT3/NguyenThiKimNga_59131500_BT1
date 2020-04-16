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
public class LopHoc {
    private QLDS dsgvgd; //DS giao vien giang day
    private QLDS dshs; //DS hoc sinh
    private GiaoVien gvcn; // DS giao vien chu nhiem
  
    public LopHoc(GiaoVien gvcn) {
        dsgvgd = new QLDS();
        dshs = new QLDS();
        this.gvcn = gvcn;
    }
    
    public void ThemGVGD(GiaoVien gv) {
        dsgvgd.Them(gv);
    }
    public void ThemHocSinh(HocSinh hs){
        dshs.Them(hs);
    }
     
    public void InDSGVGD (){
        dsgvgd.InDS();
    }
    public void InDSHS (){
        dshs.InDS();
    }
   
}
