package GetOujisama;

public class Happy {
    public static void main(String args[]) {
    	
    	Oujisama Ouji1 = new OujiSamaFactory().create("������",68,180,70);
    	Oujisama Ouji2 = new OujiSamaFactory().create("�ς���",71,172,41);
        
        //�w�������l���D����
        Hikaku Chk = new WeightHikakuFactory().create();
        String resultOuji = Chk.compare(Ouji1, Ouji2);

        System.out.println(resultOuji + "��D����");
        
        //��D���Ȑl��ۑ���
        SaveOujisama Kiroku = new SaveOujisamaFactory().create();
        Kiroku.save(resultOuji);

    }
}
