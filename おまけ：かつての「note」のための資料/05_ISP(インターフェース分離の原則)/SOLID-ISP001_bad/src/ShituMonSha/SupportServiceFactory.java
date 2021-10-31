package ShituMonSha;
import KaitouSha.CallCenter;

public class SupportServiceFactory {
    public SupportService create(){
        return new CallCenter();

    }
}
