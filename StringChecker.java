import java.util.Scanner; 

class Checker{
    int vowelCount, consonentCount;
    String vowel;
    Checker(){
        this.vowelCount = 0;
        this.consonentCount = 0;
        this.vowel = "aeiou";
    }
    double[] check(String word){
        for (int i=0; i < word.length(); i++){
            char singleWord = word.charAt(i);
            if (this.vowel.indexOf(singleWord) == -1) ++this.consonentCount;
            else ++this.vowelCount;
        }
        double res[] = {this.vowelCount, this.consonentCount};
        return res;
    }
}


public class StringChecker{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter Your Word: ");
        String word = s.nextLine().toLowerCase();
        Checker checker = new Checker();
        double[] res = checker.check(word);
        System.out.println("Vowel persent: "+res[0]+". Consonent present: "+res[1]);
        s.close();
    }
}