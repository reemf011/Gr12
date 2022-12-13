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
abstract class BaseHandler {
    Handler nextHandler;
    public void SetNext(Handler nextHandler){}
    public void Handle(FeedbackDetails feedback){}
    
}
