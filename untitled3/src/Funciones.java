public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        double area =areadelcirculo(y);
        System.out.println(area);
        double areac = areacuadrado (24);
        System.out.println(areac);
    }
    public static double areadelcirculo (double r){
        return Math.pow(r,2);

    }
    public static double areacuadrado (double lado){
        return lado*lado;
    }
}
