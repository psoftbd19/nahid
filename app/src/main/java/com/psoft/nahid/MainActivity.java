package com.psoft.nahid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvOutPut;
    List<DataItem> dataItemList = SampleDataProvider.itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutPut =(TextView) findViewById(R.id.out);

        tvOutPut.setText("");

        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem o1, DataItem o2) {
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });

        for (DataItem item:
                dataItemList) {
            String name = item.getItemName();
            tvOutPut.append(name+"\n");

        }
    }
}
