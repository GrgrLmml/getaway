package getaway01;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by laemmel on 03.03.16.
 */
public class GetawaySpotLocationTest {


    @Test
    public void getsBestSpotWeightOfTwoGetawaySpots() {
        //Arrange
        GetawaySpotLocationCollection spots = new GetawaySpotLocationCollection();
        spots.add(()->5.5);
        spots.add(()->3.7);

        //Act
        double bestWeight = spots.getBestSpotWeight();

        //Assert
        assertThat(bestWeight,equalTo(5.5));

    }

}