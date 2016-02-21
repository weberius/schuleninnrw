package de.illilli.opendata.service.schuleninnrw;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Path("/")
public class Service {

	private final static Logger logger = Logger.getLogger(Service.class);

	@Context
	private HttpServletRequest request;
	@Context
	private HttpServletResponse response;

	@PUT
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/put")
	public void putKvbradpositions()
			throws JsonParseException, JsonMappingException, IOException, SQLException, NamingException {
		new PutFacade();
		logger.info("call '" + request.getRequestURI() + "'");
	}

}
