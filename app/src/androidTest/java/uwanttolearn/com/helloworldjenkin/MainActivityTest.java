package uwanttolearn.com.helloworldjenkin;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;

/**
 * Created by Hafiz Waleed Hussain on 4/19/2015.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    public void testString() throws Exception {

        Assert.assertEquals("Hello World",getActivity().test);
    }
}
