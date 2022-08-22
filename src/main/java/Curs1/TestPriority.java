package Curs1;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 0)
	public void one() {
		System.out.println("First");
	}
	@Test(priority = 1)
	public void two() {
		System.out.println("Second");
	}
	@Test(priority = 2)
	public void three() {
		System.out.println("Third");
	}
	@Test
	public void four() {
		System.out.println("Forth");
	}
	@Test
	public void five() {
		System.out.println("Fifth");
	}
}

