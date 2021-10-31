package User;

import Dao.Iterator;

public class Beauty {
    private DenWatyo denWaTyo;
    public void createDenWatyo(){
        denWaTyo = new DanWatyoFactory().create(3);
        denWaTyo.add(new PersonFactory().create("花留 花子","090-7777-7777"));
        denWaTyo.add(new PersonFactory().create("島津 幸次","080-3344-4433"));
        denWaTyo.add(new PersonFactory().create("神田 真保","070-5555-4444"));
    }
    public void callPersons(){
        Iterator itr = denWaTyo.iterator();
        while(itr.hasNext()){
            Person person = (Person)itr.next();
            System.out.println(person.getName() + " : " + person.getphone_number());
        }
    }

    public static void main(String args[]){
        Beauty me = new Beauty();
        me.createDenWatyo();
        me.callPersons();
    }
}
