package HikakuOujisama;
import GetOujisama.*;

public class WeightHikaku implements Hikaku{
	
    public String compare(Oujisama o1 , Oujisama o2){
        //痩せてる人が好き♪
        if(o1.getWeight() < o2.getWeight()){
            return o1.getName();
        }else if(o1.getWeight() == o2.getWeight()){
            return "両方とも";
        }else{
            return o2.getName();
        }
    }

}
