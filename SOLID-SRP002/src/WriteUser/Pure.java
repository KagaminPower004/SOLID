package WriteUser;
import ReadUser.KeyPuncher;

public class Pure implements KeyPuncher {
    private SaveKokyakuDaityo kokyakuDaityo;
    public void registKokyakuDaityo(){
    	kokyakuDaityo = new SaveKokyakuDaityoFactory().create(3);
    	kokyakuDaityo.save(new PersonFactory().create("花留 花子","090-7777-7777","ゴッサムシティ"));
    	kokyakuDaityo.save(new PersonFactory().create("島津 幸次","080-3344-4433","杜王町"));
    	kokyakuDaityo.save(new PersonFactory().create("神田 真保","070-5555-4444","ペンギン村"));
    }

    public static void main(String args[]){
    	Pure me = new Pure();
        me.registKokyakuDaityo();
        
        System.out.println("登録完了!!");
    }
}
