package KaitouSha;
import ShituMonSha.*;

public class ContactCenter implements FreeDial,NaviDial,CenterMail{

    public void CallTokyo03(){
        System.out.println("���d�b���肪�Ƃ��������܂��B");
        System.out.println("���Ђł́A���[���܂���Fax�ł̑Ή����s���Ă���܂��B");
    }
 
    public void FaxTokyo03(){
        System.out.println("Fax���肪�Ƃ��������܂��B");
        System.out.println("���Ђł́A���[���܂��͓d�b�ł̑Ή����s���Ă���܂��B");
    }
 
    public void MailTantoYamada(){
        System.out.println("���[�����肪�Ƃ��������܂��B");
        System.out.println("���Ђł́A�d�b�܂���Fax�ł̑Ή����s���Ă���܂��B");
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
