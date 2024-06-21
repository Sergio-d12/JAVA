public class UptatingVariables {
    public static void main(String[] args) {
        int salario= 1000000;
        //bono
        salario=salario+200000;
        System.out.println(salario);
        // pension 100000
        salario=salario+200000;
        System.out.println(salario);
        //horas extras
        salario=salario+(2*10000);

        System.out.println(salario);
        //nombre
        String nombre= "david ";
        System.out.println(nombre);
        //contatenar
        nombre= nombre+" moreno";

        System.out.println(nombre);

        nombre= "sergio "+ nombre;

        System.out.println(nombre);
        

    }
}
