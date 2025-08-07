package LISTINERS;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass_UItility.Base_Class;
@Listeners(ListenersUtility.Listeners.class)

public class Handling_Listernes extends Base_Class {
	@Test 
	public void listenerstest() {
		
		Reporter.log("listenerss tesr",true);
		
	}

}
