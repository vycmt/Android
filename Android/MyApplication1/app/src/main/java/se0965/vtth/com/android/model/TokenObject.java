package se0965.vtth.com.android.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by SONY on 5/28/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenObject implements Serializable {

    @JsonProperty("value")
    private String value;

    @JsonProperty("tokenType")
    private String type;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
