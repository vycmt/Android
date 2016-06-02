package se0965.vtth.com.android.dataloader;

import android.app.Activity;
import android.util.Log;

import se0965.vtth.com.android.common.core.BaseAsyncLoader;
import se0965.vtth.com.android.common.core.OnTaskCompleted;

/**
 * Created by SONY on 5/30/2016.
 */
public class FoodDetailAsyncLoader extends BaseAsyncLoader {

    public FoodDetailAsyncLoader(Activity activity, OnTaskCompleted listener) {
        super(activity, listener);
    }

    @Override
    protected Object doInBackground(String... params) {
        try {
            String token = authFactory.getAccessToken().getValue();
            return factory.getFoodById(params[0], token);
        } catch (Exception e) {
            Log.e(getClass().getName(), "API call fail Dao fail " + e.getMessage());
            return null;
        }
    }
}
