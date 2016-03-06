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

	public enum Location {SEASIDE, MOUNTAINS, CITY_TRIP}

	public enum Accommodation {HOTEL, HOLIDAY_APARTMENT, BED_AND_BREAKFEST}

	public enum Amenity {BBQ, SWIMMING_POOL, WIFI} //nice to have

	private Location loc;
	private boolean locStared = false;
	private double maxExpenses;
	private int duration;
	private Accommodation ac;
	private boolean acStared = false;
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

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public boolean isLocStared() {
		return locStared;
	}

	public void setLocStared(boolean locStared) {
		this.locStared = locStared;
	}

	public double getMaxExpenses() {
		return maxExpenses;
	}

	public void setMaxExpense(double maxExpenses) {
		this.maxExpenses = maxExpenses;
	}

	public Accommodation getAc() {
		return ac;
	}

	public void setAc(Accommodation ac) {
		this.ac = ac;
	}

	public boolean isAcStared() {
		return acStared;
	}

	public void setAcStared(boolean acStared) {
		this.acStared = acStared;
	}




}
