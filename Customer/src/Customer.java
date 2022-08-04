public class Customer {
    final private String agencia; //final = depois de incializada o seu valor não poderá mais ser modificado.
    private String conta;
    private String nome;
    private String cpf;
    private String cnpj;
    private Address enderecoResidencial;

    //constructor
    public Customer(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        this.nome = nome;
    }
    //setter
    public void setConta(String conta){
        this.conta = conta;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public void setEnderecoResidencial(Address enderecoResidencial){
        this.enderecoResidencial = enderecoResidencial;
    }

    //getter
    public String getAgencia() {
        return agencia;
    }
    public String getConta(){
        return conta;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getCnpj(){
        return cnpj;
    }
    public Address getEnderecoResidencial() {
        return enderecoResidencial;
    }
}
class PessoaFisica extends Customer {
    public PessoaFisica(String agencia, String conta, String nome){
        super(agencia, conta, nome);
    }
    private String cpf;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
