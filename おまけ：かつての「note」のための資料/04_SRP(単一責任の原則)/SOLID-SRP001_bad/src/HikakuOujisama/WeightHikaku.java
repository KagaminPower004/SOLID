package HikakuOujisama;
import java.util.Date;

import GetOujisama.*;

public class WeightHikaku implements Hikaku{
	
    public String compare(Oujisama o1 , Oujisama o2){
        //�����Ă�l���D����
        if(o1.getWeight() < o2.getWeight()){
            return o1.getName();
        }else if(o1.getWeight() == o2.getWeight()){
            return o1.getName() + "�A" + o2.getName() + "�����Ƃ�";
        }else{
            return o2.getName();
        }
    }
    
    //SRP�ᔽ�̈�����F
    public void saveHikakuKekka(String o) {
    	//��r���ʂ̉��q�l��ۑ�
		Date now = new Date();
    	System.out.println(now + "|" + o + "�I�u�W�F�N�g��ۑ�!!");
    }

}
