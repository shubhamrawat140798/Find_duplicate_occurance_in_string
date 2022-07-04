//Java program to find the number of occurrences of the duplicate words in a string and print them?
import java.util.Scanner;
public class Main {
    public static void duplicateWordOccurences(String str) {
        int count;
        str = str.toLowerCase();
        String words[]=str.split(" ");
        for(int i=0;i < words.length;i++){
            count =1;
            if(words[i]!=null){
                for(int j=i+1; j < words.length;j++){
                    if(words[i].equals(words[j]) ){
                        count++;
                        words[j]=null;
                    }
                }
                if(count>1){
                    System.out.println(words[i]+" : "+ count);
                }
            }
            
        }
    }
    public static void main(String[] args) {
        System.out.println("Compile by Shubham Singh Rawat");
        Scanner s = null;
        
        try {
            s= new Scanner(System.in);
            System.out.print("\nEnter a String: ");
            String str = s.nextLine();
            System.out.print("\nDuplicate word ocurrences:\n");
            duplicateWordOccurences(str);
        } finally{
            if(s!=null){
                s.close();
            }
        }
    }
}
