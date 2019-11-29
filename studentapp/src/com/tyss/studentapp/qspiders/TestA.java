package com.tyss.studentapp.qspiders;

//import com.tyss.studentapp.jspiders.Angular;
//import com.tyss.studentapp.jspiders.React;

import com.tyss.studentapp.jspiders.*;


public class TestA {

	public static void main(String[] args) {
		
		QTP q = new QTP();
		q.teachQTP();
		
		Selenium se = new Selenium();
		se.teachSelenium();
		
		//com.tyss.studentapp.jspiders.Angular a = new com.tyss.studentapp.jspiders.Angular;
		//com.tyss.studentapp.jspiders.React r = new com.tyss.studentapp.jspiders.React;
		
		Angular a = new Angular();
		a.teachAngular();
		
		React r = new React();
		r.teachReact();
	}
	

}
