package de.illilli.opendata.service.schuleninnrw.schulform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Schulform")
public class Schulform {

	public int Schluessel;
	public String Bezeichnung;

	@Override
	public String toString() {
		return "Schulform [Schluessel=" + Schluessel + ", Bezeichnung=" + Bezeichnung + "]";
	}

}
