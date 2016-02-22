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
	public String Gemeindeschluessel;
	public int KoordinatenRechtswert;
	public int KoordinatenHochwert;
	public int Schulbetriebsschluessel;
	public String Schulbetriebsdatum;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EMail == null) ? 0 : EMail.hashCode());
		result = prime * result + ((Fax == null) ? 0 : Fax.hashCode());
		result = prime * result + ((Faxvorwahl == null) ? 0 : Faxvorwahl.hashCode());
		result = prime * result + ((Gemeindeschluessel == null) ? 0 : Gemeindeschluessel.hashCode());
		result = prime * result + ((Homepage == null) ? 0 : Homepage.hashCode());
		result = prime * result + KoordinatenHochwert;
		result = prime * result + KoordinatenRechtswert;
		result = prime * result + ((Kurzbezeichnung == null) ? 0 : Kurzbezeichnung.hashCode());
		result = prime * result + ((Ort == null) ? 0 : Ort.hashCode());
		result = prime * result + PLZ;
		result = prime * result + Rechtsform;
		result = prime * result + ((Schulbetriebsdatum == null) ? 0 : Schulbetriebsdatum.hashCode());
		result = prime * result + Schulbetriebsschluessel;
		result = prime * result + ((Schulbezeichnung_1 == null) ? 0 : Schulbezeichnung_1.hashCode());
		result = prime * result + ((Schulbezeichnung_2 == null) ? 0 : Schulbezeichnung_2.hashCode());
		result = prime * result + ((Schulbezeichnung_3 == null) ? 0 : Schulbezeichnung_3.hashCode());
		result = prime * result + Schulform;
		result = prime * result + Schulnummer;
		result = prime * result + ((Strasse == null) ? 0 : Strasse.hashCode());
		result = prime * result + ((Telefon == null) ? 0 : Telefon.hashCode());
		result = prime * result + ((Telefonvorwahl == null) ? 0 : Telefonvorwahl.hashCode());
		result = prime * result + Traegernummer;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schule other = (Schule) obj;
		if (EMail == null) {
			if (other.EMail != null)
				return false;
		} else if (!EMail.equals(other.EMail))
			return false;
		if (Fax == null) {
			if (other.Fax != null)
				return false;
		} else if (!Fax.equals(other.Fax))
			return false;
		if (Faxvorwahl == null) {
			if (other.Faxvorwahl != null)
				return false;
		} else if (!Faxvorwahl.equals(other.Faxvorwahl))
			return false;
		if (Gemeindeschluessel == null) {
			if (other.Gemeindeschluessel != null)
				return false;
		} else if (!Gemeindeschluessel.equals(other.Gemeindeschluessel))
			return false;
		if (Homepage == null) {
			if (other.Homepage != null)
				return false;
		} else if (!Homepage.equals(other.Homepage))
			return false;
		if (KoordinatenHochwert != other.KoordinatenHochwert)
			return false;
		if (KoordinatenRechtswert != other.KoordinatenRechtswert)
			return false;
		if (Kurzbezeichnung == null) {
			if (other.Kurzbezeichnung != null)
				return false;
		} else if (!Kurzbezeichnung.equals(other.Kurzbezeichnung))
			return false;
		if (Ort == null) {
			if (other.Ort != null)
				return false;
		} else if (!Ort.equals(other.Ort))
			return false;
		if (PLZ != other.PLZ)
			return false;
		if (Rechtsform != other.Rechtsform)
			return false;
		if (Schulbetriebsdatum == null) {
			if (other.Schulbetriebsdatum != null)
				return false;
		} else if (!Schulbetriebsdatum.equals(other.Schulbetriebsdatum))
			return false;
		if (Schulbetriebsschluessel != other.Schulbetriebsschluessel)
			return false;
		if (Schulbezeichnung_1 == null) {
			if (other.Schulbezeichnung_1 != null)
				return false;
		} else if (!Schulbezeichnung_1.equals(other.Schulbezeichnung_1))
			return false;
		if (Schulbezeichnung_2 == null) {
			if (other.Schulbezeichnung_2 != null)
				return false;
		} else if (!Schulbezeichnung_2.equals(other.Schulbezeichnung_2))
			return false;
		if (Schulbezeichnung_3 == null) {
			if (other.Schulbezeichnung_3 != null)
				return false;
		} else if (!Schulbezeichnung_3.equals(other.Schulbezeichnung_3))
			return false;
		if (Schulform != other.Schulform)
			return false;
		if (Schulnummer != other.Schulnummer)
			return false;
		if (Strasse == null) {
			if (other.Strasse != null)
				return false;
		} else if (!Strasse.equals(other.Strasse))
			return false;
		if (Telefon == null) {
			if (other.Telefon != null)
				return false;
		} else if (!Telefon.equals(other.Telefon))
			return false;
		if (Telefonvorwahl == null) {
			if (other.Telefonvorwahl != null)
				return false;
		} else if (!Telefonvorwahl.equals(other.Telefonvorwahl))
			return false;
		if (Traegernummer != other.Traegernummer)
			return false;
		return true;
	}

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
