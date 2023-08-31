public class SistemaIbge {

    public static void main(String[] args) throws Exception {

        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {

        }
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaisculo());
        System.out.println(eb.getIbge());
    }
}
