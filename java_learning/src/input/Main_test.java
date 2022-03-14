package input;
public class Main_test {

	double base;
	double height;
	double sideLenOne;
	double sideLenTwo;
	double sideLenThree;

	public Main_test(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
		this.base=base;
		this.height=height;
		this.sideLenOne=sideLenOne;
		this.sideLenTwo=sideLenTwo;
		this.sideLenThree=sideLenThree;
	}
	
	public double findArea()
	{
		return (this.base* this.height)/2;
	}
}
