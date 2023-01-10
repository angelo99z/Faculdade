
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void opcao(){
      
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("1- ADICIONAR SUITE\n2- ADICIONAR HOSPEDE\n3- REALIZAR RESERVA\n0- FECHAR: \n\n");

    }
    public static void main(String[] args) {              
        
        int op = 0;
        Suite suite;
        Hospede hospede;
        Reserva reserva = new Reserva();
        
        ArrayList<Hospede> listaHospede = new ArrayList<>();
        ArrayList<Suite> listaSuite = new ArrayList<>();
        ArrayList<Reserva> listaReserva = new ArrayList<>();
        
        Scanner scannerValor = new Scanner(System.in);
        Scanner scannerTexto = new Scanner(System.in);
        Scanner EntradaEndereco = new Scanner(System.in);
        Scanner EntradaReal = new Scanner(System.in);
        
        
        do
        {
            opcao();
            op = scannerValor.nextInt();
            
            switch(op)
            {
                case 1:
                    suite = new Suite();
                    System.out.println("\n----------- Inserir suite -----------\n");
                    System.out.print("Numero da suite: ");
                    suite.setNumero(scannerValor.nextInt());
                    
                    System.out.print("Tipo da suite: ");
                    suite.setTipo(scannerTexto.next());
                    
                    System.out.print("Capacidade da suite: ");
                    suite.setCapacidade(scannerValor.nextInt());
                    
                    System.out.print("Valor da diaria da suite: ");
                    suite.setValorDiaria(EntradaReal.nextDouble());
                    
                    
                    System.out.println("Suite cadastrado com sucesso!\n");
                    listaSuite.add(suite);
                    
                    
                break;
                case 2:
                    hospede = new Hospede();
                    System.out.println("\n----------- Inserir hospede -----------\n");
                    System.out.print("Codigo do hospede: ");
                    hospede.setCodigo(scannerValor.nextInt());
                    
                    System.out.print("Nome: ");
                    hospede.setNome(scannerTexto.next());
                    
                    System.out.print("Endereço: ");
                    hospede.setEndereco(EntradaEndereco.nextLine());
                    
                    System.out.print("Idade: ");
                    hospede.setIdade(scannerValor.nextInt());
                    
                    if(hospede.getIdade() <= 2){
                        System.out.println("Bebês até 2 anos não contam na capacidade da suíte");
                    }else{
                        System.out.println("Cadastrado com sucesso.\n");
                        listaHospede.add(hospede);
                    }                  
                    
                break;
                case 3:
                    suite = new Suite();
                    hospede = new Hospede();
                    int qtdPessoa = 0, qtdDias, cont = 0;
                    
                    if(listaSuite.size() > 0 && listaHospede.size() > 0)
                    {
                        System.out.println("\n----------- Realizar reserva -----------");
                        System.out.println("Selecione um hospede:\n");
                        for (int i = 0; i < listaHospede.size(); i++) 
                        {
                            System.out.println("----------------------------------------");
                            listaHospede.get(i).exibir();                            
                        }
                        System.out.println("----------------------------------------");
                        System.out.print("Informe o codigo do hospede: ");
                        hospede.setCodigo(scannerValor.nextInt());
                        
                         for (int i = 0; i < listaHospede.size(); i++) 
                         {
                             if(listaHospede.get(i).getCodigo() == hospede.getCodigo())
                             {
                                 hospede = listaHospede.get(i);
                                 cont = 1;
                             }
                         }
                        if(cont == 1)
                        {
                            cont = 0;
                            
                            System.out.println("\n\nSuites cadastradas: ");
                            for (int i = 0; i < listaSuite.size(); i++) {

                                System.out.println("----------------------------------------");
                                listaSuite.get(i).exibir();
                            }
                            System.out.println("----------------------------------------\n");
                            System.out.println("Informe o numero da suite: ");
                            suite.setNumero(scannerValor.nextInt());

                            for (int i = 0; i < listaSuite.size(); i++) 
                            {                            
                                if(listaSuite.get(i).getNumero() == suite.getNumero())
                                {
                                     suite = listaSuite.get(i);
                                     cont = 1;
                                 }
                            }

                            if(cont == 1)
                            {
                                System.out.println("\n");

                                System.out.print("Informe a quantidade de pessoa: ");
                                qtdPessoa =  scannerValor.nextInt();

                                System.out.print("Informe a quantidade de dias: ");
                                qtdDias =  scannerValor.nextInt();

                                reserva.Cadastrar(qtdDias, qtdPessoa, suite, hospede);
                            }else
                            {
                                System.out.println("Numero da suite invalido: ");
                            }
                        }else
                        {
                            System.out.println("Codigo hospede invalido: ");
                        }
                        
                        
                    }
                    else
                    {
                        System.out.println("\nPrecisa ter hospede e suite cadastrado: ");
                    }
                break;
                default:
                    System.out.println("\nOpção inválida");
                break;

            }

            
        }while(op != 0);
    }
    
}
