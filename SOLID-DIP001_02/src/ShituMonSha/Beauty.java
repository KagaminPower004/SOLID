package ShituMonSha;

public class Beauty {
    
    public static void main(String args[]){

        FreeDialFactory beFree = new FreeDialFactory();
        
        //ファクトリーメソッドでインターフェース「FreeDial」を参照
        FreeDial freeCall = beFree.create();
        freeCall.CallFreeDial();
        
    }
}
