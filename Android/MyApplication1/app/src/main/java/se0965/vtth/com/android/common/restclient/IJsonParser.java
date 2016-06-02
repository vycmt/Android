package se0965.vtth.com.android.common.restclient;

import java.util.List;

/**
 * Created by SONY on 6/1/2016.
 */
public interface IJsonParser {

    public <T> List<T> toList(String jsonString, Class<T> cls) throws JsonParserException;

    public <T> T toObject(String jsonString, Class<T> cls) throws JsonParserException;

    String toJson(Object value) throws JsonParserException;

}
