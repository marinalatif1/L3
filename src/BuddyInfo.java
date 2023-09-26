public class BuddyInfo {
    private String name;
    private String number;
    private String address;
    private String id;

    public BuddyInfo(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }



    public String getName() {
        return name;
    }


    public String getNumber() {
        return number;
    }

    public String getId() {
        return id;
    }


    public String getAddress() {
        return address;
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Marina","613","");
        System.out.println("Hello " + buddy.getName());
    }
}