class LibraryMember {

    int memberId;
    String membershipType;

    
    LibraryMember() {
        memberId = 501;
        membershipType = "Regular";
    }

    void display() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Membership Type: " + membershipType);
    }

    public static void main(String[] args) {
        LibraryMember m1 = new LibraryMember();
        m1.display();
    }
}