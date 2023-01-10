import java.util.Scanner;

import java.lang.Math;

public class Calculadora {
    private Scanner s;

    public static void main(String[] args) throws Exception{
        Calculadora calc = new Calculadora();
        calc.s = new Scanner(System.in);
        calc.menu();
    }

    public void menu() throws Exception{
        int op = 1;
	while(op != (0)){
            System.out.println("");
            System.out.println("============================================");
            System.out.println("=================CALCULADORA================");
            System.out.println("[1] Soma");
            System.out.println("[2] Divisão");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Subtração");
            System.out.println("[5] Quadrado");
            System.out.println("[0] Sair");
            op = s.nextInt();

            switch (op){
                case 1:
                    this.soma();
                    break;
                case 2:
                    this.divisao();
                    break;
                case 3:
                    this.multiplicacao();
                    break;
                case 4:
                    this.subtracao();
                    break;
                case 5:
                    this.quadrado();
                    break;
                case 0:
                    System.out.println("Saindo...Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public void soma() {
        System.out.println("");
        System.out.println("============================================");
        System.out.println("=====================SOMA===================");
        System.out.println();
        
        float a, b, c = 0;
    
        System.out.println( "Digite os números: ");
        a = s.nextFloat();
        b = s.nextFloat();
        c = a + b;
        
        System.out.println( "A soma dos números é " + c );
    }

    public void divisao(){
        System.out.println("");
        System.out.println("============================================");
        System.out.println("===================DIVISÃO==================");
        System.out.println();
        
        float a, b, c = 0;
    
        System.out.println( "Digite os números: ");
        a = s.nextFloat();
        b = s.nextFloat();
        if(b == 0){
            System.out.println("Não é possível fazer divisão por 0.");
        } else{
            c = a / b;
            System.out.println( "A divisão dos números é " + c );
        }
    }

    public void multiplicacao(){
        System.out.println();
        System.out.println("============================================");
        System.out.println("================MULTIPLICAÇÃO===============");
        System.out.println();
        
        float a, b, c = 0;
    
        System.out.println( "Digite os números: ");
        a = s.nextFloat();
        b = s.nextFloat();
        c = a * b;
        
        System.out.println( "A multiplicação dos números é " + c );
    }

    public void subtracao(){
        System.out.println("");
        System.out.println("============================================");
        System.out.println("==================SUBTRAÇÃO=================");
        System.out.println();
        
        float a, b, c = 0;
    
        System.out.println( "Digite os números: ");
        a = s.nextFloat();
        b = s.nextFloat();
        c = a - b;
        
        System.out.println( "A subtração dos números é " + c );
    }

    public void quadrado(){
        System.out.println("");
        System.out.println("============================================");
        System.out.println("==================QUADRADO==================");
        System.out.println();
        
        double a, b = 0;
    
        System.out.println( "Digite o número: ");
        a = s.nextDouble();
        b = Math.pow(a, 2);
        
        System.out.println( "O número elevado ao quadrado é " + b );
    }
}

