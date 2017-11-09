package chapter18divideandconquer;

public class All_PeakFinder_1D_Linear_Search{

  public static void findPeak(int[] A) {

    if (A == null || A.length == 0) {
      return;
    }
    int n = A.length;

    for (int i = 0; i < n; i++){
      int left = 0, right = 0;
      if (i > 0){
        left = A[i - 1];
      }
      if (i < A.length - 1){
        right = A[i + 1];
      }
      if (left <= A[i] && A[i] >= right){
        System.out.println(A[i] + "");
      }
  	}
  }

public static void main(String[] args) {
    int[] A = { 35, 5, 20, 2, 40, 25, 80, 25, 15, 40 };
    findPeak(A);
  }
}
