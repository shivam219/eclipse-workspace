package Generic;

public class Genric2_all_type<T, T2> {
	T x;
	T2 y;

	public Genric2_all_type(T x, T2 y) {
		this.x = x;
		this.y = y;
	}

	public T  getvalue() {
		return (T) (x+ " "+ y.toString());
		
	}
}
