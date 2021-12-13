public class BubbleSort {
    public static void main(String[] args) {
        int nums[]={5,4,6,3,1,20,13,10,2,3};
        int temp;
  
      System.out.println("Before BubbleSort");
      for(int k = 0; k < nums.length; k++){
          System.out.print(nums[k] + " ");
      }
      System.out.print('\n');
  
      for(int i = 0; i < nums.length; i++){
          for(int j = 0; j < nums.length; j++){
              if(nums[j] > nums[i]){
                  temp = nums[i];
                  nums[i] = nums[j];
                  nums[j] = temp; 
              }
          }
      }
      System.out.println("After BubbleSort");
      for(int k = 0; k < nums.length; k++){
          System.out.print(nums[k] + " ");
      }
      System.out.print('\n');
    }
  }