package HikakuOujisama;
import GetOujisama.*;

public class WeightHikaku implements Hikaku{
	
    public String compare(Oujisama o1 , Oujisama o2){
        //�����Ă�l���D����
        if(o1.getWeight() < o2.getWeight()){
            return o1.getName();
        }else if(o1.getWeight() == o2.getWeight()){
            return "�����Ƃ�";
        }else{
            return o2.getName();
        }
    }

}
