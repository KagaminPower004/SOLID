package Dao;

import User.*;

public class ConcreteDenWatyo implements DenWatyo{
    protected Person[] Persons;
    private int last = 0;

    public ConcreteDenWatyo(){}
    public ConcreteDenWatyo(int PersonCount){
    this.Persons = new Person[PersonCount];
    }

    public void add(Person Person){
        Persons[last] = Person;
        last++;
    }
    public Person getPersonAt(int index){
        return Persons[index];
    }

    public int getLastNum(){
        return last;
    }

    public Iterator iterator(){
        return new IteratorFactory().create(this);
    }
}
