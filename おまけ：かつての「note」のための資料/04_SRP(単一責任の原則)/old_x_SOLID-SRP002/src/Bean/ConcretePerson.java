package Bean;

import User.*;

public class ConcretePerson implements Person{
    private String name;
    private String phone_number;
    private String address;
 
    public ConcretePerson(String name,String phone_number,String address){
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getPhone_number(){
        return phone_number;
    }
    public String getAddress(){
        return address;
    }
}
