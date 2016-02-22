package de.illilli.opendata.service.schuleninnrw.schuldaten;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import de.illilli.opendata.service.AskFor;

public class AskForSchuldatenTest {

	@Test
	public void testNumberOfEntries() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/schuldaten.xml");
		AskFor<Schuldaten> askFor = new AskForSchuldaten(inputStream);
		Integer expected = 6012;
		Integer actual = askFor.getData().Schule.size();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testFirstEntriy() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/schuldaten.xml");
		AskFor<Schuldaten> askFor = new AskForSchuldaten(inputStream);
		Schule expected = AskForSchuldatenTest.get100018();
		Schule actual = askFor.getData().Schule.get(0);
		Assert.assertEquals(expected, actual);
	}

	public static Schule get100018() {
		Schule schule = new Schule();
		schule.Schulnummer = 100018;
		schule.Schulform = 17;
		schule.Schulbezeichnung_1 = "Freie Waldorfschule Rudolf Steiner Schu-";
		schule.Schulbezeichnung_2 = "le u. Parzivalsch. m. Heliandzw.,Förder-";
		schule.Schulbezeichnung_3 = "schule,Staatl. genehm.priv. Ersatzschule";
		schule.Kurzbezeichnung = "Essen, FW Schellstraße";
		schule.PLZ = 45134;
		schule.Ort = "Essen";
		schule.Strasse = "Schellstr. 47";
		schule.Telefonvorwahl = "0201";
		schule.Telefon = "435150";
		schule.Faxvorwahl = "0201";
		schule.Fax = "4351511";
		schule.EMail = "100018@schule.nrw.de";
		schule.Homepage = "http://www.waldorfschule-essen.de";
		schule.Rechtsform = 2;
		schule.Traegernummer = 70610;
		schule.Gemeindeschluessel = "05113000";
		schule.KoordinatenRechtswert = 25716820;
		schule.KoordinatenHochwert = 56982960;
		schule.Schulbetriebsschluessel = 1;
		schule.Schulbetriebsdatum = "01.08.1973";

		return schule;
	}

}
