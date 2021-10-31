package Dao;

import User.*;
import Util.*;

public class IteratorFactory {
	public Iterator create(DenWatyo List) {
		return new DenWatyoIterator(List);
	}
}
