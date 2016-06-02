package se0965.vtth.com.android.common.restclient;

/**
 * Created by SONY on 6/2/2016.
 */
public class JsonParserException extends RuntimeException {

    public JsonParserException(String message, Throwable e) {
        super(message, e);
    }

    public JsonParserException(String messsage) {
        super(messsage);
    }
}
