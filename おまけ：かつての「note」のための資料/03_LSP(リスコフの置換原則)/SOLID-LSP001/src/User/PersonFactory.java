package User;
import Bean.*;

public class PersonFactory {
	public Person create(String name,String phone_number) {
		return new ConcretePerson(name,phone_number);
	}
}
