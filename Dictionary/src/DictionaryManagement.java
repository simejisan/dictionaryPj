import java.util.Scanner;

public class DictionaryManagement {
    public static void main(String args[]){
        insertFromCommandline();
    }


    public static void insertFromCommandline()
    {
        int n;
        String temp;
        Scanner input = new Scanner(System.in);
        System.out.print("How many words do you want to translate? ");
        n = input.nextInt();
        temp = input.nextLine();
        String[] s1 = new String[n];
        String[] s2 = new String[n];

        Dictionary d = new Dictionary(n);


        for (int i=0;i<n;i++){
            System.out.print("Input your English word? ");
            s1[i] = input.nextLine();
            //d.setDictionaryTargetWord(s1, n) = input.nextLine();
            System.out.print("...then translate it in VNM? ");
            s2[i] = input.nextLine();
            //d.setDictionaryExplainWord(s2,n) = input.nextLine();
        }
}}
