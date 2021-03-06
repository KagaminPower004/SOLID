package Dao;

import User.*;

public class NewConcreteDenWatyo extends ConcreteDenWatyo{
    protected java.util.Vector<Person> Persons;
    private int last = 0;

    public NewConcreteDenWatyo(){}
    public NewConcreteDenWatyo(int PersonCount){
        this.Persons = new java.util.Vector<Person>(PersonCount);
    }

    public void add(Person Person){
        Persons.add(Person);
        last++;
    }
    public Person getPersonAt(int index){
        return Persons.get(index);
    }

    public int getLastNum(){
        return last;
    }

    public Iterator iterator(){
        return new IteratorFactory().create(this);
    }
}
