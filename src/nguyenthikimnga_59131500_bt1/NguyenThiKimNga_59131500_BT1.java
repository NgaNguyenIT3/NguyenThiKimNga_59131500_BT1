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
public class NguyenThiKimNga_59131500_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GiaoVien gvcn = new GiaoVien("Ly", "Ly", "Trinh Linh Chi", 35, "Da Nang", "012345678");
        GiaoVien gvgd1 = new GiaoVien("Van", "Van", "Nguyen Hoang", 36, "Da Nang", "123456789");
        GiaoVien gvgd2 = new GiaoVien("Su", "Su", "Tran Yen", 45, "Da Nang", "234567890");
        HocSinh hs1 = new HocSinh("10D", "Hat", "Le Thai Trinh" , 16 , "Da Nang", "012346789");
        HocSinh hs2 = new HocSinh("11C", "Nhay", "Nguyen Viet" , 17 , "Da Nang", "034567890");
        HocSinh hs3 = new HocSinh("12A", "Mua", "Trinh Van An" , 18, "Da Nang", "045678901");
    
        LopHoc lh = new LopHoc(gvcn);
        lh.ThemGVGD(gvgd1);
        lh.ThemGVGD(gvgd2);
        lh.ThemHocSinh(hs1);
        lh.ThemHocSinh(hs2);
        lh.ThemHocSinh(hs3);
        System.out.println("Danh sach giao vien giang day: ");
        lh.InDSGVGD();
        System.out.println("Danh sach hoc sinh: ");
        lh.InDSHS();
    }
}
    
