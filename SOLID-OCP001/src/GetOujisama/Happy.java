package GetOujisama;

public class Happy {
    public static void main(String args[]) {
    	
    	Oujisama Ouji1 = new OujiSamaFactory().create("じぃじ",68,180,70);
    	Oujisama Ouji2 = new OujiSamaFactory().create("ぱぁぱ",71,172,41);
        
        //背が高い人が好き♪
        Hikaku Chk = new WeightHikakuFactory().create();
        String result = Chk.compare(Ouji1, Ouji2);

        System.out.println(result + "大好き♪");

    }
}
