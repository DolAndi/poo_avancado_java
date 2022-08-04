public class TestCustomer {
    public static void main(String[] args) throws Exception {
        Customer cliente1 = new PessoaFisica("0001", "05322-4", "Hamilton");
        Customer cliente2 = new PessoaFisica("0001", "04234-2", "LeClerc");
        Customer cliente3 = new PessoaFisica("0001", "05538-4", "Alonso");
        
        cliente1.setCpf("021.456.123-21");
        cliente2.setCpf("090.500.321-40");
        cliente3.setCpf("431.930.651-42");

        Address endereco1 = new Address();
        cliente1.setEnderecoResidencial(endereco1);

        System.out.println(cliente1.getNome());
    }
}
