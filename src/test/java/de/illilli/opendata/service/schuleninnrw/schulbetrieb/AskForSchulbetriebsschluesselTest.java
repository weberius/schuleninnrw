package de.illilli.opendata.service.schuleninnrw.schulbetrieb;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import de.illilli.opendata.service.AskFor;

public class AskForSchulbetriebsschluesselTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNumberOfEntries() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/key_schulbetriebsschluessel.xml");
		AskFor<Daten> askFor = new AskForSchulbetriebsschluessel(inputStream);
		Integer expected = 8;
		Integer actual = askFor.getData().Schulbetrieb.size();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testFirstEntry() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/key_schulbetriebsschluessel.xml");
		AskFor<Daten> askFor = new AskForSchulbetriebsschluessel(inputStream);
		String expected = "Schule wird zum Ende des laufenden Schuljahres aufgelöst";
		String actual = askFor.getData().Schulbetrieb.get(0).Bezeichnung;
		Assert.assertEquals(expected, actual);
	}

}
