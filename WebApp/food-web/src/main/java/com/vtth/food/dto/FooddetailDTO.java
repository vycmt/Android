/**
 * Licensed to MKS Group under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Open-Ones Group licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.vtth.food.dto;

import com.vtth.food.entity.TblFood;
import com.vtth.food.entity.TblFooddetail;

/**
 * @author MHVTu
 *
 */
public class FooddetailDTO {

    private int foodId;
    private String materialDetail;
    private String tutorial;
    private String source;

    public FooddetailDTO() {
        // TODO Auto-generated constructor stub FOR DEBUGGING
        System.out.println("FooddetailDTO()");
    }

    public FooddetailDTO(int foodId, String materialDetail, String tutorial, String source) {
        this.foodId = foodId;
        this.materialDetail = materialDetail;
        this.tutorial = tutorial;
        this.source = source;
    }
    
    
    /**
     * @param foodDetail : Constructor with data from Entity
     */
    public FooddetailDTO (TblFooddetail foodDetail){
        this.foodId = foodDetail.getFoodId();
        this.materialDetail = foodDetail.getMaterialDetail();
        this.tutorial = foodDetail.getTutorial();
        this.source = foodDetail.getSource();
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getMaterialDetail() {
        return materialDetail;
    }

    public void setMaterialDetail(String materialDetail) {
        this.materialDetail = materialDetail;
    }

    public String getTutorial() {
        return tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
