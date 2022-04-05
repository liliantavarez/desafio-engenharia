package uteis;

import java.util.ArrayList;

import entidade.Pacote;

public class ArmazenamentoInvalidos {

    private static ArmazenamentoInvalidos instance;
    private ArrayList<Pacote> pacotes;


    public static ArmazenamentoInvalidos getInstance(){
        if (instance==null){
            instance = new ArmazenamentoInvalidos();
        }
        return instance;
    }
    
    private ArmazenamentoInvalidos(){
        pacotes = new ArrayList<Pacote>();
    }
    
    public void armazenamenoPacotes(Pacote novoPacote){
        pacotes.add(novoPacote);
    }
        
    public ArrayList<Pacote> pacotesCadastrados(){
        return pacotes;
    }
}
