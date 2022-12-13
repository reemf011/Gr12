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
public class Visa implements PaymentStrategy {
    
    private String cardNumber;
    private String name;
    private String cvv;
    private String dateOfExpiry;
 
    public Visa(String nm, String ccNum, String cvv, String expiryDate){
        this.cardNumber=ccNum;
        this.name=nm;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }

    @Override
    public void pay(String amount) {
        System.out.println(amount +"$ paid with visa card");
    }
}
