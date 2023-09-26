import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddyInfo;

    public AddressBook() {
        buddyInfo = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null)
        buddyInfo.add(buddy);
    }

    public void removeBuddy(int position) {
        if (position >= 0 && position < buddyInfo.size()) {
            buddyInfo.remove(position);
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        System.out.println("BuddyInfo");
        BuddyInfo buddy = new BuddyInfo("Marina","613","carleton");
        //BuddyInfo buddy2 = new BuddyInfo("Jack","613","carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
