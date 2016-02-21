package de.illilli.opendata.service.schuleninnrw.schulform;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Config;

public class AskForSchulformschluessel implements AskFor<Daten> {

	private static final Logger logger = Logger.getLogger(AskForSchulformschluessel.class);
	private static String URL = Config.getProperty("nrw.schulen.schulformschluessel");

	private Daten schluesselList;
	private InputStream inputStream;

	/**
	 * Read data from remote
	 * 
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public AskForSchulformschluessel() throws MalformedURLException, IOException {
		this.inputStream = new URL(URL).openStream();
		mapData();
	}

	/**
	 * Use this if inputStream is known
	 * 
	 * @param inputStream
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public AskForSchulformschluessel(InputStream inputStream)
			throws JsonParseException, JsonMappingException, IOException {
		this.inputStream = inputStream;
		mapData();
	}

	private void mapData() throws JsonParseException, JsonMappingException, IOException {
		XmlMapper mapper = new XmlMapper();
		try {
			schluesselList = mapper.readValue(inputStream, Daten.class);
		} catch (IOException e) {
			logger.error(e);
		}
	}

	@Override
	public Daten getData() {
		return schluesselList;
	}

}
