package KaitouSha;
import ShituMonSha.*;

public class ContactCenter implements FreeDial,NaviDial,CenterMail{

    public void CallTokyo03(){
        System.out.println("お電話ありがとうございます。");
        System.out.println("弊社では、メールまたはFaxでの対応も行っております。");
    }
 
    public void FaxTokyo03(){
        System.out.println("Faxありがとうございます。");
        System.out.println("弊社では、メールまたは電話での対応も行っております。");
    }
 
    public void MailTantoYamada(){
        System.out.println("メールありがとうございます。");
        System.out.println("弊社では、電話またはFaxでの対応も行っております。");
    }

    public void CallFreeDial(){
        this.CallTokyo03();
    }
    
    public void FaxNaviDial(){
        this.FaxTokyo03();
    }
 
    public void SecureMail(){
        this.MailTantoYamada();
    }

}
