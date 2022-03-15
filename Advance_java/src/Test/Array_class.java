package Test;
public class Array_class {
	public static void main(String[] args) {
//		food[] refrigerator = new food[3];
		food food1 = new food("samosa");
		food food2 = new food("puri");
		food food3 = new food("chinisec bhel");
		food[] refrigerator = { food1, food2, food3 };
//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;
		System.out.println(refrigerator[0].name);
	}
}
class food {
	String name;
	food(String name) {
		this.name = name;
	}
}