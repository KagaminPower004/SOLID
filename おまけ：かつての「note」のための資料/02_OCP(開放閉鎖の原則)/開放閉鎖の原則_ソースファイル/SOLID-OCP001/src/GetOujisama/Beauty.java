package GetOujisama;

public class Beauty {
    public static void main(String args[]) {
    	
    	Oujisama Ouji1 = new OujiSamaFactory().create("‚¶‚¡‚¶",68,180,70);
    	Oujisama Ouji2 = new OujiSamaFactory().create("‚Ï‚Ÿ‚Ï",71,172,41);
        
    	//‘‰‚¹‚Ä‚él‚ªD‚«ô
        Hikaku Chk = new HeightHikakuFactory().create();
        String result = Chk.compare(Ouji1, Ouji2);

        System.out.println(result + "‘åD‚«ô");

    }
}
