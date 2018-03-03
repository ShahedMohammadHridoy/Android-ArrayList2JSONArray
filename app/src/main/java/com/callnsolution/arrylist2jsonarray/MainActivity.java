package com.callnsolution.arrylist2jsonarray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ArrayList<ListItem> myCustomList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCustomList = new ArrayList<>();

        ListItem item1 = new ListItem("1", "Shahed", "Android App");
        ListItem item2 = new ListItem("2", "Jahed", "iOS App");
        ListItem item3 = new ListItem("3", "Rashed", "Windows App");
        ListItem item4 = new ListItem("4", "Alam", "Web App");
        ListItem item5 = new ListItem("5", "Kalam", "Cross Platform App");

        myCustomList.add(item1);
        myCustomList.add(item2);
        myCustomList.add(item3);
        myCustomList.add(item4);
        myCustomList.add(item5);

        JSONArray array = new JSONArray();

        for (int i= 0; i<myCustomList.size(); i++){
            array.put(myCustomList.get(i).getJsonObject());
        }

        textView = findViewById(R.id.myText);
        textView.setText(array.toString());
    }
}