/*
* Classe que válida se o CEP é válido.
* */

public class validarCEP {

    /*Método que que verifica e retorna TRUE ou FALSE de acordo com método passado*/
    public boolean validadorCEP(String cep){

        /*Se o CEP digitado for vazio já retorna FALSE*/
        if (cep == null) return false;

        /*Essa string retorna um CEP limpo, substitui tudo que nao for número por ""*/
        String limpo = cep.replaceAll("\\D", "");

        /*Retorna falso caso o CEP não tenha 8 caracteres*/
        if(!limpo.matches("\\d{8}")){
            return false;
        }
        /*verifica se o cep e repetido EX:111111-11*/
        else if(limpo.chars().allMatch(c -> c == limpo.charAt(0))) {
            return false;
        }

        return limpo.matches("\\d{8}");
    }
}
