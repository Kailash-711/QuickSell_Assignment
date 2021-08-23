package com.quicksell_assignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        private void apiCall() {

            String URL = "https://qstest-123.firebaseio.com";

            StringRequest request = new StringRequest(Request.Method.GET, URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray jsonArray = new JSONArray(response);

                                for (int i = 0 ; i < jsonArray.length() ; i ++){

                                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                                    String project_id = jsonObject.getString("project_id");

                                    JSONObject jsonObject1 = jsonObject.getJSONObject("project_name");
                                    String flag = jsonObject1.getString("flag");

                                    project_number countryInfo = new project_number( , flag);
                                    project_numbartlist.add(countryInfo);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }
            requestQueue.add(request);

        }

    }
}