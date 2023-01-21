package one.digitalinnovation.gof.facade;

import Subsistema1.crm.CrmService;
import Subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade  = CepApi.getInstancia().RecuperarCidade();
        String estado = CepApi.getInstancia().RecuperarEstado();
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }

}
