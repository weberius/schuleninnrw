package de.illilli.opendata.service.schuleninnrw.traeger;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import de.illilli.opendata.service.AskFor;

public class AskForTraegerTest {

	@Test
	public void testNumberOfEntries() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/key_traeger.xml");
		AskFor<Traegerdaten> askFor = new AskForTraeger(inputStream);
		Integer expected = 775;
		Integer actual = askFor.getData().Traeger.size();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testFirstEntry() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/key_traeger.xml");
		AskFor<Traegerdaten> askFor = new AskForTraeger(inputStream);
		Traeger expected = AskForTraegerTest.get10017();
		Traeger actual = askFor.getData().Traeger.get(0);
		Assert.assertEquals(expected, actual);
	}

	public static Traeger get10017() {
		Traeger traeger = new Traeger();
		traeger.Traegernummer = 10017;
		traeger.Traegerbezeichnung_1 = "Land Nordrhein-Westfalen";
		traeger.Traegerbezeichnung_2 = "Ministerium für Schule und Weiterbildung";
		traeger.Traegerbezeichnung_3 = "";
		traeger.Kurzbezeichnung = "Land Nordrhein-Westfalen";
		traeger.PLZ = 40221;
		traeger.Ort = "Düsseldorf";
		traeger.Strasse = "Völklinger Str. 49";
		traeger.Telefonvorwahl = "0211";
		traeger.Telefon = "5867-40";
		traeger.Faxvorwahl = "0211";
		traeger.Fax = "58673220";

		return traeger;
	}

}
