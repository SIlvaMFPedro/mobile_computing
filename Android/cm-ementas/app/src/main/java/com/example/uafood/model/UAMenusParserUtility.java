package com.example.uafood.model;

// IMPORTS
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Client for the Ementas API (Parser with HTTP connection)
 */
public class UAMenusParserUtility {
    /**
     * Parses the meal course options; the JSON is not coherent, and can be an object or a string
     * @param array array with the meal options
     * @param index position to retrieve
     * @return the meal course option
     * @throws JSONException
     */
    static private String parseForObjectOrString(JSONArray array, int index) throws JSONException{
        JSONObject tmpJsonObject = array.optJSONObject(index);
        if (null == tmpJsonObject){
            // no JSON object - treat the data as String
            return array.getString(index);
        }
        else {
            return array.getJSONObject(index).getJSONObject("@attributes").getString("name");
        }
    }
}
