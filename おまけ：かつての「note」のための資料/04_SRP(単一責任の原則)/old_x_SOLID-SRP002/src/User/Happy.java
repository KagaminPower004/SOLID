package User;

public class Happy {

    public static void main(String args[]){
        Pure KeyPuncher = new Pure();
        KeyPuncher.registKokyakuDaityo();
        
        ReadKokyakuDaityo kokyakuDaityo = new ReadKokyakuDaityoFactory().create();
        kokyakuDaityo.Read();        
        
    }
}
