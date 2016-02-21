package de.illilli.opendata.service.schuleninnrw;

import java.util.ArrayList;
import java.util.List;

import de.illilli.opendata.service.AskFor;

public class AskForSchuldaten implements AskFor<List<Schuldaten>> {

	List<Schuldaten> schuldatenList = new ArrayList<Schuldaten>();

	@Override
	public List<Schuldaten> getData() {
		return schuldatenList;
	}

}
