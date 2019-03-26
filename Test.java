package agenda;

public class Test {

    public static void main(String[] args) {

        String[] tets = {"zau", "tare", "rau"};

        Agenda a = new Agenda();

        /*a.addNote(tets[0], "sa");
        a.addNote(tets[1], "hai");
        a.addNote(tets[2], "vedem");*/

        //a.listAllNotes();

        //test = a.getNoteByTitle("tare");
        //a.deleteNote(test);

        //a.listAllNotes();

        /*a.addEvent();
        Event test = a.getEventByDate("23-07-2019");
        System.out.println(test);*/

        a.addContact();
        a.addContact();
        Contact test = a.getContactByName("John");
        System.out.println(test);
        a.deleteContact(test);
        a.listAllContacts();

        /*a.addToDoItem();
        a.addToDoItem();
        a.listToDoItems();*/





    }

}
