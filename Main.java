public class Main {
  public static void main(String[] args) {
    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    int right;
    int tmp;

    for(int left = 0; left <= (array.length -1) / 2; left = left + 1){
      right = (array.length -1) - left;
      tmp = array[right];
      array[right] = array[left];
      array[left] = tmp;
      
    }
  
  for(int i = 0; i <= array.length -1; i++){

    System.out.println(array[i]);
  }

 }
}