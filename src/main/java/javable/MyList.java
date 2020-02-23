package javable;

import java.util.ArrayList;

public class MyList {
    private ArrayList v = new ArrayList();
    public void add(ArrayListTest obj) {
        v.add(obj);
    }
    public ArrayListTest get(int index) {
        return (ArrayListTest) v.get(index);
    }
    public int size() {
        return v.size();
    }
}
