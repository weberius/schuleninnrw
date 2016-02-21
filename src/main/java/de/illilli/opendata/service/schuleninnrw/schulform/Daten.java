package de.illilli.opendata.service.schuleninnrw.schulform;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Daten {

	@JacksonXmlElementWrapper(useWrapping = false)
	public List<Schulform> Schulform;

	@Override
	public String toString() {
		return "Daten [Schulform=" + Schulform + "]";
	}

}
