package GetOujisama;
import SaveOujisama.*;

public class SaveOujisamaFactory {
    public SaveOujisama create(){
    	
    	return new SaveHikakuKekka();
       
    }
}
