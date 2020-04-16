/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenthikimnga_59131500_bt1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nga
 */
public class QLDS implements IQLDS {
    List<CaNhan> DSCN;

    public QLDS() {
        DSCN = new ArrayList<>();
    }
    
    @Override
    public void Them(CaNhan p) {
        DSCN.add(p);
    }

    @Override
    public void Xoa(String ten) {
        DSCN.removeIf( i -> i.getHoTen().equals(ten)  );
    }
    
    @Override
    public void InDS() {
        for (int i = 0; i < DSCN.size(); i++){
            System.out.println(DSCN.get(i).HienThiTT() + "\n");
        }
    }
}
