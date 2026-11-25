import java.util.Scanner;

class Exam{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }

        int[] B = new int[N];
        for(int i =0; i<N; i++){
            B[i]=sc.nextInt();
        }
       
        for(int i=0; i<N; i++){
            int score = A[i] - B[i];
            System.out.printf(score + " ");
        }
    }
}
