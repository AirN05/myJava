package com.github.drxaos.edu;

/**
 * Created by Airi on 24.12.2016.
 */

import java.util.List;
import java.util.*;

public class AltDB {

    static public Map<String,List<Object>> table= new HashMap<String, List<Object>>();

    static boolean ExTable(String  tableName) {
        return table.containsKey(tableName);
    }

}
