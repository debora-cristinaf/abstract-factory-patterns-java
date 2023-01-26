package org.example.factory.abstractFactory;

import org.example.model.certificate.Certificate;
import org.example.model.certificate.USCertificate;
import org.example.model.packing.Packing;
import org.example.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
