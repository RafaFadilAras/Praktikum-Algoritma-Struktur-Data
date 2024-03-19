public class Faktorial24 {
    public int nilai;

    public int faktorialBF (int n) {
        int fakto = 1;
        int i = 1;
        do {
            fakto *= i;
            i++;
        } while (i<=n);
            return fakto;
        //for (int i=1; i <= n; i++) {
            //fakto = fakto * i;
        //}
    }

    public int faktorialDC(int n) {
        if (n==1) {
            return 1; 
        } 
        else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}