package Bean;

import User.*;

public class ConcretePerson implements Person{
    private String name;
    private String phone_number;
 
    public ConcretePerson(String name,String phone_number){
        this.name = name;
        this.phone_number = phone_number;
    }
    public String getName(){
        return name;
    }
    public String getphone_number(){
        return phone_number;
    }
}
