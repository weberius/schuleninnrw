package de.illilli.opendata.service.schuleninnrw.traeger;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Traeger")
public class Traeger {

	public int Traegernummer;
	public String Traegerbezeichnung_1;
	public String Traegerbezeichnung_2;
	public String Traegerbezeichnung_3;
	public String Kurzbezeichnung;
	public int PLZ;
	public String Ort;
	public String Strasse;
	public String Telefonvorwahl;
	public String Telefon;
	public String Faxvorwahl;
	public String Fax;

	@Override
	public String toString() {
		return "Traeger [Traegernummer=" + Traegernummer + ", Traegerbezeichnung_1=" + Traegerbezeichnung_1
				+ ", Traegerbezeichnung_2=" + Traegerbezeichnung_2 + ", Traegerbezeichnung_3=" + Traegerbezeichnung_3
				+ ", Kurzbezeichnung=" + Kurzbezeichnung + ", PLZ=" + PLZ + ", Ort=" + Ort + ", Strasse=" + Strasse
				+ ", Telefonvorwahl=" + Telefonvorwahl + ", Telefon=" + Telefon + ", Faxvorwahl=" + Faxvorwahl
				+ ", Fax=" + Fax + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Fax == null) ? 0 : Fax.hashCode());
		result = prime * result + ((Faxvorwahl == null) ? 0 : Faxvorwahl.hashCode());
		result = prime * result + ((Kurzbezeichnung == null) ? 0 : Kurzbezeichnung.hashCode());
		result = prime * result + ((Ort == null) ? 0 : Ort.hashCode());
		result = prime * result + PLZ;
		result = prime * result + ((Strasse == null) ? 0 : Strasse.hashCode());
		result = prime * result + ((Telefon == null) ? 0 : Telefon.hashCode());
		result = prime * result + ((Telefonvorwahl == null) ? 0 : Telefonvorwahl.hashCode());
		result = prime * result + ((Traegerbezeichnung_1 == null) ? 0 : Traegerbezeichnung_1.hashCode());
		result = prime * result + ((Traegerbezeichnung_2 == null) ? 0 : Traegerbezeichnung_2.hashCode());
		result = prime * result + ((Traegerbezeichnung_3 == null) ? 0 : Traegerbezeichnung_3.hashCode());
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
		Traeger other = (Traeger) obj;
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
		if (Traegerbezeichnung_1 == null) {
			if (other.Traegerbezeichnung_1 != null)
				return false;
		} else if (!Traegerbezeichnung_1.equals(other.Traegerbezeichnung_1))
			return false;
		if (Traegerbezeichnung_2 == null) {
			if (other.Traegerbezeichnung_2 != null)
				return false;
		} else if (!Traegerbezeichnung_2.equals(other.Traegerbezeichnung_2))
			return false;
		if (Traegerbezeichnung_3 == null) {
			if (other.Traegerbezeichnung_3 != null)
				return false;
		} else if (!Traegerbezeichnung_3.equals(other.Traegerbezeichnung_3))
			return false;
		if (Traegernummer != other.Traegernummer)
			return false;
		return true;
	}

}
