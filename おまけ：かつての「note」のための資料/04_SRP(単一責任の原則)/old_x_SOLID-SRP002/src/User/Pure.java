package User;

public class Pure {
    private SaveKokyakuDaityo kokyakuDaityo;
    public void registKokyakuDaityo(){
    	kokyakuDaityo = new SaveKokyakuDaityoFactory().create(3);
    	kokyakuDaityo.save(new PersonFactory().create("�ԗ� �Ԏq","090-7777-7777","�S�b�T���V�e�B"));
    	kokyakuDaityo.save(new PersonFactory().create("���� �K��","080-3344-4433","�m����"));
    	kokyakuDaityo.save(new PersonFactory().create("�_�c �^��","070-5555-4444","�y���M����"));
    }

    public static void main(String args[]){
    	Pure me = new Pure();
        me.registKokyakuDaityo();
        
        System.out.println("�o�^����!!");
    }
}
