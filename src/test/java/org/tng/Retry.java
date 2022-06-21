package org.tng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	
	int min = 0; int max =3;
	public boolean retry(ITestResult arg0) {
		// 3<3
		if(min<max) {
			min++; //1
			return true;
		}
		return false;
	}

}
