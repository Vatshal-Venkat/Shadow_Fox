import java.util.ArrayList;
import java.util.Scanner;

class Contact{
    String name;
    String phn;
    String email;

    public Contact(String name,String phn, String email) {
        this.name = name;
        this.phn = phn;
        this.email = email;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setPhn(String phn){
        this.phn = phn;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phn + ", Email: " + email;
    }

}

public class Contact_Manager {
    private static ArrayList<Contact> Contacts = new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("CONTACT MANAGER:");
        System.out.println("************************************************************************");

        do { 
            System.out.println("\n1.Add Contact");
            System.out.println("2.View Contacts");
            System.out.println("3.Delete Contact");
            System.out.println("4.Update a Contact");
            System.out.println("5.EXIT");

            System.out.print("Enter your choice to do:");
            choice = sc.nextInt();

            switch(choice){
                case 1 -> AddContact(sc);
                case 2 -> viewContacts(sc);
                case 3 -> deleteContact(sc);
                case 4 -> updateContact(sc);
                case 5 -> {
                    System.out.println("Exiting. Thankyou!");
                    sc.close();
                    return;
                }
                default -> System.out.print("ENTER VALID CHOICE");
            }
        } while (choice!=5);
    }

    


    public static void viewContacts(Scanner sc){
        if (Contacts.isEmpty()){
            System.out.print("\nEMPTY CONTACT LIST.\n");
            System.out.print("================================================================================");
            return;
        }else{
            for (int i = 0;i< Contacts.size();i++){
                System.out.println((i+1)+". "+Contacts.get(i));
                System.out.print("================================================================================");
                System.out.println();
            }
        }
    }

    public static void updateContact(Scanner sc){
        viewContacts(sc);
        if(Contacts.isEmpty()){
            System.out.print("EMPTY CONTACT LIST.");
            return;
        }

        System.out.print("Which contact you want to update?:");
        int index = sc.nextInt()-1;
        sc.nextLine();

        if (index >=0 && index <Contacts.size()){
            Contact c = Contacts.get(index);
            System.out.println("Enter new(updated) Name:");
            String strname = sc.nextLine();
            if (!strname.isBlank()){
                c.setName(strname);

            }

            System.out.println("Enter new Phone Number:");
            String strcell = sc.nextLine();
            if (!strcell.isBlank()){
                c.setPhn(strcell);
            }

            System.out.println("Enter new email ID:");
            String stremail = sc.nextLine();
            if (!stremail.isBlank()){
                c.setEmail(stremail);
            }

            System.out.println("Contact has been updated.");
            System.out.print("================================================================================");
            System.out.println();
        }
    }

    public static void deleteContact(Scanner sc){
        if (Contacts.isEmpty()){
            System.out.println("EMPTY CONTACT LIST");
            return;
        }

        System.out.println("Eneter the index of the contact you want to delete:");
        int index = sc.nextInt()-1;

        if (index>=0 && index<Contacts.size()){
            Contacts.remove(index);
            viewContacts(sc);
        }else{
            System.out.println("INVALID.");
        }
        System.out.print("================================================================================");
        System.out.println();
    }

    public static void AddContact(Scanner sc){
        System.out.print("Enter name:");
        String sname = sc.nextLine();
        System.out.print("\nEnter Phone Number:");
        String sphn = sc.nextLine();
        if (sphn.length()!=10){
            System.out.println("INVALID NUMBER, Please try again");
            System.out.print("-------------------------------------------");
            return;
        }
        System.out.print("\nEnter Email ID:");
        String semail = sc.nextLine();

        Contacts.add(new Contact(sname, sphn, semail));
        System.out.print("Contact has been added successfully");
        System.out.print("\n================================================================================");
        System.out.println();
    }
}
