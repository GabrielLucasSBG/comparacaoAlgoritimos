package ordenacao;

public class MergeSort {
    private int[] vetor;

    public MergeSort(int[] vetor) {
        this.vetor = vetor;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void merge(int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L;
        int[] R;
        int i;
        int j;

        L = new int[n1 + 1];
        R = new int[n2 + 1];

        for (i = 0; i < n1; i++) {
            L[i] = vetor[p + i];
        }

        for (j = 0; j < n2; j++) {
            R[j] = vetor[q + j + 1];
        }
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        i = j = 0;
        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                vetor[k] = L[i];
                i++;
            } else {
                vetor[k] = R[j];
                j++;
            }
        }
    }

    public void sort(int p, int r) {

        if (this.vetor.length > 500) {
            int q;

            if (p < r) {
                q = Math.floorDiv((p + r), 2);
                sort(p, q);
                sort(q + 1, r);
                merge(p, q, r);
            }
        } else {
            InsertionSort is = new InsertionSort(vetor.clone());
            is.sort();
            this.vetor = is.getVetor();
        }
    }
}