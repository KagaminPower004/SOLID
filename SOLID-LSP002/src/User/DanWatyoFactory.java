package User;
import Dao.*;

public class DanWatyoFactory {
	public DenWatyo create(int i) {
		//配列からVectorに変更
		//return new ConcreteDenWatyo(i);
		return new NewConcreteDenWatyo(i);
	}
}
