package se0965.vtth.com.android.factory;

import android.content.Context;

import se0965.vtth.com.android.common.restclient.RequestMethod;
import se0965.vtth.com.android.model.TokenObject;

/**
 * Created by SONY on 5/30/2016.
 */
public class AuthorizationFactory extends AbstractFactory {

    public static final String AUTH_TYPE = "Bearer";

    public AuthorizationFactory(Context context) {
        super(context, "/foodAPI/oauth/token?grant_type=password&client_id=mobileapp&client_secret=mobileapp" +
                "&username=cthuyvy&password=vy081095");
    }

    public TokenObject getAccessToken() throws Exception  {
        restClient.execute(RequestMethod.GET);
        return response(restClient, TokenObject.class);
    }
}
