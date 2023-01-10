
import java.util.ArrayList;

public class Reserva {
    private int quantidadeDias;
    private int quantidadePessoas;
    private Suite suite;
    private ArrayList<Hospede> hospedeResponsavel;

    public Reserva() {
        hospedeResponsavel = new ArrayList<>();
    }
    
    public void  Cadastrar(int qtdDias, int qtdPessoas, Suite suite, Hospede hospede){
        this.setQuantidadeDias(qtdDias);
        this.setQuantidadePessoas(qtdPessoas);
        this.setSuite(suite);
        hospedeResponsavel.add(hospede);
        double valor = 0;
        if(verificarCapacidade() == true){
            valor = calcularDiaria();
            if(qtdDias >= 7){
                valor = (valor /100) * 90;
            }
            System.out.println("Cadastro realizado com Sucesso");
            System.out.println("Valor da reserva: R$ "+valor);
            System.out.println("Quantidade de Pessoas: "+getQuantidadePessoas());
            System.out.println("Quantidade de Dias: "+getQuantidadeDias());
            System.out.println("Suite: "+suite.getTipo());
            System.out.println("Hospede Responsavel: "+hospede.getNome());
            System.out.println("\n");
        }else{
            System.out.println("Suite não suporta essa capacidade de pessoas");
            System.out.println("\n");
        }
    }
    public Boolean verificarCapacidade(){
        if(getQuantidadePessoas() <= suite.getCapacidade()){
            return true;
        }else{
            return false;
        }
    }
    public double calcularDiaria(){
        return suite.getValorDiaria()* getQuantidadeDias();
    }
    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public ArrayList<Hospede> getHospedeResponsavel() {
        return hospedeResponsavel;
    }

    public void setHospedeResponsavel(ArrayList<Hospede> hospedeResponsavel) {
        this.hospedeResponsavel = hospedeResponsavel;
    }

}
