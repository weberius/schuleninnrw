package de.illilli.opendata.service.schuleninnrw.schuldaten;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Schuldaten {

	@JacksonXmlElementWrapper(useWrapping = false)
	public List<Schule> Schule;

	@Override
	public String toString() {
		return "Daten [Schule=" + Schule + "]";
	}

}
