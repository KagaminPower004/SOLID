package KaitouSha;
import ShituMonSha.*;

public class CallCenter implements SupportService{

    public void CallTokyo03(){
        System.out.println("���d�b���肪�Ƃ��������܂��B");
    }

    public void CallFreeDial(){
        this.CallTokyo03();
    }
    
    public void FaxNaviDial(){
        //���R�[���Z���^�[�Ȃ̂Ŗ{���͉����i�b�V���O
        System.out.println("���M���ʁF�����Ȃ�");
    }
    
    public void SecureMail(){
        //���R�[���Z���^�[�Ȃ̂Ŗ{���͉����i�b�V���O
        System.out.println("Mail Delivery Subsystem�FUser unknown");
    }

}
