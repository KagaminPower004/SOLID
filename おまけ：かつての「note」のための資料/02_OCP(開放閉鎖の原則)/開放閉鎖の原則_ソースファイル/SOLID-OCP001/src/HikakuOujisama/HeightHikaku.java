package HikakuOujisama;
import GetOujisama.*;

public class HeightHikaku implements Hikaku{
	
    public String compare(Oujisama o1 , Oujisama o2){
        //”w‚ª‚‚¢l‚ªD‚«ô
        if(o1.getHeight() > o2.getHeight()){
            return o1.getName();
        }else if(o1.getHeight() == o2.getHeight()){
            return "—¼•û‚Æ‚à";
        }else{
            return o2.getName();
        }
    }

}
