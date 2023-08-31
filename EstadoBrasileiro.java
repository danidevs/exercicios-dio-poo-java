public enum EstadoBrasileiro {

    SAO_PAULO("SP", "São Paulo"),
    RIO_JANEIRO("RJ", "Rio de JAneiro"),
    PIAUI("PI", "piauí"),
    MARANHAO("MA", "Maranhão"),
    CEARA("CE", "Ceará");

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNome() {
        return nome;
    }

    public char[] getNomeMaisculo() {
        return null;
    }

    public char[] getSigla() {
        return null;
    }
}
