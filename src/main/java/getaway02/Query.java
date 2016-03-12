/****************************************************************************/
// SUMO, Simulation of Urban MObility; see http://sumo.dlr.de/
// Copyright (C) 2001-2016 DLR (http://www.dlr.de/) and contributors
/****************************************************************************/
//
//   This file is part of SUMO.
//   SUMO is free software: you can redistribute it and/or modify
//   it under the terms of the GNU General Public License as published by
//   the Free Software Foundation, either version 3 of the License, or
//   (at your option) any later version.
//
/****************************************************************************/

package getaway02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laemmel on 04.03.16.
 */
public class Query {

	public enum Location {SEASIDE, MOUNTAINS, CITY_TRIP} //one of

	public enum Accommodation {HOTEL, HOLIDAY_APARTMENT, BED_AND_BREAKFEST} //one of

	public enum Amenity {BBQ, SWIMMING_POOL, WIFI} //any number

	private Location location;
	private boolean mandatoryLocation = false;
	private double maxExpenses;
	private int duration;
	private Accommodation accommodation;
	private boolean mandatoryAccommodation = false;
	private List<Amenity> amenities = new ArrayList<>();

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void addAmenity(Amenity am) {
		this.amenities.add(am);
	}

	public List<Amenity> getAmenities() {
		return this.amenities;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isMandatoryLocation() {
		return mandatoryLocation;
	}

	public void setMandatoryLocation(boolean mandatoryLocation) {
		this.mandatoryLocation = mandatoryLocation;
	}

	public double getMaxExpenses() {
		return maxExpenses;
	}

	public void setMaxExpense(double maxExpenses) {
		this.maxExpenses = maxExpenses;
	}

	public Accommodation getAccommodation() {
		return accommodation;
	}

	public void setAccommodation(Accommodation accommodation) {
		this.accommodation = accommodation;
	}

	public boolean isMandatoryAccommodation() {
		return mandatoryAccommodation;
	}

	public void setMandatoryAccommodation(boolean mandatoryAccommodation) {
		this.mandatoryAccommodation = mandatoryAccommodation;
	}

}
