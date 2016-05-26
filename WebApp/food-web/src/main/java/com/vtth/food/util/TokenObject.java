/**
 * 
 */
package com.vtth.food.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author SONY
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenObject {

    @JsonProperty("value")
    private String accessToken;

    public TokenObject() {
        // TODO Auto-generated constructor stub
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

}
