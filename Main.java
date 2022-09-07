// Task # 1
// You have to write a function which takes an array of integers "seq" and an integer "target". There exist two elements of the array whose sum is equal to the target. You can assume that there exists only one solution. You have to return the indices of those elements
// [1,9,2,19]  Target = 3, Answer = 0,2
// [1, 2, 9 ,19]  

// [2,4]  Target = 6, Answer =0,1
import java.util.Arrays;
import java.util.Map;

class Main {
  public static void main(String[] args) {
    //
    int [] array = getIndex(new int[] {1,9,2,19}, 3);
    for(int i = 0 ; i < array.length; i++) {
      System.out.println(array[i]);
    }  
  }

  public static int [] getIndex(int [] array, int target) {
    Map<Integer, Integer> map = new HashMap<>();

     for(int i = 0 ; i < array.length; i++) {
        map.put(array[i], i);
    }

    for(Entry<Integer, Integer> value : map.entrySet()) {
      int first = Math.abs(target - value.getKey());
      if (map.containsKey(first)) {
          int second = map.get(first);
          return new int[]{value.getValue(), second};
      }
    }
    return new int[]{-1, -1};
  } 
}

// System Design

Identity - User authentication
Catalouge - Items available in daraz
Discount
Cart - NoSQL
Order - order 
Order Tracking 
Notification
Payment - payment 
Vendor - vendor managment
Review - NoSQL
  
Back-office
  statistic
  