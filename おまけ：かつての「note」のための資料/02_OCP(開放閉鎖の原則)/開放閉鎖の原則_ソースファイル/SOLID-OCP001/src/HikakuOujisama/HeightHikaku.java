package HikakuOujisama;
import GetOujisama.*;

public class HeightHikaku implements Hikaku{
	
    public String compare(Oujisama o1 , Oujisama o2){
        //�w�������l���D����
        if(o1.getHeight() > o2.getHeight()){
            return o1.getName();
        }else if(o1.getHeight() == o2.getHeight()){
            return "�����Ƃ�";
        }else{
            return o2.getName();
        }
    }

}
