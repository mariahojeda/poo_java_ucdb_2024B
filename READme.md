EXECUÇÃO código
Set-Location "D:\Documentos\UCDB TRABALHOS SEMESTRE\restaurante"

Get-ChildItem

javac Comanda.java Menu.java Sistema.java

java Sistema

executado em: VS CODE

ATIVIDADE
Criar um programa de um restaurante/lanchonete. O programa deverá ser capaz de realizar vendas de produtos para um determinado cliente. Esses produtos deverão já estar cadastrados no programa. O atendente irá fazer a venda e adicionar os produtos desejados na comanda do cliente, quando o cliente finalizar sua compra o funcionário fará a finalização da venda. Essa venda deverá ser salva para posterior consulta do gerente do estabelecimento.
 Especificações do trabalho:
1.	Seu programa não precisa ter interface visual, você pode utilizar o console do JAVA.

2.	Seu programa deve ter a opção de iniciar um comanda ou sair.


3.	Caso a opção seja iniciar comanda seu programa deve:
3.1.	Mostrar a lista de produtos disponíveis no estabelecimento
3.2.	Os produtos devem estar em um arquivo TXT com o formato semelhante ao a seguir:
01 | Arroz carreteiro | 15.5
02 | X-Salada | 8.0
03 | X-Tudo | 16.0
04 | Refrigerante | 4.0
05 | Pudim | 6.0
3.3.	Os produtos devem ter no mínimo essas três informações
3.4.	Sendo cada informação separada pelo símbolo "|"


4.	O programa deve esperar que o funcionário seleciona o código (primeira informação) do produto desejado
4.1.	O produto informado deve ser computado (ao finalizar a comanda a somatória dos produtos deve ser informado e salvo em outro arquivo)
4.2.	O funcionário poderá selecionar mais de um produto ou finalizar o pedido


5.	Caso o funcionário finalize a comanda, seu programa deve gravar em outro arquivo a venda feita

6.	A venda de estar em um arquivo TXT com o formato semelhante ao a seguir:


01 | Diogo Soares | 27.0
02 | Adriano Augusto | 13.0
03 | Luis Ricardo | 5.0
04 | Maria Ursula | 23.0

6.1.	A primeira informação é o código da venda
6.2.	A segunda o nome do cliente (que deve ser informado pelo funcionário)
6.3.	E a terceira é o valor total da comanda

7.	Caso o usuário selecione a opção sair, o programa deve parar sua execução.
7.1.	Os produtos devem estar no arquivo salvo.
7.2.	As vendas devem estar no arquivo salvo.
7.3.	Caso o gerente faça a alteração deste arquivo (respeitando o formato) o seu programa deve fazer a atualização dos produtos na próxima execução.
 
Observações:
 A quantidade de produtos no cardápio é livre, mas deve ter pelo menos 2 itens.
