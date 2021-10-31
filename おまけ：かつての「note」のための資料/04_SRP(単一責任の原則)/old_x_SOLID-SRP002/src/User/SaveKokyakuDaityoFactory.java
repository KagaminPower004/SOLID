package User;
import Dao.*;

public class SaveKokyakuDaityoFactory {
	public SaveKokyakuDaityo create(int i) {
		return new ConcreteSaveKokyakuDaityo(i);
	}	

}
