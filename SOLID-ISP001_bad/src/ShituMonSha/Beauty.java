package ShituMonSha;

public class Beauty {
    
    public static void main(String args[]){

    	//メールでお問い合わせしようかしら♪
    	SupportServiceFactory helper = new SupportServiceFactory();
    	helper.create().SecureMail();        
    }
}
