/****************************************************************************/
// YourGetawaySpot, see https://github.com/GrgrLmml/getaway
// Copyright (C) 2016 Gregor Laemmel (gregor.laemmel@gmail.com)
/****************************************************************************/
//
//   This file is part of YourGetawaySpot.
//   YourGetawaySpot is free software: you can redistribute it and/or modify
//   it under the terms of the GNU General Public License as published by
//   the Free Software Foundation, either version 2 of the License, or
//   (at your option) any later version.
//
/****************************************************************************/

package getaway02;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by laemmel on 03.03.16.
 */
public class GetawaySpot {

    private Query.Location loc;
    private Query.Accommodation ac;
	private double ratePerNight;



	private Set<Query.Amenity> amenitySet = new HashSet<>();

	public Query.Location getLoc() {
		return loc;
	}

	public void setLoc(Query.Location loc) {
		this.loc = loc;
	}

	public Query.Accommodation getAc() {
		return ac;
	}

	public void setAc(Query.Accommodation ac) {
		this.ac = ac;
	}

	public double getRatePerNight() {
		return ratePerNight;
	}

	public void setRatePerNight(double ratePerNight) {
		this.ratePerNight = ratePerNight;
	}

	public void addAmenity(Query.Amenity am) {
		this.amenitySet.add(am);
	}

	public Set<Query.Amenity> getAmenities() {
		return amenitySet;
	}
}
