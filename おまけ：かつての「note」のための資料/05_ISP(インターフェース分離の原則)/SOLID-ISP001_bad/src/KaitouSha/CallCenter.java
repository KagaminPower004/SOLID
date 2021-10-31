package KaitouSha;
import ShituMonSha.*;

public class CallCenter implements SupportService{

    public void CallTokyo03(){
        System.out.println("お電話ありがとうございます。");
    }

    public void CallFreeDial(){
        this.CallTokyo03();
    }
    
    public void FaxNaviDial(){
        //※コールセンターなので本当は何もナッシング
        System.out.println("送信結果：応答なし");
    }
    
    public void SecureMail(){
        //※コールセンターなので本当は何もナッシング
        System.out.println("Mail Delivery Subsystem：User unknown");
    }

}
