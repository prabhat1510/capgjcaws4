package daysix.map;

import java.util.Objects;

public class Key {
	int index;
	String name;
	
	public Key(int index, String name) {
		this.index = index;
		this.name = name;
	}

	@Override
	public int hashCode() {
		//return Objects.hash(index, name);
		return 5;
	}

	@Override
	public boolean equals(Object obj) {
		/**
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return index == other.index && Objects.equals(name, other.name);
		**/
		return true;
	}
	
	
}
