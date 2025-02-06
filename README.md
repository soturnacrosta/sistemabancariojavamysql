Sistema Bancário Java 

 

Mailton Olinto de Oliveira Lemos 

 

Requisitos: 

1. Criação de Conta: 

- Agência e número da conta gerados automaticamente. 

- O usuário deve cadastrar uma senha segura. 

2. Saldo Inicial: 

- O saldo inicial da conta será de R$ 0,00. 

3. Saques: 

- Somente valores dentro do saldo disponível. 

- Deve haver um limite mínimo de saque (ex.: R$ 1,00). 

4. Encerramento de Conta: 

- A conta só pode ser encerrada se o saldo for zero. 

- Deve haver um processo para confirmar a solicitação de encerramento. 

5. Transferências: 

- O valor da transferência deve estar disponível. 

- Ambas as contas devem existir e estar ativas. 

- O sistema deve registrar a transação. 

6. Persistência de Dados: 

- Todas as informações devem ser armazenadas em um banco de dados., 

 

7. Dados do cliente; 

 

- Cadastrar nome, idade e CPF do cliente. 

 

8. Histórico de transações e saldos; 

 

Dia 1:  

-Foi criado o projeto com as classes Usuario, Conta e interface TelaTerminalBancario, mas esta última foi excluída por não se encaixar no fluxo de trabalho; 

- Foram implementadas as funções de cadastro e tela de menu; 

- Foi escolhido como estratégia de criação de contas e agencias um contador que soma 1 a cada cadastro de cliente; 

- As agências começam com 1001 e contas em 101; 

- Esqueleto do projeto feito. 

 
