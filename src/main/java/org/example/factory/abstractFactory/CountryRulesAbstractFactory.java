package org.example.factory.abstractFactory;


import org.example.model.certificate.Certificate;
import org.example.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
