package KaitouSha;
import ShituMonSha.FreeDial;

public class ContactCenter implements FreeDial{

    public void CallTokyo03(){
        System.out.println("���d�b���肪�Ƃ��������܂��B");
        System.out.println("���Ђł́A���[���܂���Fax�ł̑Ή����s���Ă���܂��B");
    }

    public void CallFreeDial(){
        this.CallTokyo03();
    }

}
