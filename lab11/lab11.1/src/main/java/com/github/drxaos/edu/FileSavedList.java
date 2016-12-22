package com.github.drxaos.edu;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class FileSavedList<E extends Serializable> extends AbstractList<E> implements SavedList {
    private ArrayList list;
    private File file;

    public FileSavedList(File file) {
        this.list=new ArrayList();

        if (file==null)
            this.file = new File("savedList.dat");
        else
        {
            this.file = file;
            reload();
        }
    }

    private void updFile()
    {
        try
        {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(list);
            out.close();
        }
        catch (Exception ex){}
    }

    public void reload() throws FileOperationException {
        this.list.clear();

        try{
            FileInputStream streamFile = new FileInputStream(this.file);
            ObjectInputStream streamObj =new ObjectInputStream(streamFile);
            list = (ArrayList)streamObj.readObject();
            streamFile.close();
            streamObj.close();

        }
        catch(Exception ex){}
    }

    @Override
    public E get(int index)
        {
            return  (E)list.get(index);
        }


    @Override
    public E set(int index, E element) {
        list.set(index, element);
        updFile();
        return this.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        updFile();
    }
    @Override
    public E remove(int index) {
        E obj =  (E)this.list.remove(index);
        updFile();
        return obj;
    }
}


