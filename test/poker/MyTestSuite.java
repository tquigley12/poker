package poker;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class tests a suite of classes and methods in the poker package.
 * @author tquigley1
 */
@RunWith (Suite.class)
@Suite.SuiteClasses (
        {
            GenerateHandTest.class,
            CardTest.class,
            HandTest.class
        }
)
        
public class MyTestSuite {
    
}
