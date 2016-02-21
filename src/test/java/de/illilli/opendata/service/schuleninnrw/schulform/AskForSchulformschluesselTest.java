package de.illilli.opendata.service.schuleninnrw.schulform;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.schuleninnrw.schulform.AskForSchulformschluessel;
import de.illilli.opendata.service.schuleninnrw.schulform.Daten;

public class AskForSchulformschluesselTest {

	@Test
	public void testGetData() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/key_schulformschluessel.xml");
		AskFor<Daten> askFor = new AskForSchulformschluessel(inputStream);
		System.out.println(askFor.getData());
	}

}
