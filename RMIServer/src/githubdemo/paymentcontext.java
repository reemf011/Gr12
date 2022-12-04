/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubdemo;

/**
 *
 * @author note book
 */
public class paymentcontext {
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy strategy)
    {
        this.paymentStrategy = strategy;
    }
    
    public PaymentStrategy getPaymentStrategy()
    {
        return paymentStrategy;
    }
    
    public void pay(String amount)
    {
        paymentStrategy.pay(amount);
    }
}
