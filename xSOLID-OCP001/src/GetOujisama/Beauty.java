package GetOujisama;
import Const.*;

public class Beauty {
    public static void main(String args[]) {
    	
    	Oujisama Ouji1 = new OujiSamaFactory().create("じぃじ",68,180,70);
    	Oujisama Ouji2 = new OujiSamaFactory().create("ぱぁぱ",71,172,41);
        
    	//痩せてる人が好き♪
    	String answer = HikakuType.weight.toString();
        Hikaku Chk = new HikakuFactory().create(answer);
        String result = Chk.compare(Ouji1, Ouji2);

        System.out.println(result + "大好き♪");

    }
}
