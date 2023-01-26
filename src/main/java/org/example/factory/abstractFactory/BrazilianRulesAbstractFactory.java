package org.example.factory.abstractFactory;


import org.example.model.certificate.BrazilianCertificate;
import org.example.model.certificate.Certificate;
import org.example.model.packing.BrazilianPacking;
import org.example.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
