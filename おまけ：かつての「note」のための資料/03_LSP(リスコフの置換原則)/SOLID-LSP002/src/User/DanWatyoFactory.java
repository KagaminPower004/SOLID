package User;
import Dao.*;

public class DanWatyoFactory {
	public DenWatyo create(int i) {
		//”z—ñ‚©‚çVector‚É•ÏX
		//return new ConcreteDenWatyo(i);
		return new NewConcreteDenWatyo(i);
	}
}
