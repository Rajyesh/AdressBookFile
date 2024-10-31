import java.util.ArrayList;

import java.util.Scanner;

class AddressBook {
    static ArrayList<Contact> data = new ArrayList<>();
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        AddContact A = new AddContact();
        ReadContact R = new ReadContact();
        UpdateContact U = new UpdateContact();
        DeleteContact D = new DeleteContact();

        while (true) {
            System.out.println("1. ADD");
            System.out.println("2. READ");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.print("Choose an option: ");
            int choice = x.nextInt();
            x.nextLine();

            switch (choice) {
                case 1 -> A.add();
                case 2 -> R.read();
                case 3 -> U.update();
                case 4 -> D.delete();
                default -> System.out.println("Invalid option.");
            }
        }
    }
}

class Contact {
    public String id;
    public String name;
    public String mobileNo;
    public String address;
    public String pincode;

    public Contact(String id, String name, String mobileNo, String address, String pincode) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.address = address;
        this.pincode = pincode;
    }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }
    public void setAddress(String address) { this.address = address; }
    public void setPincode(String pincode) { this.pincode = pincode; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + mobileNo + ", Address: " + address + ", Pincode: " + pincode;
    }
}