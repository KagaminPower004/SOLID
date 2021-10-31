package HikakuOujisama;
import java.util.Date;

import GetOujisama.*;

public class WeightHikaku implements Hikaku{
	
    public String compare(Oujisama o1 , Oujisama o2){
        //痩せてる人が好き♪
        if(o1.getWeight() < o2.getWeight()){
            return o1.getName();
        }else if(o1.getWeight() == o2.getWeight()){
            return o1.getName() + "、" + o2.getName() + "両方とも";
        }else{
            return o2.getName();
        }
    }
    
    //SRP違反の悪い例：
    public void saveHikakuKekka(String o) {
    	//比較結果の王子様を保存
		Date now = new Date();
    	System.out.println(now + "|" + o + "オブジェクトを保存!!");
    }

}
