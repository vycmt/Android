package se0965.vtth.com.android.factory;

import com.fasterxml.jackson.databind.ObjectMapper;

import se0965.vtth.com.android.common.core.JsonParser;

/**
 * Created by SONY on 5/30/2016.
 */
public class AbstractFactory {

    protected static final ObjectMapper JSON_MAPPER = new ObjectMapper();
    protected static final JsonParser PARSER = new JsonParser();
}
