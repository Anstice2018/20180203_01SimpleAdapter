package com.example.student.a20180203_simpleadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById(R.id.spinner);

        ArrayList<Map<String, String>> mylist = new ArrayList();
        HashMap<String, String> m1 = new HashMap();
        m1.put("city", "台北");
        m1.put("code", "02");
        mylist.add(m1);
        HashMap<String, String> m2 = new HashMap();
        m2.put("city", "台中");
        m2.put("code", "04");
        mylist.add(m2);

        SimpleAdapter adapter = new SimpleAdapter(this, mylist, android.R.layout.simple_list_item_2,
                new String[] {"city", "code"}, new int[] {android.R.id.text1, android.R.id.text2});
        sp.setAdapter(adapter);

    }
}
