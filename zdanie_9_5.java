import java.lang.String;
import java.util.Scanner;
public class zdanie_9_5 {
    static Scanner M5 = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите текст для изменения");
        String tex = M5.nextLine();
        String [] text = tex.split(" ");
        System.out.println("Начальный текст");
        viv(text);
        int [] A = new int[text.length];
        for(int i=0;i<A.length;i++){
            A[i]=0;
        }
        for(int i=0;i<text.length;i++){
            for(int j=0;j<text[i].length();j++){
                if(text[i].charAt(j)=='a'){
                    text[i] = text[i].replace('a','!');
                    A[i]=1;
                }
                if(text[i].charAt(j)=='b'){
                    text[i] = text[i].replace('b','@');
                    A[i]=1;
                }
                if(text[i].charAt(j)=='c'){
                    text[i] = text[i].replace('c','#');
                    A[i]=1;
                }
                if(text[i].charAt(j)=='d'){
                    text[i] = text[i].replace('d','$');
                    A[i]=1;
                }
                if(text[i].charAt(j)=='e'){
                    text[i] = text[i].replace('e','%');
                    A[i]=1;
                }
                if(text[i].charAt(j)=='g'){
                    text[i] = text[i].replace('g','^');
                    A[i]=1;
                }
            }
        }
        System.out.println();
        System.out.println("Зашифрованный текст");
        viv(text);
        int S=0;
        for(int i=0;i<A.length;i++){
            S+=A[i];
        }
        System.out.println();
        System.out.println("Было изменено "+S+" слов");
    }
    public static void viv(String array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}
