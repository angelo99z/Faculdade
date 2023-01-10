
public class Main {

    public static void main(String[] args) {
        Evento evento1 = new Evento("Show de eletronica", "09/09/2022",300 , 1);
        Evento evento2 = new Evento("Show de sertanejo", "10/09/2022", 1000, 150);
        Evento evento3 = new Evento("Show de rock", "11/09/2022", 750, 50);
        Evento evento4 = new Evento("Show de rap", "16/09/2022", 500, 150);
        Evento evento5 = new Evento("Show de pop 08", "17/09/2022", 1000, 50);
        Evento evento6 = new Evento("Rock in rio", "02/09/2022", 2500, 150);
        
        Ingresso ingressoPista1 = new IngressoPista("Marcos", "99886677", evento1);        
        Ingresso ingressoVip1 = new IngressoPista("Joao", "92374829", evento2);        
        Ingresso ingressoCamorote1 = new IngressoPista("Jhonatan ", "88002299", evento3);
        Ingresso ingressoPista2 = new IngressoPista("Joana", "29292929", evento4);        
        Ingresso ingressoVip2 = new IngressoPista("Maria", "00228899", evento5);        
        Ingresso ingressoCamorote2 = new IngressoPista("Ricardo ", "1222222", evento6);
        Ingresso ingressoPista3 = new IngressoPista("Joice", "89897070", evento1);        
        Ingresso ingressoVip3 = new IngressoPista("Carlos", "95952929", evento2);        
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        ingressoPista1.imprimirValor();
        ingressoPista1.mostrarResumo();        
        evento1.venderIngresso(ingressoPista1);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        ingressoPista1.imprimirValor();
        ingressoPista1.mostrarResumo();        
        evento1.venderIngresso(ingressoPista1);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        ingressoVip1.imprimirValor();
        ingressoVip1.mostrarResumo();
        evento1.venderIngresso(ingressoVip1);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        ingressoCamorote1.imprimirValor();
        ingressoCamorote1.mostrarResumo();
        evento2.venderIngresso(ingressoCamorote1);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
    }
}
