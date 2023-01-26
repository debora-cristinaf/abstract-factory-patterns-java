package org.example.factory;

import org.example.factory.abstractFactory.CountryRulesAbstractFactory;
import org.example.model.iphone.IPhone;

public abstract class IPhoneFactory {
	CountryRulesAbstractFactory rules;

	public IPhoneFactory(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public IPhone orderIPhone(String level) {
		IPhone device = null;

		device = createIPhone(level);

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}

	protected abstract IPhone createIPhone(String level);
}
