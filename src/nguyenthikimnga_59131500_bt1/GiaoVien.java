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
public class GiaoVien extends CaNhan{
    private String monday;
    private String tobomon;

    public GiaoVien(String monday, String tobomon, String a, int b, String c, String d) {
        super(a, b, c, d);
        this.monday = monday;
        this.tobomon = tobomon;
    }
    
    public String getMonDay() {
        return monday;
    }
    public void setMonDay(String monDay) {
        this.monday = monDay;
    }

    public String getToBoMon() {
        return tobomon;
    }

    public void setTobomon(String tobomon) {
        this.tobomon = tobomon;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT() //To change body of generated methods, choose Tools | Templates.
            + "\nMon day: " + monday  
            + "\nTo Bo Mon: " + tobomon; 
    }
     
}
