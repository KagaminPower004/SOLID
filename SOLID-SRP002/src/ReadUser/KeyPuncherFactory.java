package ReadUser;
import WriteUser.*;

public class KeyPuncherFactory {
	public KeyPuncher create() {
		return new Pure();
	}	

}
