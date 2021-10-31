package KaitouSha;
import ShituMonSha.FreeDial;

public class ContactCenter implements FreeDial{

    public void CallTokyo03(){
        System.out.println("お電話ありがとうございます。");
        System.out.println("弊社では、メールまたはFaxでの対応も行っております。");
    }

    public void CallFreeDial(){
        this.CallTokyo03();
    }

}
