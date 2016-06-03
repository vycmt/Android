package se0965.vtth.com.android.factory;

import android.content.Context;

import java.util.List;

import se0965.vtth.com.android.common.restclient.RequestMethod;
import se0965.vtth.com.android.model.Food;
import se0965.vtth.com.android.model.FoodDetail;

/**
 * Created by SONY on 5/30/2016.
 */
public class FoodFactory extends AbstractFactory {

    public FoodFactory(Context context) {
        super(context, "/foodAPI");
    }

    public List<Food> getFoods(String keys, String start, String limit, String token) throws Exception {
        restClient.addRoute("search")
                .addHeader("Authorization", AuthorizationFactory.AUTH_TYPE + " " + token)
                .addRawJson("materials", keys)
                .addRawJson("start", start)
                .addRawJson("limit", limit);
        restClient.execute(RequestMethod.POST);
        return responseList(restClient, Food.class);
    }

    public FoodDetail getFoodById(String id, String token) throws Exception {
        restClient.addRoute("search")
                .addHeader("Authorization", AuthorizationFactory.AUTH_TYPE + " " + token)
                .addRoute(id);
        restClient.execute(RequestMethod.GET);
        return response(restClient, FoodDetail.class);
    }
}
