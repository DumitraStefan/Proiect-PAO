package agenda;

import java.util.ArrayList;
import java.util.List;

public class ToDo {

    private List<String> toDoList;

    public ToDo() {
        this.toDoList = new ArrayList<String>();
    }

    public void add(String temp){
        this.toDoList.add(temp);
    }

    @Override
    public String toString(){
        String temp = new String();
        temp = "Items in TO DO list:\n";
        for (int i = 0; i < this.toDoList.size(); i++) {
            temp += "- " + this.toDoList.get(i) + "\n";
        }
        return temp;
    }
}
