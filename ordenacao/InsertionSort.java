package ordenacao;

public class InsertionSort {
    private int[] vetor;

    public InsertionSort(int[] vetor) {
        this.vetor = vetor;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void sort() {
        int key;
        for (int j = 1; j < vetor.length; j++) {
            key = vetor[j];
            int i = j - 1;
            while ((i > 0) && (vetor[i] > key)) {
                vetor[i + 1] = vetor[i];
                i--;
            }
            vetor[i + 1] = key;
        }
    }
}