package asserts;
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

import getaway01.GetawaySpot;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by laemmel on 08/03/16.
 */
public class VariousAssertExampleTest {

	@Test
	public void simpleAssertTrueTest() {
		GetawaySpot s = ()-> 3.5;
		Assert.assertTrue(s.getWeight() < 4.);
	}

	@Test
	public void simpleAssertThatTest() {
		GetawaySpot s = () -> 3.5;
		assertThat(s.getWeight(),equalTo(3.5));
	}

}
