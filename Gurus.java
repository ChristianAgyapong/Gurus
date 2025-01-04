public class Gurus {
    public static void main(String[] args) {
        // Create a new Guru object
        Guru guru = new Guru("John Doe", "Java Programming");
        
        // Display the guru's information
        guru.displayInfo();
    }
}

class Guru {
    private String name;
    private String expertise;

    // Constructor
    public Guru(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    // Method to display guru's information
    public void displayInfo() {
        System.out.println("Guru Name: " + name);
        System.out.println("Expertise: " + expertise);
    }
}