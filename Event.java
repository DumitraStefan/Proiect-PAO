package agenda;

public class Event extends Note {

    private String location;
    private String time;
    private String date;

    public Event(){
        this.location = "No location added yet";
        this.time = "No time added yet";
        this.date = "No date added yet";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return super.toString() + "\nLocation: "+ this.location + "\nDate: "
                            + this.date + "\nTime: " + this.time;
    }
}
