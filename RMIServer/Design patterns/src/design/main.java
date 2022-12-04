
package design;


public class main {
    
    public static void main(String[] args) {
        SingletonClass object = SingletonClass.getInstance();
        object.showMessage();

//        This cannot be done, because constructor is private
//        object = new SingletonClass();
    }
}
   
    


