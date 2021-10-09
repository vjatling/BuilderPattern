package State;

import java.util.List;

public class Fabric {
	String name;
	List<String> textiles;
	public void addTextiles(List<String> textiles) {
		this.textiles = textiles;
	}
	void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("Screwing Parts together with bolts");
		for(String textile: textiles) {
			System.out.println("   " + textile);
		}
	}
	void Winding() {
		System.out.println("The creation of large yarn packages that can be easily unwound.");
	}
	void Warping() {
		System.out.println("process of combining yarns from different cones together to form a sheet. ");
	}
	void Sizing() {
		System.out.println(" Applying a protective adhesive (synthetic/ natural) coating upon the yarns surface.");
	}
	void Printing() {
		System.out.println("Printing of fabric is finished. ");
	}
	public void setName(String name) {
		this.name = name;

	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("" + this.name);
		for(String textile : textiles) {
			display.append(textile + "\n");
		}
		return display.toString();
	}


}
