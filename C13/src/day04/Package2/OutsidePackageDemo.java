package day04.Package2;

import day04.one.InsidePackage;

public class OutsidePackageDemo {

	public static void main(String[] args) {
		InsidePackage ii = new InsidePackage();
		
		ii.pubMethod();
		
		ii.pubVar = 100;
		ii.pubMethod();
		
	}

}