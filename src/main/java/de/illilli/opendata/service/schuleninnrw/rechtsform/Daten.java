package de.illilli.opendata.service.schuleninnrw.rechtsform;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Daten {

	@JacksonXmlElementWrapper(useWrapping = false)
	public List<Rechtsform> Rechtsform;

	@Override
	public String toString() {
		return "Daten [Rechtsform=" + Rechtsform + "]";
	}

}
