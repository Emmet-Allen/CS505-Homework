class Triangle {

    int side1;
    int side2;
    int side3;

    // No two sides are the same length
    boolean isScalene() {
        if( (side1 != side2) && (side2 != side3) && (side1 != side3) ){
            return true;
        } 
    return false; 
    }
  
    // Exactly two sides are the same length
    boolean isIsosceles() {
        if( (side1 == side2) || (side2 == side3) || (side1 == side3) ){
            return true;
        } 
        return false; 
    }
  
    // All three sides are the same length
    boolean isEquilateral() {
        if( (side1 == side2) && (side2 == side3) ){
            return true;
        }
        return false;
    }
  
    int calculatePerimeter(){
        int perim = side1 + side2 + side3; 
        return perim; 
    }
}
  
  
  