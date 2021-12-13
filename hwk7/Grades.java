class Grades {

    private int[] values;
    

    Grades () {};

    Grades (int[] myArray) {
      int len = myArray.length;
      values = new int[len];

      for(int i = 0; i < len; i++){
        values[i] = myArray[i];
      }
    };
    
    public void setValues(int[] myArray) { // set values declaration 
      int len = myArray.length;
      values = new int[len];

      for(int i = 0; i < len; i++){
        values[i] = myArray[i];
    }
  };

    public int[] getValues() { // returns values array
        return values;
    };

    public int highest() { // returns the highest value in array
      int len = values.length;
      int max = values[0];
      for(int i = 0; i < len; i++){
        if(max < values[i]){
          max = values[i];
        }
      }
      return max;
    };

    public int lowest() {// returns the lowest value in array 
      int len = values.length;
      int min = values[0];
      for(int i = 0; i < len; i++){
        if(min > values[i]){
          min = values[i];
        }
      }
      return min;    
    };

    public int numOfGrades() {// returns the number of grades in array 
      return values.length;
    };

    public double average() { // returns the average of array 
      double sum = 0;
      double avg = 0;
      int len = values.length; 
      for(int i = 0; i < len; i++){
        sum += values[i];
      }
      avg = sum / len;
      return avg; 
    };

    public int numOfFailingGrades(int gradeValue) { // returns the number of values in the array that are less than input value, gradeValue 
      int len = values.length;
      int counter = 0;
      for(int i = 0; i < len; i++){
        if(values[i] < gradeValue){
          counter++;
        }
      }
      return counter;
    };

    public void histogram() { // prints the histogram of grades 
      int len = values.length;
      int aGrade = 0;
      int bGrade = 0;
      int cGrade = 0;
      int dGrade = 0;
      int fGrade = 0;
      for(int i = 0; i < len; i++){
        if(values[i] <= 100 && values[i] >= 90){
          aGrade++;
        }
        else if(values[i] <= 89 && values[i] >= 80){
          bGrade++;
        }
        else if(values[i] <= 79 && values[i] >= 70){
          cGrade++;
        }
        else if(values[i] <= 69 && values[i] >= 60){
          dGrade++;
        }
        else{
          fGrade++;
        }
      }

      System.out.print("90 - 100 | ");
      while(aGrade != 0){
        System.out.print("*");
        aGrade--;
      }
      System.out.print("\n");
      System.out.print("80 - 89  | ");
      while(bGrade != 0){
        System.out.print("*");
        bGrade--;
      }
      System.out.print("\n");
      System.out.print("70 - 79  | ");
      while(cGrade != 0){
        System.out.print("*");
        cGrade--;
      }
      System.out.print("\n");
      System.out.print("60 - 69  | ");
      while(dGrade != 0){
        System.out.print("*");
        dGrade--;
      }
      System.out.print("\n");
      System.out.print("< 60     | ");
      while(fGrade != 0){
        System.out.print("*");
        fGrade--;
      }

    };
  
  }