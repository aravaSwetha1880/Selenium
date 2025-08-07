package Annotions;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClass_UItility.Base_Class;

public class Utilizing_BaseClass extends Base_Class {
	@Test
	public void textscript() {
		Reporter.log("create a product",true);
	}
		@Test
		public void modify() {
			Reporter.log("modify the product",true);
		}
	}


