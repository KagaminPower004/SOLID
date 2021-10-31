package Dao;

import User.*;

public class ConcreteReadKokyakuDaityo implements ReadKokyakuDaityo{
    private Person[] Persons;

    public ConcreteReadKokyakuDaityo(){
    	this.Persons = Dao.ConcreteSaveKokyakuDaityo.Persons;
    }

    public void Read(){
    	int i = 0;
        while(i < Persons.length){
            Person person = Persons[i];
            System.out.println(person.getName() 
            		+ " : " + person.getPhone_number()
            		+ " : " + person.getAddress());
            
            i++;
        }
    }
}
