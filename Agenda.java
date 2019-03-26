package agenda;

import java.util.*;

public class Agenda {

    private List<Note> notesList;
    private List<Event> eventsList;
    private SortedSet<Contact> peopleList;
    private ToDo toDoList;

    public Agenda() {
        this.notesList = new ArrayList<Note>();
        this.eventsList = new ArrayList<Event>();
        this.peopleList = new TreeSet<Contact>(new FirstNameSorter());
        this.toDoList = new ToDo();
    }

    public void addNote(){
        Note temp = new Note();
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce a title:");
        temp.setTitle(input.nextLine());

        System.out.println("Introduce description:");
        temp.setDescription(input.nextLine());

        this.notesList.add(temp);
    }

    /*public void addNote(String title, String description){
        notesList.add(new Note(title, description));
    }*/

    public Note getNoteByTitle(String title){
        Note temp = new Note();
        for (int i = 0; i < this.notesList.size(); i++){
            temp = this.notesList.get(i);
            if (temp.getTitle().equals(title))
                break;
        }
        return temp;
    }

    public void deleteNote(Note temp){
        this.notesList.remove(getNoteByTitle(temp.getTitle()));
    }

    public void listAllNotes(){
        for (int i = 0; i < this.notesList.size(); i++)
            System.out.println(this.notesList.get(i) + "\n");
    }

    public void addEvent(){
        Event temp = new Event();
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce a title:");
        temp.setTitle(input.nextLine());

        System.out.println("Introduce description:");
        temp.setDescription(input.nextLine());

        System.out.println("Introduce location:");
        temp.setLocation(input.nextLine());

        System.out.println("Introduce date(DD-MM-YYYY):");
        temp.setDate(input.nextLine());

        System.out.println("Introduce time(HH:MM):");
        temp.setTime(input.nextLine());

        this.eventsList.add(temp);
    }

    public Event getEventByDate(String date){
        Event temp = new Event();
        for (int i = 0; i < this.eventsList.size(); i++){
            temp = this.eventsList.get(i);
            if (temp.getDate().equals(date))
                break;
        }
        return temp;
    }

    public void deleteEvent(Event temp){
        this.eventsList.remove(getEventByDate(temp.getDate()));
    }

    public void listAllEvents(){
        for (int i = 0; i < this.eventsList.size(); i++)
            System.out.println(this.eventsList.get(i) + "\n");
    }

    public void addContact(){
        Contact temp = new Contact();
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce first name:");
        temp.setFirstName(input.nextLine());

        System.out.println("Introduce first name:");
        temp.setLastName(input.nextLine());

        temp.setEmailAddress();

        System.out.println("Introduce phone number:");
        temp.setPhoneNumber(input.nextLine());

        peopleList.add(temp);
    }


    public Contact getContactByName(String name){
        Contact aux = new Contact();
        for(Contact temp : this.peopleList) {
            if (temp.getFirstName().equals(name))
                aux = temp;
        }
        return aux;
    }

    public void deleteContact(Contact temp){
        this.peopleList.remove(getContactByName(temp.getFirstName()));
    }


    public void listAllContacts() {
        for (Contact temp : this.peopleList)
            System.out.println(temp);
    }


    public void addToDoItem(){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce item in TO DO list");

        this.toDoList.add(input.nextLine());
    }

    public void listToDoItems(){
        System.out.println(toDoList);
    }

}
