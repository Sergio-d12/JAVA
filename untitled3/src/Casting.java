public class Casting {
    public static void main(String[] args) {
        // en un año recupere 40 gatos y quiero saber cuantos recupere al mes
        int gatos= 40;
        int meses= 12;
        double gatosmes= 3.0/2.9;
        System.out.println(gatosmes);
        int estimaciongatosmes=(int)gatosmes;
        System.out.println(estimaciongatosmes);
        // numeros basicos

        int a= 30;
        int b = 12;
        System.out.println(a/b);
        System.out.println((double) a/b);

        char n='1';
        int nT = n;
        System.out.println(nT);
      short nS= (short) n;
        System.out.println(nS);

    }
}
