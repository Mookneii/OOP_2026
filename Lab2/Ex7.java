import java.util.Scanner;

public class Ex7{
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String sent = input.nextLine();
        int vol =0;
        int con = 0;
        int sp = 0;
        
        for(int i =0 ; i<sent.length(); i++){
            char ch = sent.charAt(i);
            if( ch == 'I' || ch =='O' || ch =='E' || ch=='A' || ch=='U'
                || ch == 'i' || ch =='o' || ch =='e' || ch=='a' || ch=='u'
            ){
                vol++;
            }else if(Character.isWhitespace(ch)){
                sp++;
            }else if(Character.isLetter(ch)){
                con++;
            }
        }
        System.out.println("Count of vowel is: "+ vol);
        System.out.println("Count of consonant is: "+ con);
        System.out.println("Count of space is: "+sp);
    }
}
