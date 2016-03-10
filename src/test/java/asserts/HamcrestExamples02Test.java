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

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * Created by laemmel on 10/03/16.
 */
public class HamcrestExamples02Test {
	@Test
	public void partialStringCompareTest01(){
		assertThat("abc",startsWith("ab"));
	}

	@Test
	public void partialStringCompareTest02(){
		assertThat("abc",endsWith("bc"));
	}

	@Test
	public void hasCollectionSpecificElement() {
		Collection<Double> c = new ArrayList<>();
		c.add(-1.0);
		c.add(Math.PI);
		c.add(1.0);
		assertThat(c,hasItem(Math.PI));
	}

	@Test
	public void containsCollectionAllElementsInSpecificOrder() {

		Collection<Double> c = new ArrayList<>();
		c.add(-1.0);
		c.add(Math.PI);
		c.add(1.0);
		assertThat(c,contains(-1.0,Math.PI));//this will fail
	}
	@Test
	public void containsCollectionAllElementsInAnyOrder() {
		Collection<Double> c = new ArrayList<>();
		c.add(-1.0);
		c.add(Math.PI);
		c.add(1.0);
		assertThat(c,containsInAnyOrder(Math.PI,1.0,-1.0));
	}
}
