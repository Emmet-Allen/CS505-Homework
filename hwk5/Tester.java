public class Tester {
    public static void main(String[] args){
        Triangle tri = new Triangle();
    
        tri.side1 = 30;
        tri.side2 = 30;
        tri.side3 = 40;
    
        int perimeter = tri.calculatePerimeter();
        Boolean equi = tri.isEquilateral();
        Boolean scale = tri.isScalene();
        Boolean iso = tri.isIsosceles();

        System.out.println(scale);
        System.out.println(iso);
        System.out.println(equi);
        System.out.println(perimeter);
            
        }
}
