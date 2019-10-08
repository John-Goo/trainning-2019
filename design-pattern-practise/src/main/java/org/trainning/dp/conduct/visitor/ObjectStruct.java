package org.trainning.dp.conduct.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStruct {
    private List<Element> list = new ArrayList<Element>();
    public void attach(Element element) {
        list.add(element);
    }
    public void detach(Element element) {
        list.remove(element);
    }
    public void accpet(Visitor visitor) {
        for (Element element : list) {
            element.accept(visitor);
        }
    }
}
