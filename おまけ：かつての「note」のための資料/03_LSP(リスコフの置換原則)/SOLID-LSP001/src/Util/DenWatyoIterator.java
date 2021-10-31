package Util;
import Dao.*;
import User.*;

public class DenWatyoIterator implements Iterator{
    private DenWatyo DenWatyo;
    private int index;
    public DenWatyoIterator(DenWatyo denWaTyo){
        this.DenWatyo = denWaTyo;
        this.index = 0;
    }
    public boolean hasNext(){
        if(DenWatyo.getLastNum() > index){
            return true;
        }else{
            return false;
        }
    }
    public Person next(){
        Person person =  DenWatyo.getPersonAt(index);
        index++;
        return person;
    }

}
