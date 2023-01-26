package org.example;

import org.example.factory.IPhone11Factory;
import org.example.factory.IPhoneFactory;
import org.example.factory.IPhoneXFactory;
import org.example.factory.abstractFactory.BrazilianRulesAbstractFactory;
import org.example.factory.abstractFactory.CountryRulesAbstractFactory;
import org.example.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
