package uteis;

import java.util.ArrayList;

import entidade.Pacote;

public class Exibir {
	static ArrayList<Pacote> pacotes = ArmazenamentoPacotes.getInstance().pacotesCadastrados();
	static ArrayList<Pacote> pacotesInvalidos = ArmazenamentoInvalidos.getInstance().pacotesCadastrados();

	public static void regiao() {
		int qntSudeste = 0, qntSul = 0, qntCentroOeste = 0, qntNordeste = 0, qntNorte = 0;

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Sudeste")) {
				System.out.println("");
				System.out.println("\n-------------------------------------------------------------------------------------\n");
				System.out.println(pacote.toString());
				qntSudeste++;
			}

		}

		System.out.println("Quantidade de pacotes com destino para o Sudeste: " + qntSudeste);

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Sul")) {
				System.out.println("");
				System.out.println("\n-------------------------------------------------------------------------------------\n");
				System.out.println(pacote.toString());
				qntSul++;
			}
		}
		System.out.println("Quantidade de pacotes com destino para o Sul: " + qntSul);

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Centro-oeste")) {
				System.out.println("");
				System.out.println("\n-------------------------------------------------------------------------------------\n");
				System.out.println(pacote.toString());
				qntCentroOeste++;
			}
		}
		System.out.println("Quantidade de pacotes com destino para o Centro-oeste: " + qntCentroOeste);

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Norte")) {
				System.out.println("");
				System.out.println("\n-------------------------------------------------------------------------------------\n");
				System.out.println(pacote.toString());
				qntNorte++;
			}
		}
		System.out.println("Quantidade de pacotes com destino para o Norte: " + qntNorte);

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Nordeste")) {
				System.out.println("");
				System.out.println("\n-------------------------------------------------------------------------------------\n");
				System.out.println(pacote.toString());
				qntNordeste++;
			}
		}
		System.out.println("Quantidade de pacotes com destino para o Nordeste: " + qntNordeste);

		int qntTotal = qntCentroOeste + qntNordeste + qntNorte + qntSudeste + qntSul;
		System.out.println("\nQuantidade total de pacotes: " + qntTotal);

	}

	public static void validosInvaldios() {
		System.out.println("\nPacotes com códigos de barras válidos\n");
		for (Pacote pacoteValido : pacotes) {
			System.out.println(pacoteValido.toString());
			System.out.println("\n-------------------------------------------------------------------------------------\n");
		}
		System.out.println("\nPacotes com códigos de barras inválidos\n");
		for (Pacote pacoteInvalido : pacotesInvalidos) {
			System.out.println(pacoteInvalido.toString());
			System.out.println("\n-------------------------------------------------------------------------------------\n");

		}
	}

	public static void sulBrinquedos() {
		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoOrigem().equals("Sul") && pacote.getTipo().equals("Brinquedos")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}
		}
	}

	public static void regiaoDestino() {
		System.out.println("\nPacotes com destino à região Sudeste\n");
		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Sudeste")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");

			}
		}
		System.out.println("\nPacotes com destino à região Sul\n");
		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Sul")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");

			}
		}
		System.out.println("\nPacotes com destino à região Centro-oeste\n");
		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Centro-oeste")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");

			}
		}
		System.out.println("\nPacotes com destino à região Nordeste\n");
		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Nordeste")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");

			}
		}
		System.out.println("\nPacotes com destino à região Norte\n");
		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Norte")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");

			}
		}

	}

	public static void vendedor() {
		System.out.println("Parcialmente processado");
		int qntEnvios, codVendedor;
		for (int i = 0; i < pacotes.size(); i++) {
			qntEnvios = 0;
			codVendedor = pacotes.get(i).getCodVendedor();
			for (int j = 0; j < pacotes.size(); j++) {
				if (pacotes.get(j).getCodVendedor().equals(codVendedor)) {
					qntEnvios++;
				}
			}
			System.out.println("Vendedor: " + codVendedor + " Quantidade de envios: " + qntEnvios);
		}
	}

	public static void regiaoTipo(String regiao) {
		System.out.println("Pacotes com destino para o " + regiao);
		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals(regiao) && pacote.getTipo().equals("Joias")) {
				System.out.println(pacote.toString());
				System.out.println("");
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}

		}

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals(regiao) && pacote.getTipo().equals("Livros")) {
				System.out.println(pacote.toString());
				System.out.println("");
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}

		}

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals(regiao) && pacote.getTipo().equals("Eletronicos")) {
				System.out.println(pacote.toString());
				System.out.println("");
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}

		}

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals(regiao) && pacote.getTipo().equals("Bebidas")) {
				System.out.println(pacote.toString());
				System.out.println("");
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}

		}

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals(regiao) && pacote.getTipo().equals("Brinquedos")) {
				System.out.println(pacote.toString());
				System.out.println("");
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}

		}

	}

	public static void despachoNorte() {
		System.out.println("\nPacotes que devem ser despachados para região norte\n");
		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Norte") || pacote.getRegiaoDestino().equals("Centro-oeste")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}
		}

	}

	public static void despachoNorteOrdenado() {
		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Norte")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}
		}

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Centro-oeste")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}
		}
	}

	public static void descargaJoias() {
		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Norte")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}
		}

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Centro-oeste") && !pacote.getTipo().equals("Joias")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}
		}

		for (Pacote pacote : pacotes) {
			if (pacote.getRegiaoDestino().equals("Centro-oeste") && pacote.getTipo().equals("Joias")) {
				System.out.println(pacote.toString());
				System.out.println("\n-------------------------------------------------------------------------------------\n");
			}
		}
	}

	public static void invalidos() {
		System.out.println("\nPacotes com códigos de barras inválidos\n");
		for (Pacote pacoteInvalido : pacotesInvalidos) {
			System.out.println(pacoteInvalido.toString());
			System.out.println("\n-------------------------------------------------------------------------------------\n");

		}
	}

}
