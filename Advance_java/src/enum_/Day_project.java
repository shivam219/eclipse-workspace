package enum_;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY;

}

public class Day_project {
	Day day;

// constructor
	public Day_project(Day day) {
		this.day = day;
	}
	
	public int a ;	

	public void dayIsLike() {
		switch (day) {
		case MONDAY, TUESDAY -> System.out.println("TOUF");

		case WEDNESDAY, THRUSDAY, FRIDAY -> System.out.println("MEDIUM");

		case SATURDAY, SUNDAY -> System.out.println("EASY");

		}
	}

	public static void main(String[] args) {
//		String str = "SUNDAY";
//		Day_project t1 = new Day_project(Day.valueOf(str));
//		t1.dayIsLike();
		int a;
		Day day1[] = Day.values();	
		for(Day l : day1)
			System.out.println(l+" Index "+ l.ordinal());
	}

}
