package ReadUser;

public class Happy {

    public static void main(String args[]){
    	KeyPuncher keyPuncher = new KeyPuncherFactory().create();
    	keyPuncher.registKokyakuDaityo();
        
        ReadKokyakuDaityo kokyakuDaityo = new ReadKokyakuDaityoFactory().create();
        kokyakuDaityo.Read();        
        
    }
}
