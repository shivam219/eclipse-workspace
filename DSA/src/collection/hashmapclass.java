package collection;

public class hashmapclass {
	public static void main(String[] args) {
		
	}
}

class stu{
	String name ="";
	public stu(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
//	this.hashCode()== (stu(obj)).
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	
}

