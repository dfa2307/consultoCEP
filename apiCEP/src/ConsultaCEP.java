public class ConsultaCEP {
    private String cep;
    private String rua;
    private String bairro;
    private String estado;
    private String uf;
    private String regiao;

    public ConsultaCEP (ConsultaCEPAPI consultaCEPAPI){
        this.cep = consultaCEPAPI.cep();
        this.rua = consultaCEPAPI.logradouro();
        this.bairro = consultaCEPAPI.bairro();
        this.estado = consultaCEPAPI.estado();
        this.uf = consultaCEPAPI.uf();
        this.regiao = consultaCEPAPI.regiao();
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEstado() {
        return estado;
    }

    public String getUf() {
        return uf;
    }

    public String getRegiao() {
        return regiao;
    }

    @Override
    public String toString() {
        return "CEP: " + getCep() + "\n"
                + "Rua: " + getRua() + "\n"
                + "Bairro: " + getBairro() + "\n"
                + "Estado: " + getEstado() + "\n"
                + "UF: " + getUf() + "\n"
                + "Reagiao: " + getRegiao();
    }
}
