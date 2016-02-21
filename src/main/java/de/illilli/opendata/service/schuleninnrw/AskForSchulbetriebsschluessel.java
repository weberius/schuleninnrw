package de.illilli.opendata.service.schuleninnrw;

import java.util.ArrayList;
import java.util.List;

import de.illilli.opendata.service.AskFor;

public class AskForSchulbetriebsschluessel implements AskFor<List<Schulbetriebsschluessel>> {

	List<Schulbetriebsschluessel> schluesselList = new ArrayList<Schulbetriebsschluessel>();

	@Override
	public List<Schulbetriebsschluessel> getData() {
		return schluesselList;
	}

}
