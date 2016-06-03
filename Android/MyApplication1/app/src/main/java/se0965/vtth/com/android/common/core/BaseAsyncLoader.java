package se0965.vtth.com.android.common.core;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;

import se0965.vtth.com.android.factory.AuthorizationFactory;
import se0965.vtth.com.android.factory.FoodFactory;

/**
 * Created by SONY on 5/29/2016.
 */
public abstract class BaseAsyncLoader extends AsyncTask<String, Integer, Object> {

    private Activity activity;
    private ProgressDialog dialog;
    protected FoodFactory factory;
    protected AuthorizationFactory authFactory;
    private OnTaskCompleted listener;

    public BaseAsyncLoader(Activity activity, OnTaskCompleted listener) {
        super();
        this.activity = activity;
        this.listener = listener;
        authFactory = new AuthorizationFactory(activity);
        factory = new FoodFactory(activity);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dialog = new ProgressDialog(activity);
        dialog.setTitle("Loading");
        dialog.setMessage("Load more!!!");
        dialog.setIndeterminate(false);
        dialog.show();
    }

    @Override
    protected void onPostExecute(Object result) {
        super.onPostExecute(result);
        listener.onTaskCompleted(result);
        dialog.dismiss();
    }
}
