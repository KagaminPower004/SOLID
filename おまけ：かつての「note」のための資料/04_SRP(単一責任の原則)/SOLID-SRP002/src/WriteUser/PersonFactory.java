package WriteUser;
import Bean.*;

public class PersonFactory {
	public Person create(String name,String phone_number,String address) {
		return new ConcretePerson(name,phone_number,address);
	}
}
