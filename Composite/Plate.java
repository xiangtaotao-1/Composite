package Composite;

import java.util.ArrayList;

public class Plate extends MyElement{
    private ArrayList<MyElement> list =new ArrayList<MyElement>();
    public void add(MyElement element){
        list.add(element);
    }
    public void delete(MyElement element){
        list.remove(element);
    }
    @Override
    public void eat() {
        for (Object object:list){
            ((MyElement)object).eat();
        }

    }
}
