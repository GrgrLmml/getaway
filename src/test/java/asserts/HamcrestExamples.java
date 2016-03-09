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

package asserts;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Created by laemmel on 09.03.16.
 */
public class HamcrestExamples {



	@Test
	public void floatingPointNumbersTest01() {
		assertThat(5.6+5.8,equalTo(11.4));
	}

	@Test
	public void floatingPointNumbersTest02() {
		Assert.assertTrue(Math.abs((5.6+5.8)-11.4) < 0.0005);
	}

	@Test
	public void floatingPointNumbersTest03() {
		assertThat(5.6+5.8,closeTo(11.4,0.000001));
	}

	@Test
	public void floatingPointNumbersTest04() {
		assertThat(5.6+5.8,is(closeTo(11.4,0.000001)));
	}

	//TODO map example
	//TODO map example

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


}
