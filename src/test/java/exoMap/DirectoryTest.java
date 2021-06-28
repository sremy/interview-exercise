package exoMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DirectoryTest {

    @Test
    public void buildDirectory() {
        List<ParentsChildren> personList = new ArrayList<>();
        // Name, First name, Child First name
        personList.add(new ParentsChildren("Bond", "James", "C1"));
        personList.add(new ParentsChildren("Bond", "James", "C2"));
        personList.add(new ParentsChildren("Goldman", "Jean-Jacques", "Caroline"));
        personList.add(new ParentsChildren("Goldman", "Jean-Jacques", "Michael"));

        Directory directory = new Directory();
        directory.buildDirectory(personList);
    }
}