package agenda;

import java.util.Comparator;

public class FirstNameSorter implements Comparator<Contact>{

    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}