package testNG;

import org.testng.annotations.Test;

public class GroupsinTestng {
	@Test(groups={"smoke"})
	public void tc1() {
		System.out.println("tc1: smoke");
	}
	@Test(groups={"regression"})
	public void tc2() {
		System.out.println("tc2: regression");
	}
	@Test(groups={"sanity"})
	public void tc3() {
		System.out.println("tc3: sanity");
	}
	@Test(groups={"functional"})
	public void tc4() {
		System.out.println("tc4: functional");
	}
	@Test(groups={"smoke","sanity"})
	public void tc5() {
		System.out.println("tc5: smoke & sanity");
	}
	@Test(groups={"smoke","functional"})
	public void tc6() {
		System.out.println("tc6: smoke & functional");
	}
	@Test(groups={"regression","sanity","functional"})
	public void tc7() {
		System.out.println("tc7: regression,sanity,functional");
	}
	@Test(groups={"smoke","regression","sanity","functional"})
	public void tc8() {
		System.out.println("tc8: smoke,regression,sanity,functional");
	}
}
