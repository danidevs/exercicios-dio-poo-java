
public class SistemaCadastro {

    public static void main(String[] args) throws Exception {

        Pessoa marcos = new Pessoa(null, null);

        marcos.setEndereco("Rua Carlos Cavalheiro");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
