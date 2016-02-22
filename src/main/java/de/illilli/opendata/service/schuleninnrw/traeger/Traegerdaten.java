package de.illilli.opendata.service.schuleninnrw.traeger;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Traegerdaten {

	@JacksonXmlElementWrapper(useWrapping = false)
	public List<Traeger> Traeger;

	@Override
	public String toString() {
		return "Daten [Traeger=" + Traeger + "]";
	}

}
