package entidade;

public class Pacote {

	private Integer codOrigem;
	private Integer codDestino;
	private Integer codLoggi;
	private Integer codVendedor;
	private Integer codTipo;
	private String regiaoDestino;
	private String regiaoOrigem;

	
	public Pacote(Integer codOrigem, Integer codDestino, Integer codLoggi, Integer codVendedor, Integer codTipo,
			String regiaoDestino, String regiaoOrigem, String tipo) {
		super();
		this.codOrigem = codOrigem;
		this.codDestino = codDestino;
		this.codLoggi = codLoggi;
		this.codVendedor = codVendedor;
		this.codTipo = codTipo;
		this.regiaoDestino = regiaoDestino;
		this.regiaoOrigem = regiaoOrigem;
		this.tipo = tipo;
	}

	public Pacote() {
		super();
	}

	public String getRegiaoDestino() {
		return regiaoDestino;
	}

	public void setRegiaoDestino(String regiaoDestino) {
		this.regiaoDestino = regiaoDestino;
	}

	public String getRegiaoOrigem() {
		return regiaoOrigem;
	}

	public void setRegiaoOrigem(String regiaoOrigem) {
		this.regiaoOrigem = regiaoOrigem;
	}

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Integer getCodOrigem() {
		return codOrigem;
	}

	public void setCodOrigem(Integer codOrigem) {
		this.codOrigem = codOrigem;
	}

	public Integer getCodDestino() {
		return codDestino;
	}

	public void setCodDestino(Integer codDestino) {
		this.codDestino = codDestino;
	}

	public Integer getCodLoggi() {
		return codLoggi;
	}

	public void setCodLoggi(Integer codLoggi) {
		this.codLoggi = codLoggi;
	}

	public Integer getCodVendedor() {
		return codVendedor;
	}

	public void setCodVendedor(Integer codVendedor) {
		this.codVendedor = codVendedor;
	}

	public Integer getCodTipo() {
		return codTipo;
	}

	public void setCodTipo(Integer codTipo) {
		this.codTipo = codTipo;
	}

	@Override
	public String toString() {
		return "Codigo: " +String.format("%03d", codOrigem) + " " + String.format("%03d", codDestino) + " " + String.format("%03d", codLoggi) + " " + String.format("%03d", codVendedor) + " " + String.format("%03d", codTipo) + "\n"
				+ "Região de origem: Cidade " + codOrigem + ", região " + regiaoOrigem + "\n" 
				+ "Região de destino: Cidade " + codDestino + ", região " + regiaoDestino + "\n"
				+"Codigo Loggi: "+String.format("%03d", codLoggi)+"\n"
				+"Codigo do vendedor do produto: "+String.format("%03d", codVendedor)+"\n"
				+"Tipo do produto: "+tipo;
	}

}
