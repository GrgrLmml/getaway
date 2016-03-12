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
public class GetawaySpotLocationQuerryHandler {

	private static final double SCORE_THRESHOLD = 2.;

    private List<GetawaySpot> spots = new ArrayList<>();

    public void add(GetawaySpot spot) {
        spots.add(spot);
    }

    public GetawaySpot getBestMatch(Query q) {
		if (q == null) {
			return null;
		}
		GetawaySpot bestMatch = null;
		double bestScore = Double.NEGATIVE_INFINITY;

        for (GetawaySpot spot : spots) {
			double score = 0;
			//expenses
			int duration = q.getDuration();
			double totalExpenses = duration * spot.getRatePerNight();
			if (totalExpenses > q.getMaxExpenses()) {
				continue;
			}

			//amenities
			for (Query.Amenity am : q.getAmenities()) {
				if (spot.getAmenities().contains(am)) {
					score += 1.;
				} else {
					score -= 1.;
				}
			}
			if (spot.getAmenities().size() > q.getAmenities().size()) {
				score += (spot.getAmenities().size()-q.getAmenities().size())*0.5;
			}

			//accommodation
			if (q.getAccommodation() == spot.getAc()) {
				score += 1.;
			} else {
				if (q.isMandatoryAccommodation()) {//is mandatory
					continue;
				} else if (q.getLocation() == spot.getLoc()){
					score -= 1;
				} else {
					continue;
				}
			}

			//location
			if (q.getLocation() == spot.getLoc()) {
				score += 1.;
			} else {
				if (q.isMandatoryLocation()) {
					continue;
				} else if (q.getAccommodation() == spot.getAc()){
					score -= 1;
				} else {
					continue;
				}
			}

			//evaluate score
			if (score > SCORE_THRESHOLD && score > bestScore) {
				bestScore = score;
				bestMatch = spot;
			}
		}


        return bestMatch;
    }
}
