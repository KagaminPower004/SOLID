package GetOujisama;

public class Beauty {
    public static void main(String args[]) {
    	
    	Oujisama Ouji1 = new OujiSamaFactory().create("������",68,180,70);
    	Oujisama Ouji2 = new OujiSamaFactory().create("�ς���",71,172,41);
        
    	//�����Ă�l���D����
        Hikaku Chk = new HeightHikakuFactory().create();
        String resultOuji = Chk.compare(Ouji1, Ouji2);

        System.out.println(resultOuji + "��D����");
        
        //��D���Ȑl��ۑ���
        SaveOujisama Kiroku = new SaveOujisamaFactory().create();
        Kiroku.save(resultOuji);

    }
}
