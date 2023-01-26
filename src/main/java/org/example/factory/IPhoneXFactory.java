package org.example.factory;

import org.example.factory.abstractFactory.CountryRulesAbstractFactory;
import org.example.model.iphone.IPhone;
import org.example.model.iphone.IPhoneX;
import org.example.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
