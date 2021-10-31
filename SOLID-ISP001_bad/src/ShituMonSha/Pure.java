package ShituMonSha;

public class Pure {
    
    public static void main(String args[]){

    	//Faxでお問い合わせしよ～っと♪
    	SupportServiceFactory helper = new SupportServiceFactory();
    	helper.create().FaxNaviDial();
    }
}
