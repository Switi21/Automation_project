package com.testNg;

import org.testng.annotations.Test;

public class Test_priority {
	public class Test_Priority {
		@Test(priority=0)
		public void test()
		{
		System.out.println("Test");
		}

		@Test(priority=1)
		public void Project()
		{
		System.out.println("Project");
		}

		@Test(priority=2)
		public void Karthik()
		{
		System.out.println("Kathik");

		}

		@Test
		public void Neha()
		{
		System.out.println("Neha");

		}

		@Test
		public void M_Yellow()
		{
		System.out.println("M");

		}
		}
}
