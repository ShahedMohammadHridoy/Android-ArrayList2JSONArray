package com.callnsolution.arrylist2jsonarray;

import org.json.JSONException;
import org.json.JSONObject;

public class ListItem {

    private String _masterId;
    private String _name;
    private String _category;

    public ListItem(String masterId, String name, String category) {
        this._masterId = masterId;
        this._name = name;
        this._category = category;
    }

    public JSONObject getJsonObject() {

        JSONObject obj = new JSONObject();

        try {
            obj.put("ID", _masterId);
            obj.put("Name", _name);
            obj.put("Category", _category);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return obj;

    }
}
