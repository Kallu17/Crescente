import java.util.Scanner;

public class Crescente{
    public static void main(String[] args){
        int aux, num[] = {0,0};
        for(int i = 0; i < 2; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            
            num[i] = new Scanner(System.in).nextInt();
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 1; j++){
                if(num[j] > num[j + 1]){
                    aux = num[j];
                    num[j] = num[j+1];
                    num[j+1] = aux;
                }
            }
        }
        System.out.println("\nOrdem Crescente: \n");
        for(int i = 0; i<2; i++){
            System.out.printf("%dº: %d \n",i+1, num[i]);
        }
    }
}
