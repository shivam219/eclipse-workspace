package Java_Feature;

public class SwitchExpression {
	public static void main(String[] args) {
		System.out.println(weekDay(2));
		System.out.println(weekDay(20));
	}

	public static String weekDay(int day) {
		String dayOfWeek = switch (day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> {
			System.out.println("Do some operation then return by yeild keyword");
			yield "Sunday";
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + day);
		};
		return dayOfWeek;
	}
}
