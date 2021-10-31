package Dao;

import User.*;

public class ConcreteSaveKokyakuDaityo implements SaveKokyakuDaityo{
	
    protected static Person[] Persons;
    private int last = 0;

    public ConcreteSaveKokyakuDaityo(){}
    public ConcreteSaveKokyakuDaityo(int PersonCount){
        Persons = new Person[PersonCount];
    }

    public void save(Person Person){
        Persons[last] = Person;
        last++;
    }

}
