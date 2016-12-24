package com.github.drxaos.edu;

/**
 * Created by Airi on 24.12.2016.
 */

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class SqliteSavedListAlt <E extends Serializable> extends AbstractList<E> implements SavedList{

    private List list=new ArrayList();
    String tableName;
    private Map<E,List<E>> tableAndLis= new HashMap<E, List<E>>();

    public SqliteSavedListAlt(String table) throws ClassNotFoundException {

        this.tableName = table;
        int count = 0;

        if (AltDB.ExTable(tableName))
        {
            list.clear();
            load();
        }
        else
        {
            AltDB.table.put(table,new LinkedList<Object>());
        }
    }

    public void load() {
        if (true) {
            list.addAll(AltDB.table.get(tableName).subList(0, AltDB.table.get(tableName).size()));
        }
    }

    protected void deleteFromTable(int id) {
        AltDB.table.get(tableName).remove(id);
    }

    protected void saveToTable(){
        AltDB.table.get(tableName).clear();
        AltDB.table.get(tableName).addAll(list.subList(0,list.size()));
    }

    protected void updateTable(int id, E elem){
        AltDB.table.get(tableName).set(id,elem);
    }

    @Override
    public E get(int index) {
        return (E) list.get(index);
    }

    @Override
    public E set(int index, E element) {
        list.set(index, element);
        updateTable(index, element);
        return this.get(index);
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        saveToTable();

    }

    @Override
    public boolean add(E elem) {
        list.add(elem);
        saveToTable();

        return false;
    }

    @Override
    public E remove(int index) {
        E obj=(E) this.list.remove(index);
        deleteFromTable(index);

        return obj;
    }

    @Override
    public int size() {
        return list.size();
    }
    public void reload() throws FileOperationException {

        load();
    }
}