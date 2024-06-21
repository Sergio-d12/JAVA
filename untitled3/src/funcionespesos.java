public class funcionespesos {
    public static void main(String[] args) {
        System.out.println("pesos a dolares" + conversor(2000000, "pesos colombianos"));
    }

    public static double conversor(double dinero, String tipodemoneda) {
        switch (tipodemoneda) {
            case "pesos Mexicanos":
                dinero = dinero * 0.54;
                break;
            case "pesos colmbianos":
                dinero = dinero * 0.00024;
                break;
        }
        return dinero;

    }
}
