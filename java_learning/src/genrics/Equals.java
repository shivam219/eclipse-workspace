package genrics;

public class Equals<T extends Number> {
	T num;

	Equals(T ob) {
		this.num = ob;
	}

	boolean absEquals(Equals<?> ob) {

		if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;

	}

}
