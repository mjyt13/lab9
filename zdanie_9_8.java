import java.lang.String;
import java.util.Scanner;
public class zdanie_9_8 {
    static Scanner M = new Scanner(System.in);
    public static void main(String[] args) {
        String CX = M.nextLine();
        String[] A = CX.split(" ");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length();j++){
                if(A[i].charAt(j)=='<'){
                    A[i]=A[i].replace('<','б');
                }
                if(A[i].charAt(j)=='>'){
                    A[i]=A[i].replace('>','ю');
                }
                if(A[i].charAt(j)==':'){
                    A[i]=A[i].replace(':','ж');
                }
                if(A[i].charAt(j)=='"'){
                    A[i]=A[i].replace('"','э');
                }
                if(A[i].charAt(j)=='{'){
                    A[i]=A[i].replace('{','х');
                }
                if(A[i].charAt(j)=='}'){
                    A[i]=A[i].replace('{','ъ');
                }
            }
        }
        viv(A);
    }
    public static void viv(String Ar[]){
        for(int i=0;i<Ar.length;i++){
            System.out.print(Ar[i]+" ");
        }
    }
}
