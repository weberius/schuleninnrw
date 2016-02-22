package de.illilli.opendata.service.schuleninnrw.rechtsform;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import de.illilli.opendata.service.AskFor;

public class AskForRechtsformTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNumberOfEntries() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/key_rechtsform.xml");
		AskFor<Daten> askFor = new AskForRechtsform(inputStream);
		Integer expected = 2;
		Integer actual = askFor.getData().Rechtsform.size();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testFirstEntry() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/key_rechtsform.xml");
		AskFor<Daten> askFor = new AskForRechtsform(inputStream);
		String expected = "in öffentlicher Trägerschaft";
		String actual = askFor.getData().Rechtsform.get(0).Bezeichnung;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testSecondEntry() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/key_rechtsform.xml");
		AskFor<Daten> askFor = new AskForRechtsform(inputStream);
		String expected = "in Trägerschaft eines Ersatzschulträgers (privat)";
		String actual = askFor.getData().Rechtsform.get(1).Bezeichnung;
		Assert.assertEquals(expected, actual);
	}

}
