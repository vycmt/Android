/**
 * 
 */
package com.vtth.food.util;

/**
 * @author SONY
 *
 */
public class SearchObject {

    private String material;
    private int start;
    private int limit;

    public SearchObject() {
        // TODO Auto-generated constructor stub
    }

    public SearchObject(String material, int start, int limit) {
        super();
        this.material = material;
        this.start = start;
        this.limit = limit;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
