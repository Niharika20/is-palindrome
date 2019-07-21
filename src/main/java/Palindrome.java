public class Palindrome {

    public boolean check(String sentence) {
    	sentence = removeNonCharacters(sentence);
        return sentence.equals(reverseString(sentence));  //check if reversed string and sentence is equal
    }

    private String removeNonCharacters(String sentence){
    	sentence = toLowerCase(sentence);			//convert sentence to lower case.
    	return sentence.replaceAll("[^a-z0-9]","");   //remove all non characters.
    }

    private String toLowerCase(String sentence){
    	return sentence.toLowerCase();
    }
    private String reverseString(String sentence){
    	StringBuilder reverse = new StringBuilder(sentence).reverse();  //reverse using StringBuilder reverse method.
    	return reverse.toString();
    }
}