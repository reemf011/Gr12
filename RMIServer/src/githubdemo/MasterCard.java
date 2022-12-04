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
public class MasterCard implements PaymentStrategy{
 
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
 
    public MasterCard(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }

    @Override
    public void pay(String amount) {
        System.out.println(amount +"$ paid with master card");
    }

    
}