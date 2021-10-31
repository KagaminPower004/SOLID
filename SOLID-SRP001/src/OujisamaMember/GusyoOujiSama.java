package OujisamaMember;
import GetOujisama.*;

public class GusyoOujiSama implements Oujisama{
	
    private String name   = "名無し";
    private int    weight =  -1;
    private int    height =  -1;
    private int    age    =  -1;

    public GusyoOujiSama(String name,int weight,int height,int age){
     	this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }

    public int getAge(){
        return age;
    }

}
