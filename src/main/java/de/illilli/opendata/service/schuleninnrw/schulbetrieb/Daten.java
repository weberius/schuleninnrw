package de.illilli.opendata.service.schuleninnrw.schulbetrieb;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Daten {

	@JacksonXmlElementWrapper(useWrapping = false)
	public List<Schulbetrieb> Schulbetrieb;

	@Override
	public String toString() {
		return "Daten [Schulbetrieb=" + Schulbetrieb + "]";
	}

}
