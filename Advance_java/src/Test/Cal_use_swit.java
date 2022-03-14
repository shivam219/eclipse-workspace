package Test;

import java.text.DecimalFormat;

//		 String.format("%.0f",result);
//			int  int_val = (int) (result - (int)result);
// calculator using switch case
//String.format("%.0f",result);
//			System.out.printf("hii %.2f",result);
public class Cal_use_swit {
	public static void main(String[] args) {

		float val=10,val2=20,result;
		int ch=10;
		DecimalFormat df = new DecimalFormat(".00");
		
		switch (ch) {
		case '+':
			result=val+val;
			System.out.println("Output :- \nAddition :- ");
			System.out.println(df.format(result));
			break;
		case '-':
			result=val-val;
			System.out.println("Output :- \nMinus :- ");
			System.out.println(df.format(result));
			break;
		case '*':
			result=val*val;
			System.out.println("Output :- \nMultiplication :- ");
			System.out.println(df.format(result));
			break;
		case '/':
			result=val/val;
			System.out.println("Output :- \nDivision :- ");
			System.out.println(df.format(result));
			break;
//		case '&' :
//			result=val&val;
//			System.out.println("Output :- \nXOR :- ");
//			System.out.println(df.format(result));
//			
//		case '^' :
//			result=val^val;
//			System.out.println("Output :- \nXOR :- ");
//			System.out.println(df.format(result));

		default:
			break;
		}
	}
	}
