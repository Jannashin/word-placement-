public class CheckWordPosition {
    public static void main(String[] args) {
        String sentence = "this is a book";
        String[] words = sentence.split(" ");
        if (words[1].equals("is")) {
            System.out.println("The word 'is' is in the correct position.");
        } else {
            System.out.println("The word 'is' is NOT in the correct position.");
        }
    }
}
