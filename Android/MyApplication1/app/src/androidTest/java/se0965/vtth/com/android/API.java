package se0965.vtth.com.android;

import android.test.AndroidTestCase;

import se0965.vtth.com.android.factory.FoodFactory;

/**
 * Created by SONY on 6/7/2016.
 */
public class API extends AndroidTestCase {

    FoodFactory factory;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        factory = new FoodFactory(getContext());
    }
}
