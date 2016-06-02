package se0965.vtth.com.android.dataloader;

import android.app.Activity;
import android.util.Log;

import se0965.vtth.com.android.common.core.BaseAsyncLoader;
import se0965.vtth.com.android.common.core.OnTaskCompleted;

/**
 * Created by SONY on 5/30/2016.
 */
public class FoodsAsyncLoader extends BaseAsyncLoader {

    public FoodsAsyncLoader(Activity activity, OnTaskCompleted listener) {
        super(activity, listener);
    }

    @Override
    protected Object doInBackground(String... params) {
        String keys = params[0];
        String start = params[1];
        String end = params[2];
        try {
            String token = authFactory.getAccessToken().getValue();
            return factory.getFoods(keys, start, end, token);
        } catch (Exception e) {
            Log.e(getClass().getName(), "API call fail " + e.getMessage());

        }
        return null;
    }
}
