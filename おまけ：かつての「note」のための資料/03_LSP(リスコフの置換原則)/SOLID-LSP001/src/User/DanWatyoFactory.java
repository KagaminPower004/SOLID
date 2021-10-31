package User;
import Dao.*;

public class DanWatyoFactory {
	public DenWatyo create(int i) {
		return new ConcreteDenWatyo(i);
	}	

}
