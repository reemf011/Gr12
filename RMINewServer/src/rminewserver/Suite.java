/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

/**
 *
 * @author DeS
 */
public class Suite {
    int Suite_Number;
    String CheckIn;
    String Checkout;

    public int getSuite_Number() {
        return Suite_Number;
    }

    public void setSuite_Number(int Suite_Number) {
        this.Suite_Number = Suite_Number;
    }

    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String CheckIn) {
        this.CheckIn = CheckIn;
    }

    public String getCheckout() {
        return Checkout;
    }

    public void setCheckout(String Checkout) {
        this.Checkout = Checkout;
    }
    public void AddSuite(){}
    public void EditSuite(){}
    public void CancelSuite(){}
    public void RateSuite(){}
}
