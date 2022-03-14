package factory;

public class Factory_profession {
//  method 
	public Profession FactoryCreation(String prof) {
		if (prof == null) {
			return null;
		}

		if (prof.equalsIgnoreCase("DataScience")) {
			return new DataScience();
		}

		if (prof.equalsIgnoreCase("CyberSecurity")) {
			return new CyberSecurity();
		}
		return null;
	}
}
 