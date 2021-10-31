package User;
import Dao.*;

public class ReadKokyakuDaityoFactory {
	public ReadKokyakuDaityo create() {
		return new ConcreteReadKokyakuDaityo();
	}	

}
