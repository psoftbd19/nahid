package com.psoft.nahid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ahnaf on 1/29/2019.
 */

public class SampleDataProvider {

    public static List<DataItem> itemList;
    public static Map<String,DataItem> dataItemMap;

    static {
        itemList=new ArrayList<>();
        dataItemMap=new HashMap<>();



        addItem(new DataItem("","A","sdhfs","sdfhs",43,55.9,"hh","6-4-2019"));
        addItem(new DataItem("","E","sdhfs","sdfhs",43,55.9,"hh","6-4-2019"));
        addItem(new DataItem("","B","sdhfs","sdfhs",43,55.9,"hh","6-4-2019"));
        addItem(new DataItem("","D","sdhfs","sdfhs",43,55.9,"hh","6-4-2019"));

    }
    private static void addItem(DataItem dataItem){
        itemList.add(dataItem);
        dataItemMap.put(dataItem.getItemId(),dataItem);
    }

}
