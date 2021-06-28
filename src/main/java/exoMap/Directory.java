package exoMap;

import org.apache.commons.collections.MapUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {

    Map<Person, Integer> personsToNbChildren = new HashMap<>();

    public void buildDirectory(List<ParentsChildren> parentsChildren) {
        for (ParentsChildren p : parentsChildren) {
            Person person = new Person(p.getName(), p.getFirstName());
            Integer childrenCount = personsToNbChildren.get(person);
            if (childrenCount != null) {
                personsToNbChildren.put(person, childrenCount + 1);
            } else {
                personsToNbChildren.put(person, 1);
            }

        }

        MapUtils.debugPrint(System.out, "personsToNbChildren", personsToNbChildren);

    }
}
