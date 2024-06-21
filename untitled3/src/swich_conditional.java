public class swich_conditional {
    public static void main(String[] args) {
        String tema = "oscuro";
        switch (tema){
            case "noche":
                System.out.println("selecciona el tema noche");
                break;
            case "dia":
                System.out.println("selecciona el tema dia");
                break;
            case "azul noche":
                System.out.println("selecioonaste el tema noche");
                break;
            case "oscuro":
                System.out.println("seleccionaste el tema oscuro");
                break;
            default:
                System.out.println("No selecionaste nigun tema");
        }
    }
}
