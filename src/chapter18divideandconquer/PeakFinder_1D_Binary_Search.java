package chapter18divideandconquer;
public class PeakFinder_1D_Binary_Search{

  public static Integer findPeak(int[] A) {
    if (A == null || A.length == 0) {
      return null;
    }

    int left = 0, right = A.length - 1, mid;
    while (left + 1 < right){
      mid = left + (right - left) / 2;
      if (A[mid] < A[mid - 1]){
        right = mid;
      }
      else if (A[mid] < A[mid + 1]){
        left = mid;
      }
      else{
        return mid;
      }
    }
    if (A[left] > A[right]){
      mid = left;
    }
    else{
      mid = right;
    }
    return mid;
  }

public static void main(String[] args) {
  int[] A = { 35, 5, 20, 2, 40, 25, 80, 25, 15, 40 };
  Integer peak = findPeak(A);
  System.out.println(peak != null ? "Peak Element is "  + A[peak] : "No peak element!" );
  }
}
