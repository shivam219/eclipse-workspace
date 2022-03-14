package factory;

public class Main {
	public static void main(String[] args) {
		Factory_profession obj = new Factory_profession();

		Profession doc = obj.FactoryCreation("DataScience");
		System.out.println(doc.a);/// need to create field in interface
		doc.showProfession();
	}
}
