package getaway01;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by laemmel on 03.03.16.
 */
public class GetawaySpotLocationTest {

    @Test
    public void getBestSpotWeightOfTwoGetawaySpots() {
        //Arrange
        GetawaySpotLocationCollection spots =
                new GetawaySpotLocationCollection();
        spots.add(()->5.5);
        spots.add(()->3.7);

        //Act
        double bestScore = spots.getBestSpotWeight();

        //Assert
        Assert.assertTrue(bestScore == 5.5);

    }

}
