import java.util.ArrayList;

public class NameFromEmail {

    public static void main(String[] args) {

        System.out.println(nameFromEmail("elek.viz@exam.com"));

    }

    static ArrayList<String> nameFromEmail(String input) {
        ArrayList<String> firstName = new ArrayList<>();
        String lastName;


        input.split(".", 1  );
        firstName.add(input.toString());
        return firstName;
    }
}









