package de.illilli.opendata.service.schuleninnrw.rechtsform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Rechtsform")
public class Rechtsform {

	public int Schluessel;
	public String Bezeichnung;

	@Override
	public String toString() {
		return "Rechtsform [Schluessel=" + Schluessel + ", Bezeichnung=" + Bezeichnung + "]";
	}

}
