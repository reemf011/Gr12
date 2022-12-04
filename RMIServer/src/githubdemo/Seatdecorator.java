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
public abstract class Seatdecorator implements Chooseseatinterface {
    Chooseseatinterface wrapee;
    public void Seatdecorator(Chooseseatinterface wrapee){
     this.wrapee = wrapee;
    }
    public void reserve(){
    wrapee.Reserve();
    }
}