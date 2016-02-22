package de.illilli.opendata.service.schuleninnrw.schuldaten;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Schule")
public class Schule {

	public int Schulnummer;
	public int Schulform;
	public String Schulbezeichnung_1;
	public String Schulbezeichnung_2;
	public String Schulbezeichnung_3;
	public String Kurzbezeichnung;
	public int PLZ;
	public String Ort;
	public String Strasse;
	public String Telefonvorwahl;
	public String Telefon;
	public String Faxvorwahl;
	public String Fax;
	@JacksonXmlElementWrapper(localName = "E-Mail")
	public String EMail;
	public String Homepage;
	public int Rechtsform;
	public int Traegernummer;
	public int Gemeindeschluessel;
	public int KoordinatenRechtswert;
	public int KoordinatenHochwert;
	public int Schulbetriebsschluessel;
	public String Schulbetriebsdatum;

	@Override
	public String toString() {
		return "Schule [Schulnummer=" + Schulnummer + ", Schulform=" + Schulform + ", Schulbezeichnung_1="
				+ Schulbezeichnung_1 + ", Schulbezeichnung_2=" + Schulbezeichnung_2 + ", Schulbezeichnung_3="
				+ Schulbezeichnung_3 + ", Kurzbezeichnung=" + Kurzbezeichnung + ", PLZ=" + PLZ + ", Ort=" + Ort
				+ ", Strasse=" + Strasse + ", Telefonvorwahl=" + Telefonvorwahl + ", Telefon=" + Telefon
				+ ", Faxvorwahl=" + Faxvorwahl + ", Fax=" + Fax + ", EMail=" + EMail + ", Homepage=" + Homepage
				+ ", Rechtsform=" + Rechtsform + ", Traegernummer=" + Traegernummer + ", Gemeindeschluessel="
				+ Gemeindeschluessel + ", KoordinatenRechtswert=" + KoordinatenRechtswert + ", KoordinatenHochwert="
				+ KoordinatenHochwert + ", Schulbetriebsschluessel=" + Schulbetriebsschluessel + ", Schulbetriebsdatum="
				+ Schulbetriebsdatum + "]";
	}

}
