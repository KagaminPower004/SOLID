package KaitouSha;
import ShituMonSha.FreeDial;

public class CallCenter implements FreeDial{

    public void CallTokyo03(){
        System.out.println("お電話ありがとうございます。");
    }

    public void CallFreeDial(){
        this.CallTokyo03();
    }

}
