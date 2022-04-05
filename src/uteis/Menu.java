package uteis;

import java.util.Scanner;

public class Menu {
	private int escolha = -1;
	Scanner s = new Scanner(System.in);

	public void menu() {
		do {
			System.out.println("\n------------------------ Leitor de código de barras da Loggi ------------------------\n");
			System.out.println("01. Identificar a região de destino de cada pacote");
			System.out.println("02. Saber quais pacotes possuem códigos de barras válidos e/ou inválidos");
			System.out.println("03. Pacotes que tem como origem a região Sul e brinquedos em seu conteudo ");
			System.out.println("04. Listar os pacotes agrupados por região de destino");
			System.out.println("05. Listar o número de pacotes enviados por cada vendedor (Parcialmente processado)");
			System.out.println("06. Gerar o relatório/lista de pacotes por destino e por tipo");
			System.out.println("07. Pacotes que devem ser despachados no caminhão para região Norte?");
			System.out.println("08. Ordem de carga para descarregar os pacotes da Região Centro Oeste primeiro");
			System.out.println("09. No item acima considerar que as jóias fossem sempre as primeiras serem descarregadas");
			System.out.println("10. Listar os pacotes inválidos.\n");
			System.out.println("00. Sair");
			escolha = s.nextInt();
			switch (escolha) {
			case 1:
				Exibir.regiao();
				break;
			case 2:
				Exibir.validosInvaldios();
				break;
			case 3:
				Exibir.sulBrinquedos();
				break;
			case 4:
				Exibir.regiaoDestino();
				break;
			case 5:
				Exibir.vendedor();
				break;
			case 6:
				Exibir.regiaoTipo("Sudeste");
				Exibir.regiaoTipo("Sul");
				Exibir.regiaoTipo("Centro-oeste");
				Exibir.regiaoTipo("Nordeste");
				Exibir.regiaoTipo("Norte");
				break;
			case 7:
				Exibir.despachoNorte();
				break;
			case 8:
				Exibir.despachoNorteOrdenado();
				break;
			case 9:
				Exibir.descargaJoias();
				break;
			case 10:
				Exibir.invalidos();
				break;
			default:
				System.out.println("Opção Invalida!");
			}

		} while (escolha != 0);
	}
}