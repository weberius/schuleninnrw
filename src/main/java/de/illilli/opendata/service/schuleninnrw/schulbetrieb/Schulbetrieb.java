package de.illilli.opendata.service.schuleninnrw.schulbetrieb;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Schulbetrieb")
public class Schulbetrieb {

	public int Schluessel;
	public String Bezeichnung;

	@Override
	public String toString() {
		return "Schulbetrieb [Schluessel=" + Schluessel + ", Bezeichnung=" + Bezeichnung + "]";
	}

}
