package de.illilli.opendata.service.schuleninnrw;

import java.util.ArrayList;
import java.util.List;

import de.illilli.opendata.service.AskFor;

public class AskForSchulformschluessel implements AskFor<List<Schulformschluessel>> {

	List<Schulformschluessel> schluesselList = new ArrayList<Schulformschluessel>();

	@Override
	public List<Schulformschluessel> getData() {
		return null;
	}

}
