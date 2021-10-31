package User;

import Dao.Iterator;

public interface DenWatyo extends Aggregate{
    public void add(Person Person);
    public Person getPersonAt(int index);
    public int getLastNum();
    public Iterator iterator();
}
