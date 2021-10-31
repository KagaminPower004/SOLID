package GetOujisama;
import OujisamaMember.*;

public class OujiSamaFactory {
    public Oujisama create(String name, int weight, int height, int age){
        return new GusyoOujiSama(name, weight, height, age);
    }
}
