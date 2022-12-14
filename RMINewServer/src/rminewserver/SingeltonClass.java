/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;
public class SingeltonClass {
    
    private static SingeltonClass instance;

    private SingeltonClass(){}
    
    static SingeltonClass getInstance() {
        
        if (instance == null)
               instance  = new SingeltonClass();     
        return instance;
    }
    void showMessage() {
        System.out.println("Singleton Object");
}
}