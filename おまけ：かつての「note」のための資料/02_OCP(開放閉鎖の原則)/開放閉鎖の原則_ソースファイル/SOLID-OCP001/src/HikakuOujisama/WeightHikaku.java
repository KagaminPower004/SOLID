package HikakuOujisama;
import GetOujisama.*;

public class WeightHikaku implements Hikaku{
	
    public String compare(Oujisama o1 , Oujisama o2){
        //‘‰‚¹‚Ä‚él‚ªD‚«ô
        if(o1.getWeight() < o2.getWeight()){
            return o1.getName();
        }else if(o1.getWeight() == o2.getWeight()){
            return "—¼•û‚Æ‚à";
        }else{
            return o2.getName();
        }
    }

}
