package de.illilli.opendata.service.schuleninnrw.schuldaten;

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
import de.illilli.opendata.service.schuleninnrw.traeger.AskForTraeger;

public class AskForSchuldaten implements AskFor<Schuldaten> {

	private static final Logger logger = Logger.getLogger(AskForTraeger.class);
	private static String URL = Config.getProperty("nrw.schulen.schuldaten");

	private Schuldaten daten;
	private InputStream inputStream;

	/**
	 * Read data from remote
	 * 
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public AskForSchuldaten() throws MalformedURLException, IOException {
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
	public AskForSchuldaten(InputStream inputStream) throws JsonParseException, JsonMappingException, IOException {
		this.inputStream = inputStream;
		mapData();
	}

	private void mapData() throws JsonParseException, JsonMappingException, IOException {
		XmlMapper mapper = new XmlMapper();
		try {
			daten = mapper.readValue(inputStream, Schuldaten.class);
		} catch (IOException e) {
			logger.error(e);
		}
	}

	@Override
	public Schuldaten getData() {
		return daten;
	}

}
