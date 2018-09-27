import java.util.Scanner;

public class Dictionary
{
    public Word[] dict;
    public Dictionary (int length){
        dict = new Word [length];
        for (int i=0; i<length; i++){
            dict[i] = new Word ();
        }
    }

    public void setDictionaryTargetWord(String[] s1, int length) {
    for (int i=0;i<length; i++){
            dict[i].setWord_target(s1[i]);
        }}

    public void setDictionaryExplainWord(String[] s2, int length) {
        for (int i=0; i<length; i++) {
            dict[i].setWord_explain(s2[i]);
        }}
}



