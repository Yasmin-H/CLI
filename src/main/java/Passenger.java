public class Passenger {

    private String name;
    private String id;

    private String contactInfo;


    public Passenger(String name, String id, String contactInfo){
        this.name = name;
        this.id = id;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }

    public String getContactInfo() {
        return contactInfo;
    }


}
