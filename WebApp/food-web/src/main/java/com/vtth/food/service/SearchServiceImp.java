/**
 * 
 */
package com.vtth.food.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import com.vtth.food.dao.FoodDAO;
import com.vtth.food.dao.UserDAO;
import com.vtth.food.dto.FoodDTO;
import com.vtth.food.entity.TblFood;
import com.vtth.food.util.ConstantDataManager;
import com.vtth.food.util.SearchObject;
import com.vtth.food.util.TokenObject;

@Service
@Transactional
public class SearchServiceImp implements SearchService {

    public final static String AUTHEN_URL = ConstantDataManager.SERVER_URL + ConstantDataManager.API_URL;
    public final static String SEARCH_URL = ConstantDataManager.SERVER_URL + "search";

    RestTemplate restTemplate;
    @Autowired
    FoodDAO foodDAO;
    @Autowired
    UserDAO userDAO;

    public SearchServiceImp() {
        System.out.println("SearchServiceImp()");
    }

    public List<FoodDTO> searchByMaterial(String material, int start, int limit) {
        restTemplate = new RestTemplate();
        // get token_access
        TokenObject tokenObj = restTemplate.getForObject(AUTHEN_URL, TokenObject.class);
        // init json object to send request
        SearchObject searchObj = new SearchObject(material, start, limit);
        // init header
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + tokenObj.getAccessToken());
        headers.add("Content-Type", "application/json");
        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        // set header + body to request
        HttpEntity<SearchObject> request = new HttpEntity<SearchObject>(searchObj, headers);
        // get result
        List<FoodDTO> result = (List<FoodDTO>) restTemplate.postForObject(SEARCH_URL, request, List.class);
        return result;
    }

    public List<FoodDTO> searchByAPI(String material, int start, int limit) {
        // gọi hàm Search từ DAO
        List<TblFood> foodList = foodDAO.searchByMaterial(material, start, limit);
        List<FoodDTO> foodDTOList = new ArrayList<FoodDTO>();
        for (TblFood food : foodList) {
            foodDTOList.add(new FoodDTO(food));
        }
        return foodDTOList;
    }

}
