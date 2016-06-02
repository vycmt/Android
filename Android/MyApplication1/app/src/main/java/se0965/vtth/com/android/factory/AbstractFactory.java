package se0965.vtth.com.android.factory;

import android.app.Application;
import android.content.Context;

import com.fasterxml.jackson.databind.ObjectMapper;

import se0965.vtth.com.android.common.core.JsonParser;
import se0965.vtth.com.android.common.restclient.RestClient;

/**
 * Created by SONY on 5/30/2016.
 */
public class AbstractFactory {

    protected static final ObjectMapper JSON_MAPPER = new ObjectMapper();
    protected static final JsonParser PARSER = new JsonParser();
    protected RestClient restClient;
    protected Application context;

    public AbstractFactory(Context context) {
        this(context, "");
    }

    public AbstractFactory(Context context, String sub) {
        String webAPI = "http://localhost:8080" + sub;
        restClient = new RestClient();
    }
}
