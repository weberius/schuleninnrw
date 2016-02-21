package de.illilli.opendata.service.schuleninnrw;

import java.util.ArrayList;
import java.util.List;

import de.illilli.opendata.service.AskFor;

public class AskForTraeger implements AskFor<List<Traeger>> {

	List<Traeger> traegerList = new ArrayList<Traeger>();

	@Override
	public List<Traeger> getData() {
		return traegerList;
	}

}
