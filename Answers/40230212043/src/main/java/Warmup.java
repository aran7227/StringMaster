public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     *
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        /*int nk=0;
        for (int i=0;i<sentence.length();i++) {
            if (sentence.charAt(i)==' ') {
                nk++;
            }
        }
        nk++;
        String re="";
        int j=0;
        if (number>0 && number<=nk) {
            int y = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (y == number && number == 1) {
                    if (sentence.charAt(i) == ' ') {
                        break;
                    }
                    re.charAt(j)=sentence.charAt(i);
                    j++;
                } else {
                    if (y==number) {
                        re.charAt(j)=sentence.charAt(i);
                        j++;
                        if (sentence.charAt(i+1)==' ') {
                            break;
                        }
                    }
                    if (sentence.charAt(i)==' ') {
                        y++;
                    }
                }
            }
        } else {
            System.out.print("number = "+number+" is out Of Bound");
        }
        return re;*/
        String ans = "";
        String[] a = sentence.split(" ");
        if (number > a.length || number<=0) {
            ans = " Number = " + number + " is out Of Bound";
        }
        else {
            ans = a[number - 1];
        }
        return ans;

    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     *
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        if (searchForEven==true) {
            int e=0;
            for (int i=0;i<number.length();i++) {
                if (number.charAt(i)=='2' || number.charAt(i)=='4' || number.charAt(i)=='6' || number.charAt(i)=='8' || number.charAt(i)=='0') {
                    e++;
                }
            }
            return e;
        } else {
            int o=0;
            for (int i=0;i<number.length();i++) {
                if (number.charAt(i) == '1' || number.charAt(i) == '3' || number.charAt(i) == '5' || number.charAt(i) == '7' || number.charAt(i) == '9') {
                    o++;
                }
            }
            return o;
        }

    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        int toola=wordA.length(),toolb=wordB.length();
        int k=Math.min(toola, toolb);
        for (int i=0;i<k;i++) {
            if (wordA.charAt(i)<wordB.charAt(i)) {
                return wordA;
            } else if (wordA.charAt(i)>wordB.charAt(i)) {
                return wordB;
            } else {
                if (i==k-1) {
                    if (toola>toolb) {
                        return wordB;
                    } else {
                        return wordA;
                    }
                }
                continue;
            }
        }
        return null;
    }
}
