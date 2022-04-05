package uteis;

import entidade.Pacote;

public class Armazena {
	public static void armazenar(String cod) {
		String tipo = SepararPacotes.separaTipos(Integer.parseInt(cod.substring(12, 15)));
		String regiaoDestino = SepararPacotes.separaRegiaoDestino(Integer.parseInt(cod.substring(3, 6)));
		String regiaoOrigem = SepararPacotes.separaRegiaoOrigem(Integer.parseInt(cod.substring(0, 3)));

		Pacote pacote = new Pacote(Integer.parseInt(cod.substring(0, 3)), Integer.parseInt(cod.substring(3, 6)),
				Integer.parseInt(cod.substring(6, 9)), Integer.parseInt(cod.substring(9, 12)),
				Integer.parseInt(cod.substring(12, 15)), regiaoDestino, regiaoOrigem, tipo);

		if (SepararPacotes.separaInvalidos(pacote)) {
			ArmazenamentoInvalidos.getInstance().armazenamenoPacotes(pacote);
		} else {
			ArmazenamentoPacotes.getInstance().armazenamenoPacotes(pacote);
		}

	}
}
