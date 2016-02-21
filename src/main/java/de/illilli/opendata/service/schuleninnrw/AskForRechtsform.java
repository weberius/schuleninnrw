package de.illilli.opendata.service.schuleninnrw;

import java.util.ArrayList;
import java.util.List;

import de.illilli.opendata.service.AskFor;

public class AskForRechtsform implements AskFor<List<Rechtsform>> {

	List<Rechtsform> rechtsformList = new ArrayList<Rechtsform>();

	@Override
	public List<Rechtsform> getData() {
		return rechtsformList;
	}

}
