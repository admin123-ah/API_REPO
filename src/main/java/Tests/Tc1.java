package Tests;

import org.testng.annotations.Test;

import Base.Base;

public class Tc1 extends Base {

	@Test
	public void GetTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);

	}

	@Test
	public void GetURL() {
		String URL = driver.getTitle();
		System.out.println(URL);

	}

	@Test
	public void GetWindowHandle() {
		String WHandle = driver.getTitle();
		System.out.println(WHandle);

	}

}
