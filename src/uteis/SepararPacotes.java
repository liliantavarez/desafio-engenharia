package uteis;

import entidade.Pacote;

public class SepararPacotes {
	
	public static boolean separaInvalidos(Pacote pacote) {
		boolean pacotesInvalidos = false;
		if (pacote.getCodVendedor() == 367) {
			pacotesInvalidos = true;
		} else if (pacote.getRegiaoOrigem().equals("Centro-oeste") && pacote.getTipo().equals("Joias")) {
			pacotesInvalidos = true;
		}

		return pacotesInvalidos;
	}

	public static String separaRegiaoDestino(int codRegiaoDestino) {
		String regiaoDestino;

		if (codRegiaoDestino > 0 && codRegiaoDestino < 100) {
			regiaoDestino = "Sudeste";
		} else if (codRegiaoDestino > 99 && codRegiaoDestino < 200) {
			regiaoDestino = "Sul";
		} else if (codRegiaoDestino > 200 && codRegiaoDestino < 300) {
			regiaoDestino = "Centro-oeste";
		} else if (codRegiaoDestino > 299 && codRegiaoDestino < 400) {
			regiaoDestino = "Nordeste";
		} else {
			regiaoDestino = "Norte";
		}

		return regiaoDestino;
	}

	public static String separaRegiaoOrigem(int codRegiaoOrigem) {
		String regiaoOrigem;

		if (codRegiaoOrigem > 0 && codRegiaoOrigem < 100) {
			regiaoOrigem = "Sudeste";
		} else if (codRegiaoOrigem > 99 && codRegiaoOrigem < 200) {
			regiaoOrigem = "Sul";
		} else if (codRegiaoOrigem > 200 && codRegiaoOrigem < 300) {
			regiaoOrigem = "Centro-oeste";
		} else if (codRegiaoOrigem > 299 && codRegiaoOrigem < 400) {
			regiaoOrigem = "Nordeste";
		} else {
			regiaoOrigem = "Norte";
		}

		return regiaoOrigem;
	}

	public static String separaTipos(int codTipo) {
		String tipo;

		if (codTipo > 0 && codTipo < 100) {
			tipo = "Joias";
		} else if (codTipo > 99 && codTipo < 200) {
			tipo = "Livros";
		} else if (codTipo > 200 && codTipo < 300) {
			tipo = "Eletronicos";
		} else if (codTipo > 299 && codTipo < 400) {
			tipo = "Bebidas";
		} else {
			tipo = "Brinquedos";
		}

		return tipo;
	}

}
