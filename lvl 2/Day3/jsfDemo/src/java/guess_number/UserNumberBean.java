
package guess_number;

import java.io.Serializable;
import java.util.Random;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;





/**
 *
 * @author Stepan Babaev
 */
 

@SessionScoped
@Named("userNumberBean")
public class UserNumberBean implements Serializable{

    private Integer randomNumber;
    private Integer userNumber;
    
    
    
    
//    public UserNumberBean() {
//        randomNumber = new Random().nexInt(11);
//        System.out.println(randomNumber + "= My number");
//    }
    
    public UserNumberBean() {
        
        randomNumber =new Random().nextInt(11);
        System.out.println(randomNumber+ " =Number");
        
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }
    
    public String getResponse() {
        if((userNumber!=null) && (userNumber.equals(randomNumber))) {
            randomNumber = new Random().nextInt(11);
            System.out.println("New number = "+ randomNumber);
            return "Отлично. Вы крут!!!";
        }
        return "Сорри, "+ userNumber + " не то число. Попробуй снова...";
    } 
  
    
}



