package User;
import Dao.*;

public class DanWatyoFactory {
	public DenWatyo create(int i) {
		//�z�񂩂�Vector�ɕύX
		//return new ConcreteDenWatyo(i);
		return new NewConcreteDenWatyo(i);
	}
}
