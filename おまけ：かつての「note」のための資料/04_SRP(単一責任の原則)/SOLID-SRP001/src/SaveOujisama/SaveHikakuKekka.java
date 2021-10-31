package SaveOujisama;

import java.util.Date;
import GetOujisama.*;

public class SaveHikakuKekka implements SaveOujisama {
	
    //SRPの良い例：
	public void save(String o) {
    	//比較結果の王子様を保存
		Date now = new Date();
    	System.out.println(now + "|" + o + "オブジェクトを保存!!");
	
    }

}
