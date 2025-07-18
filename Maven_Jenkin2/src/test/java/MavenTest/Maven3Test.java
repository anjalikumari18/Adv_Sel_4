package MavenTest;
import org.testng.annotations.Test;

public class Maven3Test {

	@Test(groups = "RT")
	public void GUTest() {
		System.out.println("Created GU");
	}
	
	@Test(groups = "ST")
	public void ObjRepoTest() {
		System.out.println("Created ObjRepo");
	}
	
	@Test(groups = "ST")
	public void DDTTest() {
		System.out.println("Created DDT ");
	}
	
	
	
}
