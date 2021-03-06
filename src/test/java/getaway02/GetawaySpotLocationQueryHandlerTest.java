package getaway02;
/* *********************************************************************** *
 * project: org.matsim.*
 *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2014 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by laemmel on 05/03/16.
 */
public class GetawaySpotLocationQueryHandlerTest {

	@Test
	public void testNullQuery() {

		//Arrange
		GetawaySpotLocationQueryHandler handler =
				new GetawaySpotLocationQueryHandler();

		GetawaySpot s1 = new GetawaySpot();
		s1.setAc(Query.Accommodation.BED_AND_BREAKFEST);
		s1.setLoc(Query.Location.CITY_TRIP);
		s1.addAmenity(Query.Amenity.WIFI);
		s1.setRatePerNight(60.);
		handler.add(s1);

		Query q = null;
		//Act
		GetawaySpot bestMatch = handler.getBestMatch(q);

		//Assert
		Assert.assertTrue(bestMatch == null);
	}

	@Test
	public void testSpotTooExpensive() {

		//Arrange
		GetawaySpotLocationQueryHandler handler =
				new GetawaySpotLocationQueryHandler();

		GetawaySpot s1 = new GetawaySpot();
		s1.setAc(Query.Accommodation.BED_AND_BREAKFEST);
		s1.setLoc(Query.Location.CITY_TRIP);
		s1.addAmenity(Query.Amenity.WIFI);
		s1.setRatePerNight(60.);
		handler.add(s1);

		Query q = new Query();
		q.setAccommodation(Query.Accommodation.BED_AND_BREAKFEST);
		q.setLocation(Query.Location.CITY_TRIP);
		q.addAmenity(Query.Amenity.WIFI);
		q.setDuration(10);
		q.setMaxExpense(500.);

		//Act
		GetawaySpot bestMatch = handler.getBestMatch(q);

		//Assert
		Assert.assertTrue(bestMatch == null);
	}
}
