package chapter18divideandconquer;

public class Highest_PeakFinder_1D_Linear_Search{

  public static Integer findPeak(int[] A) {

    if (A == null || A.length == 0) {
      return null;
    }

    int n = A.length;
    int peak = A[0];
    for (int i = 1; i < n-1; i++){
      if (A[i - 1] <= A[i] && A[i] >= A[i + 1]){
        peak = A[i];
      }
  	}
    if (peak < A[A.length-1]){
      peak = A[A.length-1];
    }
    return peak;
  }

public static void main(String[] args) {
    int[] A = { 35, 5, 20, 2, 40, 25, 80, 25, 15, 40 };
    Integer peak = findPeak(A);
    System.out.println(peak != null ? "Peak Element is "  + peak : "No peak element!" );
  }
}
