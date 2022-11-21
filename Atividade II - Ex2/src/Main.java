import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void preencherNumeros(int[] numeros, int n) {
        Random random = new Random();
        for (int x = 0; x < n; x++) {
            numeros[x] = random.nextInt(100);
        }
    }

    public static void imprimirNumeros(int[] numeros, int n) {
        for (int x = 0; x < n; x++) {
            System.out.printf("%d ", numeros[x]);
        }
        System.out.println();
    }

    public static boolean buscaRecursiva(int[] vetor, int n) {
        int menor = 0;
        int maior = vetor.length - 1;
        int meio;
        while (menor <= maior) {
            meio = (menor + maior) / 2;

            if (vetor[meio] < n)
                menor = meio + 1;
            else if (vetor[meio] > n)
                maior = meio - 1;
            else
                return true;
        }
        return false;
    }

    public static void ordenarNumeros(int[] vetor, int n) {
        int j;
        int key;
        int i;

        for (j = 1; j < n; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }

    }

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);
        preencherNumeros(numeros, 10);
        imprimirNumeros(numeros, 10);
        ordenarNumeros(numeros, 10);
        imprimirNumeros(numeros, 10);
        System.out.print("\nDigite um número para ser buscado:");
        int n = teclado.nextInt();
        System.out.println("Achou:" + buscaRecursiva(numeros, n));
        teclado.close();

    }

}
