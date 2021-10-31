package ReadUser;
import Dao.*;

public class ReadKokyakuDaityoFactory {
	public ReadKokyakuDaityo create() {
		return new ConcreteReadKokyakuDaityo();
	}	

}
