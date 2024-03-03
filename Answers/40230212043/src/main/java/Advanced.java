import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        /*String[] a = sentence.split(" ");
        for (int i=0;i<a.length;i++) {
            if (a[i]==word) {
                a[i]=newWord;
                break;
            }
        }
        String g="";
        for (int i=0;i<a.length;i++) {
            if (i==a.length-1) {
                g=g+a[i];
                break;
            }
            g=g+a[i]+" ";
        }
        return g;*/
        sentence=sentence.replaceAll(word,newWord);
        return sentence;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        if (firstName==" ") {
            String h1ll=lastName.substring(0,1);
            String bll=lastName.substring(1);
            String fullName=h1ll.toUpperCase()+bll.toLowerCase();
            return fullName;
        } else if (lastName==" ") {
            String h1ff=firstName.substring(0,1);
            String bff=firstName.substring(1);
            String fullName=h1ff.toUpperCase()+bff.toLowerCase();
            return fullName;
        }
        String h1f,bf;
        h1f=firstName.substring(0,1);
        bf=firstName.substring(1);
        String h1l,bl;
        h1l=lastName.substring(0,1);
        bl=lastName.substring(1);
        String fullName=h1f.toUpperCase()+bf.toLowerCase()+" "+h1l.toUpperCase()+bl.toLowerCase();
        return fullName;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        String u="";
        int j=0;
        String[] a=word.split(" ");
        for (int i=0;i<a.length;i++) {
            int y=1;
            for (j=0;j<a[i].length();j++) {
                if (a[i].charAt(j)==a[i].charAt(j+1)) {
                    for (int k=j;;k++) {
                        if (a[i].charAt(k)==a[i].charAt(k+1)) {
                            y++;
                        } else {
                            break;
                        }
                    }
                    if (y>1) {
                        break;
                    }
                }
            }
            if (i==a.length-1) {
                u=u+a[i].substring(0,j+1)+a[i].substring(j+y);
            } else {
                u=u+a[i].substring(0,j+1)+a[i].substring(j+y)+" ";
            }
        }
        return u;
    }
}

