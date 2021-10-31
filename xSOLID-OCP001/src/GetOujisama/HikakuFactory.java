package GetOujisama;
import HikakuOujisama.*;
import Const.*;

public class HikakuFactory {
    public Hikaku create(String answer){
  	
    	if(answer == HikakuType.weight.toString()) {
    		return new WeightHikaku();
    	}
 
    	if(answer == HikakuType.height.toString()) {
    		return new HeightHikaku();
    	}
    	
    	if(answer == HikakuType.age.toString()) {
    		//ソースを入れてみてね♪
    	}
    	
    	return null;        
    }
}
