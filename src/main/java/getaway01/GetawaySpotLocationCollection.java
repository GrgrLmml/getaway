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

package getaway01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laemmel on 04.03.16.
 */
public class GetawaySpotLocationCollection {

    private List<GetawaySpot> spots = new ArrayList<>();

    public void add(GetawaySpot spot) {
        spots.add(spot);
    }

    public double getBestSpotWeight() {
        double bestWeight = Double.NEGATIVE_INFINITY;
        for (GetawaySpot spot : spots) {
            if (spot.getWeight() > bestWeight) {
                bestWeight = spot.getWeight();
            }
        }
        return bestWeight;
    }
}
