package se0965.vtth.com.android.dataloader;

import android.app.Activity;

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
        return null;
    }
}
