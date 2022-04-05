package uteis;

import java.util.ArrayList;

import entidade.Pacote;

public class ArmazenamentoPacotes {

    private static ArmazenamentoPacotes instance;
    private ArrayList<Pacote> pacotes;


    public static ArmazenamentoPacotes getInstance(){
        if (instance==null){
            instance = new ArmazenamentoPacotes();
        }
        return instance;
    }
    
    private ArmazenamentoPacotes(){
        pacotes = new ArrayList<Pacote>();
    }
    
    public void armazenamenoPacotes(Pacote novoPacote){
        pacotes.add(novoPacote);
    }
    
    public void removePacote(Pacote pacote){
    	pacotes.remove(pacote);
    }
    
    public ArrayList<Pacote> pacotesCadastrados(){
        return pacotes;
    }
}
