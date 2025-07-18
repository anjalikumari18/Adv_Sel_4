package MavenTest;
import org.testng.annotations.Test;

public class Maven1_Test {

	@Test(groups = "ST")
	public void CreateCpgnTest() {
		System.out.println("Created Cpgn");
	}
	
	@Test(groups = "ST")
	public void CreateLeadTest() {
		System.out.println("Created Lead");
	}
	
	@Test(groups = "RT")
	public void CreateProductTest() {
		System.out.println("Created Product ");
	}
	
	
	
}
