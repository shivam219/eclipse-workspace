package Generic;

public class Sum<T extends Number> {
	T ob;

	Sum(T ob) {
		this.ob = ob;
	}

	double square() {
		return ob.intValue()*ob.intValue();
	}
}
