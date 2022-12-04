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
public interface Handler {
    public void SetNext(Handler nextHandle);
    public void Handle(FeedbackDetails feedback);
}
