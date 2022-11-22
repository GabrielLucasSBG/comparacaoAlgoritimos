package ordenacao;

public class BubbleSort {

    private int[] vetor;

    public BubbleSort(int[] vetor) {
        this.vetor = vetor;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void sort() {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = vetor.length - 1; j > i + 1; j--) {
                if (vetor[j] < vetor[j - 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = temp;
                }
            }
        }
    }
}