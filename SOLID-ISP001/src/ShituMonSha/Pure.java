package ShituMonSha;

public class Pure {
    
    public static void main(String args[]){

    	//Faxでお問い合わせしよ～っと♪
        NaviDialFactory beNavia = new NaviDialFactory();
        beNavia.create().FaxNaviDial();
    }
}
