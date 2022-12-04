/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

/**
 *
 * @author DeS
 */
public interface Payment {
    int Payment_ID=0;
    float Payment_Amount=0;
    String Payment_date="";
    String payment_status="";
    String payment_Type="";
    
    public void CancelPayment();
    public void AddPayment();
    public void EditPayment();
    public int getPaymentId();
    public void getPaymentId(int paymentid);
    public void setPaymentAmount(int paymentamount);
    public float getpaymentAmount();
    public String getPaymentDate();
    public void setPaymentDate(String PaymentStatus);
    public String getPaymentStatus();
    public void setPaymentStatus(String PaymentStatus);
    public void Paymentinfo(int paymentamout);
}
