import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FairShareSequence {


    public static void main(String[] args){
        int n = 2; // Number of people for whom the sequence is made
        int options = 4; // How many options there are to choose from (how long the sequence must be)
//        int length = log(base = n, argument = options); // How long does the sequence need to be

        // Should be list of character, not list of string
        List<String> sequence = new ArrayList<>();

        // Initialize sequence
        initialize(n, sequence);

        System.out.println("Initial Sequence: " + sequence);

        // Generate the sequence
        while (sequence.size() < options) {
            // Each iteration the length of sequence will double

            // Recursive permutation method?

        }

        System.out.println("Final Sequence: " + sequence);

    }

    // 65 to 122 are upper and lower case letters
    // Works by reference semantics
    public static void initialize(int n, List<String> seq) {
        for (int i = 65; i < n+65; i++) {
            seq.add(Character.toString ((char) i));
            System.out.println(seq);
        }
    }

    // Method that duplicates and reflects sequence
    public static String reflecticate(String s){


        return s;
    }

}
