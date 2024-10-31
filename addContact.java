class AddContact {
    public void add() {
        String name = inputWithValidation("Enter name (1-20 alphabetic characters): ", "^[a-zA-Z]{1,20}$");
        String id = inputWithValidation("Enter ID (1-10 alphanumeric characters): ", "^[a-zA-Z0-9]{1,10}$");
        String mobileNo = inputWithValidation("Enter mobile no (10 digits): ", "^[0-9]{10}$");
        String address = inputWithValidation("Enter address (1-20 characters): ", "^(\\d{0,}) [a-zA-Z0-9\\s]+(,)? [a-zA-Z]+(,)?$");
        String pincode = inputWithValidation("Enter pincode (6 digits): ", "^[0-9]{6}$");

        AddressBook.data.add(new Contact(id, name, mobileNo, address, pincode));
        System.out.println("Contact added.");
    }

    public String inputWithValidation(String prompt, String regex) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = AddressBook.x.nextLine();
            if (input.matches(regex)) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        return input;
    }
}