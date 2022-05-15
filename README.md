# Desafio de engenharia da Loggi

Desenvolvido usando JavaSE-17, no ambiente do Eclipse Version: 2021-12 (4.22.0) Build id: 20211202-1639.

<h3>O leitor de código de barras da Loggi</h3>

<p>A Loggi está em constante expansão e precisa da sua ajuda para conectar o Brasil.
<br>
O processo de separação de pacotes acontece de modo automático, uma esteira
<br>
inteligente lê o código de barras dos pacotes e os agrupa pelas regiões de destino.
<br>
O código de barras do pacote é composto por 15 dígitos, onde cada trinca
<br>
numérica representa uma informação do pacote.
<br>
<br>
<h3>Ordem das Trincas</h3>
<br>
1 Região de Origem
<br>
2 Região de Destino
<br>
3 Código da Loggi
<br>
4 Código do Vendedor do produto
<br>
5 Tipo do produto
<br>
<br>
<h3>Código de referência: Cidade/Região</h3>
<br>
Centro-oeste 201 até 299
<br>
Nordeste 300 até 399
<br>
Norte 400 até 499
<br>
Sudeste 001 até 099
<br>
Sul 100 até 199
<br><br>
Os códigos das cidades estão ordenados por ordem de entrega na rota.

<h3>Tipo do Produto Código</h3>

Jóias 001
<br>
Livros 111
<br>
Eletrônicos 333
<br>
Bebidas 555
<br>
Brinquedos 888
<br><br>
<b>Exemplo:
<br>
Código:</b> 033 334 555 999 000
<br>
<b>Região de origem:</b> Cidade 33, região Sudeste
<br>
<b>Região de destino:</b> Cidade 334, região Nordeste
<br>
<b>Código Loggi:</b> 555
<br>
<b>Código do vendedor do produto:</b> 999
<br>
<b>Tipo do produto:</b> Jóias
<br><br>
<h3>Considere as seguintes restrições:</h3>
<br>
<b>1)</b> A Loggi não envia produtos que não sejam dos tipos acima informados.
<br>
<b>2)</b> Não é possível despachar pacotes contendo jóias tendo como região de
<br>
origem o Centro-oeste;
<br>
<b>3)</b> O vendedor 367 está com seu CNPJ inativo e, portanto, não pode mais
<br>
enviar pacotes pela Loggi, os códigos de barra que estiverem relacionados
<br>
a este vendedor devem ser considerados inválidos.

<h3>A Loggi precisa:</h3>

<br><b>1.</b> Identificar a região de destino de cada pacote, com totalização de
<br>pacotes (soma região);
<br><b>2.</b> Saber quais pacotes possuem códigos de barras válidos e/ou
<br>inválidos;
<br><b>3.</b> Identificar os pacotes que têm como origem a região Sul e
<br>Brinquedos em seu conteúdo;
<br><b>4.</b> Listar os pacotes agrupados por região de destino (Considere apenas
<br>pacotes válidos);
<br><b>5.</b> Listar o número de pacotes enviados por cada vendedor (Considere
<br>apenas pacotes válidos);
<br><b>6.</b> Gerar o relatório/lista de pacotes por destino e por tipo (Considere
<br>apenas pacotes válidos);
<br><b>7.</b> Se o transporte dos pacotes para o Norte passa pela Região
<br>Centro-Oeste, quais são os pacotes que devem ser despachados no
<br>mesmo caminhão?
<br><b>8.</b> Se todos os pacotes fossem uma fila qual seria a ordem de carga
<br>para o Norte no caminhão para descarregar os pacotes da Região
<br>Centro Oeste primeiro;
<br><b>9.</b> No item acima considerar que as jóias fossem sempre as primeiras a
<br>serem descarregadas;
<br><b>10.</b> Listar os pacotes inválidos.
<br><br>Caso tenha dificuldade em algum item, pode ser pulado, mas deixe a saída como:
<br><b>“Não processado”.</b>
