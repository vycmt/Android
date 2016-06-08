package se0965.vtth.com.android.factory;

import android.app.Application;
import android.content.Context;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

import se0965.vtth.com.android.common.core.JsonParser;
import se0965.vtth.com.android.common.restclient.RestClient;

/**
 * Created by SONY on 5/30/2016.
 */
public class AbstractFactory {

    protected static final ObjectMapper JSON_MAPPER = new ObjectMapper();
    protected static final JsonParser PARSER = new JsonParser(JSON_MAPPER);
    protected RestClient restClient;
    protected Application context;

    public AbstractFactory(Context context) {
        this(context, "");
    }

    public AbstractFactory(Context context, String sub) {
        String webAPI = "http://192.168.1.2:8080" + sub;
        restClient = new RestClient(webAPI);
    }

    protected <T> T response(RestClient rest, Class<T> clazz) throws IOException {
        if (rest.getResponseCode() == HttpURLConnection.HTTP_OK) {
            return PARSER.toObject(rest.getResponse(), clazz);
        }
        return null;
    }

    protected <T> List<T> responseList(RestClient rest, Class<T> clazz) throws IOException {
        if (rest.getResponseCode() == HttpURLConnection.HTTP_OK) {
            return PARSER.toList(rest.getResponse(), clazz);
        }
        return null;
    }
}
