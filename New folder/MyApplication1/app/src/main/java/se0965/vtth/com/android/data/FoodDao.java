package se0965.vtth.com.android.data;

import android.content.Context;

import se0965.vtth.com.android.common.data.DataDao;
import se0965.vtth.com.android.model.Food;

/**
 * Created by SONY on 5/28/2016.
 */
public class FoodDao extends DataDao<Food,Integer> {
    public FoodDao(Context context) {
        super(context, Food.class);
    }
}
