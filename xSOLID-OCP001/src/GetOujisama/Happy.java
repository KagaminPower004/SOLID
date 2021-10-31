package GetOujisama;
import Const.*;

public class Happy {
    public static void main(String args[]) {
    	
    	Oujisama Ouji1 = new OujiSamaFactory().create("じぃじ",68,180,70);
    	Oujisama Ouji2 = new OujiSamaFactory().create("ぱぁぱ",71,172,41);
        
        //背が高い人が好き♪
    	String answer = HikakuType.height.toString();
        Hikaku Chk = new HikakuFactory().create(answer);
        String result = Chk.compare(Ouji1, Ouji2);

        System.out.println(result + "大好き♪");

    }
}
