package bucles;

public class counterWordOnPhrase {
    public static void main(String[] args){
        String phrase = "She sells seashells by the seashore she sells a lot sells";
        String word = "sells";
        int counter=0;
        int maxWord = word.length();
        int max = phrase.length() - maxWord;

        loop:
        for(int i =0; i<=max; i++){
            int k=i;
            for(int j = 0; j<maxWord; j++){
                if(phrase.charAt(k++) != word.charAt(j)){
                    continue loop;
                }
            }
            counter++;
        }
        System.out.println("words found:  " + counter);

    }


}
