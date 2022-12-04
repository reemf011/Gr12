/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;
public class SingletonClass {
    
    private static SingletonClass instance;

    private SingletonClass(){}
    
    static SingletonClass getInstance() {
        
        if (instance == null)
               instance  = new SingletonClass();     
        return instance;
    }
    void showMessage() {
        System.out.println("Singleton Object");
}