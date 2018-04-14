class A5_Area_of_Geometric_Figures_Using_Functions {
    double circle(float r) {
        return 3.1416*r*r;
    }
    double square(float side) {
        return side*side;
    }
    double triangle(float base,float height) {
        return base*height/2;
    }
    public static void main(String args[]) {
        A5_Area_of_Geometric_Figures_Using_Functions obj = new A5_Area_of_Geometric_Figures_Using_Functions();
        System.out.println("Area of circle: "+obj.circle(25));
        System.out.println("Area of square: "+obj.square(14));
        System.out.println("Area of triangle: "+obj.triangle(7, 8));
    }
}