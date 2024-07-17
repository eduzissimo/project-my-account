# Minha Conta

Boas-vindas ao repositório do projeto `Minha Conta`.

Para realizar o projeto, atente-se a cada passo descrito a seguir! #vqv 🚀

Aqui, você vai encontrar os detalhes de como estruturar o desenvolvimento do seu projeto com base
nesse repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

## Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes
do [Código de Conduta e do Manual da Pessoa Estudante da Trybe](https://app.betrybe.com/learn/student-manual/codigo-de-conduta-da-pessoa-estudante).

## Entregáveis

<details>
  <summary>🤷🏽‍♀️ Como entregar</summary><br />

Para entregar o seu projeto, você deverá criar um _Pull Request_ nesse repositório.

Lembre-se de que você pode consultar nosso conteúdo
sobre [Git & GitHub](https://app.betrybe.com/learn/course/5e938f69-6e32-43b3-9685-c936530fd326/module/fc998c60-386e-46bc-83ca-4269beb17e17/section/fe827a71-3222-4b4d-a66f-ed98e09961af/day/1a530297-e176-4c79-8ed9-291ae2950540/lesson/2b2edce7-9c49-4907-92a2-aa571f823b79)
e nosso [Blog - Git & GitHub](https://blog.betrybe.com/tecnologia/git-e-github/) sempre que
precisar!
</details>

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

Neste projeto, você deverá implementar uma ferramenta para gestão do consumo energético. A
ferramenta
desenvolvida permitirá que pessoas consumidoras emitam suas faturas, estimem os gastos mensais,
consultem histórico de pagamentos e uma série outras funcionalidades baseadas em uma SDK fornecida
pela Íons Energia, uma concessionária de luz ficticia que trabalhará conosco na entrega de uma
demanda
bem real.

Acenda (_ou apague_) a luz, ligue seu computador, abra o IntelliJ e vem _codar_ conosco!

</details>

<details>
  <summary><strong>📝 Habilidades a serem trabalhadas</strong></summary>

Neste projeto, vamos verificar se você é capaz de:

- `Lembrar`
  Lembrar os conceitos e as instruções relacionadas a um programa em Java, bem como as
  regras e as etapas do sistema de avaliação da Trybe.

- `Compreender`
  Compreender os requisitos e as funcionalidades de um programa em Java, assim como a
  lógica por trás dos cálculos que serão realizados.

- `Aplicar`
  Aplicar seus conhecimentos em programação Java para desenvolver um programa que
  permitirá cadastrar pessoas, imóveis, calcular consumo energético e criar uma fatura.

- `Analisar`
  Analisar diferentes casos de uso e situações para garantir que o programa funcione corretamente em
  diversas circunstâncias.

- `Avaliar`
  Avaliar se os resultados obtidos são condizentes com os esperados, sobretudo durante a utilização
  de código fornecido por terceiros.

- `Criar`
  Criar um sistema funcional que atende aos requisitos estabelecidos.

- `Solucionar problemas`
  Durante o desenvolvimento do programa, podem surgir desafios e problemas que exigirão habilidades
  de resolução de problemas para identificar e corrigir os erros.

</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar a desenvolver </strong></summary>

1. Clone o repositório

- Copie o endereço SSH do repositório e use-o para cloná-lo na sua máquina:
  - Por exemplo: `git clone <Link SSH do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
  - `cd <nome do repositório>`

2. Instale as dependências

- Para instalar todas as denpendências utilize o comando:
  - `mvn dependency:resolve`
- Para fazer todo o processo de instalação de dependências, compilação, testes, empacotamento e instalação no repositório local, utilize o comando:
  - `mvn install`

3. Crie uma branch a partir da branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Crie uma nova branch para submeter os commits do seu projeto:
    - A branch deve seguir o formato: `nome-sobrenome-nome-do-projeto`;
    - Exemplo: `git checkout -b maria-soares-minha-conta`

4. Adicione as mudanças ao _stage_ do Git e faça um `commit`

- Verifique que as mudanças ainda não estão no _stage_:
    - Exemplo: `git status` (devem aparecer listados os novos arquivos em vermelho)
- Adicione o novo arquivo ao _stage_ do Git:
    - Exemplo:
        - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
        - `git status` (devem aparecer listados os arquivos em verde)
- Faça o `commit` inicial:
    - Exemplo:
        - `git commit -m 'Iniciando o projeto X! #VQV 🚀'` (fazendo o primeiro commit)
        - `git status` (deve aparecer uma mensagem como _nothing to commit_ )

5. Envie a branch para o repositório remoto com o novo `commit`

- Usando o exemplo anterior: `git push -u origin maria-soares-minha-conta`

6. Crie um `Pull Request` _(PR)_

- Vá até a página de _Pull Requests_
  do [repositório no GitHub](https://github.com/tryber/java-036-java-projeto-minha-conta/pulls).
    - Clique no botão verde _"New pull request"_.
    - Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**.
- Coloque um título para o seu _Pull Request_.
    - Exemplo: _"Cria tela de busca"_
- Clique no botão verde _"Create pull request"_.

- Adicione uma descrição para o _Pull Request_, um título nítido que o identifique, e clique no
  botão verde _"Create pull request"_

 <img width="1335" alt="Exemplo de pull request" src="https://user-images.githubusercontent.com/42356399/166255109-b95e6eb4-2503-45e5-8fb3-cf7caa0436e5.png">

- Volte até a [página de _Pull
  Requests_ do repositório](https://github.com/tryber/java-036-java-projeto-minha-conta/pulls) e confira
  que o seu _Pull Request_ está criado.

</details>

<details>

<summary><strong>⌨️ Durante o desenvolvimento</strong></summary>

Faça `commits` das alterações que você fizer no código regularmente, pois, assim, você garante
visibilidade para o time da Trybe e treina essa prática para o mercado de trabalho. :)

- Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto.
- Os comandos que você utilizará com mais frequência são:
    - `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde -
      no stage)_;
    - `git add` _(para adicionar arquivos ao stage do Git)_;
    - `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_;
    - `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na
      primeira vez que fizer o `push` de uma nova branch)_;
    - `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_.

</details>

<details>
<summary><strong>🎛 Checkstyle</strong></summary>

Para garantir a qualidade do código, vamos utilizar nesse projeto o `Checkstyle`. Assim, o código
estará alinhado às boas práticas de desenvolvimento, sendo mais legível e de fácil manutenção!
Para poder rodar o `Checkstyle`, certifique-se de ter executado o comando `mvn install` dentro do
repositório.

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no
seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção
do conteúdo.

⚠️ **PULL REQUESTS COM ISSUES NO `Checkstyle` NÃO SERÃO AVALIADAS. ATENTE-SE PARA RESOLVÊ-LAS ANTES
DE FINALIZAR O DESENVOLVIMENTO!** ⚠️

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>


Para executar todos os testes, basta rodar o comando:

```bash
mvn test
```

Para executar apenas uma classe de testes:

```bash
mvn test -Dtest="TestClassName"
```

</details>

## Requisitos do projeto

### 1 - Implemente os atributos e o construtor da classe `EnergyBill`

Implemente em:
> src/main/java/com/betrybe/minhaconta/business/EnergyBill.java

O processo de emissão de uma conta de luz tem como base a classe `EnergyBill` que representa uma conta
de luz vinculada ao endereço de uma pessoa cliente.

Seu papel neste requisito é criar os atributos e o construtor que permitirão que o projeto possa ser
executado.

<details>
<summary>Descrição</summary><br />
Esta classe contém um conjunto de informações (atributos) que serão úteis a todo o projeto:

> - `address`: `Address`
> - `residentialPlan`: `boolean`
> - `rate`: `double`

O atributo `address` corresponde ao endereço da pessoa cliente que será utilizado para emissão da
conta de luz. Este atributo é do tipo não-primitivo `Address` que, por sua vez, foi definido pela
Íons Energia em:

> src/main/java/com/ions/lightdealer/sdk/model/Address.java

Certifique-se de ler, entender e importar esta classe para poder utilizá-la na associação de tipo ao
atributo `address`;

Já o atributo `residentialPlan` indica que o endereço para o qual emitiremos a conta está associado
a um plano residencial ou comercial, isto é importante para a nossa lógica de negócio (um valor `true` indica um plano
residencial);

O atributo `rate`, do tipo `double`, se refere ao valor em unidade monetária (reais, dólares, ienes,
etc) por quilowatt-hora consumido, a este atributo em específico você deverá atribuir um valor
inicial de `0.15`.

Por fim, certifique-se de criar um construtor para a classe que inclua os atributos que `não
receberam diretamente` um valor inicial. É por meio deste construtor que criaremos uma nova conta de
luz vinculada a um endereço que poderá ou não estar associado a um plano residencial.

</details>

### 2 - Implemente o método `adjustedTariff()`

Implemente em:
> src/main/java/com/betrybe/minhaconta/business/EnergyBill.java

Esse novo método permitirá a concessionária Íons Energia emitir um acréscimo de 10% sobre a conta de
luz quando o endereço `NÃO` estiver associado a um plano residencial.

<details>
  <summary>Descrição</summary><br />

Este método recebe um parâmetro do tipo `double` com o valor da conta de luz. Se o endereço
associado a conta for do tipo residencial o valor inicial será retornado, caso contrário um
acréscimo de 10% será feito sobre ele.

</details>

---

### 3 - Implemente o método `calculateTotalUsage()`

Implemente em:
> src/main/java/com/betrybe/minhaconta/business/EnergyBill.java

Este método deve retornar o total mensal em quilowatt-hora consumido por uma lista de dispositivos
eletrônicos.

_Mas o que é um dispositivo eletrônico em nosso sistema?_

É essencial que você compreenda o funcionamento da classe `ElectronicDevice` e seus métodos, pois um
deles poderá te auxiliar a concluir esta tarefa, ela foi disponibilizada pela Íons Energia em:

> src/main/java/com/ions/lightdealer/sdk/model/ElectronicDevice.java

<details>
  <summary>Descrição</summary><br />

Este método é responsável pelo cálculo do quilowatt-hora para uma coleção de dispositivos
eletrônicos.

Você deverá percorrer a coleção recebida e no final retornar o consumo total.

_Porém,_

O retorno do método será do tipo `inteiro`, enquanto que o consumo de cada dispositivo é do
tipo `double`. Cuide para retornar o valor esperado, removendo as casas decimais (por exemplo, se o total for `12.8`, o
retorno deverá ser apenas `12`)

</details>

---

## Você 🤝 Íons Energia

A Íons Energia está feliz com como você lidou com as demandas anteriores e te propôs uma integração
entre diferentes sistemas!

Chegou a hora de fornecer uma interface por linha de comando (CLI).
Esta interface irá unir seu trabalho nos requisitos anteriores com a API fornecida pela Íons
Energia. Além disso, as pessoas desenvolvedoras da Íons te forneceram a
classe `ConsoleUserInterface` que permitirá a criação de menus personalizados.

Para os demais requisitos deste projeto é importante que você compreenda a operação das classes
`ConsoleUserInterface` e `LightDealerApi`, implementadas respectivamente em:

> src/main/java/com/betrybe/minhaconta/presentation/ConsoleUserInterface.java
> src/main/java/com/ions/lightdealer/sdk/service/LightDealerApi.java

As instâncias dessas classes serão armazenadas nos atributos `api` e `ui` da classe `Application`. Você deve utilizar
esses atributos para realizar as chamadas necessárias em cada caso.

### 4 - Implemente o método `run()`

Implemente em:
> src/main/java/com/betrybe/minhaconta/presentation/Application.java

Este método é responsável por rodar o menu de opções em nossa aplicação. Além disso,
deverá chamar o método `inputMenuOption()` da classe `ConsoleUserInterface` e o método
`runOptionAction()` da própria `Application`.

<details>
  <summary>Descrição</summary><br />

Você deverá criar um array com as opções para o menu e repassá-lo para o método `inputMenuOption()`.

```bash
1 - Cadastrar cliente
2 - Cadastrar imóvel de cliente
3 - Cadastrar dispositivos em imóvel
4 - Estimar conta de imóvel
5 - Otimizar uso de energia
6 - Sair
```

O caractere equivalente à opção escolhida será retornado por `inputMenuOption()` e deverá ser
redirecionado para o método `runOptionAction()`. Certifique-se que o menu seja apresentado até que a
opção '6', sair, seja selecionada.

</details>

---

### 5 - Implemente o método `runOptionAction()`

Implemente em:
> src/main/java/com/betrybe/minhaconta/presentation/Application.java

Com o menu pronto, vamos agora preparar nossa aplicação para executar as opções selecionadas pelas
pessoas usuárias.

<details>
  <summary>Descrição</summary><br />

O método `runOptionAction()` recebe a opção vinda do menu implementado no requisito anterior e
deverá executar a ação correspondente (chamada de método).

> Dica: há várias formas de implementar este requisito, caso opte pelo uso de condicionais reflita
> sobre o uso da estrutura [switch](https://www.w3schools.com/java/java_switch.asp)

Garanta que:

- caso a opção 1 seja escolhida, o método `registerClient()` seja chamado;
- caso a opção 2 seja escolhida, o método `registerClientAddress()` seja chamado;
- caso a opção 3 seja escolhida, o método `registerAddressDevices()` seja chamado;
- caso a opção 4 seja escolhida, o método `estimateAddressBill()` seja chamado;
- caso a opção 5 seja escolhida, o método `optimizeEnergyBill()` seja chamado;
- caso a opção 6 seja escolhida, o método `showMessage()` da classe `ConsoleUserInterface` seja chamado
  e apresente a mensagem: "Volte sempre!";
- caso uma opção inválida seja escolhida, o método `showMessage()` da classe `ConsoleUserInterface` seja
  chamado e apresente a mensagem: "Opção inválida!";

</details>

---

### 6 - Implemente o método `registerClient()`

Implemente em:
> src/main/java/com/betrybe/minhaconta/presentation/Application.java

Precisamos cadastrar nossas pessoas clientes e para fazer isso utilizaremos o método
`registerClient()`.

<details>
  <summary>Descrição</summary><br />

Você deverá instanciar um objeto da classe `Client` e direcioná-lo para o método `fillClientData()` da
classe `ConsoleUserInterface`, que será responsável por coletar os dados da pessoa cliente que acabamos de
criar, como nome e CPF.

Além disso, é importante que a pessoa cliente seja inserida no sistema da Íons Energia por meio
do método `addClient()` da classe `LightDealerApi`.

</details>

---

### 7 - Implemente o método `registerClientAddress()`

Implemente em:
> src/main/java/com/betrybe/minhaconta/presentation/Application.java

Uma pessoa cliente pode ter a ela associada múltiplos endereços, devemos permitir essa associação
por meio de uma combinação de múltiplos métodos.

<details>

<summary>Descrição</summary><br />

Este método deve coletar o CPF da pessoa cliente para verificar se ela já está cadastrada em nosso
sistema, esta solicitação deve ser feita por meio do método `inputClientCpf()` da
`ConsoleUserInterface`.

Com o CPF da pessoa em mãos podemos buscar a pessoa cliente na API da Íons por meio do método
`findClient()`;

Se o retorno de `findClient` for nulo, então uma mensagem deve ser impressa por meio do método
showMessage da nossa `ConsoleUserInterface` com os seguintes
dizeres: `"Pessoa cliente não encontrada!"`.

Caso a pessoa cliente seja encontrada, criaremos um novo objeto do tipo `Address`, que será
repassado ao método `fillAddressData()` responsável por preencher os campos associados a um endereço
(rua, número, bairro, etc). O método `fillAddressData` pode ser encontrado na classe
`ConsoleUserInterface`;

Por fim, o método da `addAddressToClient()` fornecido pela API da Íons deve ser chamado para associar
endereço e pessoa cliente.
</details>

---

### 8 - Implemente o método `registerAddressDevices()`

Implemente em:
> src/main/java/com/betrybe/minhaconta/presentation/Application.java

Com a base pronta precisamos de um mecanismo que nos permita cadastrar dispositivos
eletrônicos.

<details>
  <summary>Descrição</summary><br />

Este método deve coletar a matrícula do imóvel por meio do método `inputAddressRegistration()` da
classe `ConsoleUserInterface`.

Uma vez com a matrícula deveremos verificar se há um endereço a ela associado. Há um método
`findAddress()` na API da Íons que poderá ser utilizado para este propósito.

Se o endereço não for encontrado uma mensagem com os seguintes dizeres deve ser repassada ao método
`showMessage` da nossa CLI: `"Endereço não encontrado!"`.

Caso contrário, iniciaremos o processo de cadastro de dispositivos determinando primeiro o número de
dispositivos que queremos cadastrar. Para apoiar nesta etapa o método `inputNumberOfDevices()` da CLI
pode ser utilizado.

Sabendo o número exato de dispositivos (`ElectronicDevice`) que queremos cadastrar poderemos
instanciá-los e com o apoio do método `fillDeviceData()` da CLI cadastrá-los no sistema.

Além disso, é preciso que cada dispositivo também seja associado a um endereço. Isso só será
possível por meio do método `addDeviceToAddress()` fornecido pela API da Íons Energia.

</details>

---

### 9 - Implemente o método `estimateAddressBill()`

Implemente em:
> src/main/java/com/betrybe/minhaconta/presentation/Application.java

Chegou a hora do vamos ver!

Devemos implementar um método para estimar a conta de energia de um determinado endereço e
apresentar este valor em tela.

<details>
  <summary>Descrição</summary><br />

Este método deve buscar um endereço a partir da matrícula assim como no requisito anterior.

Novamente, caso o endereço não seja encontrado, a mensagem `"Endereço não encontrado!"` deverá
ser apresentada pelo método `showMessage` da nossa CLI.

Caso o endereço seja encontrado, uma nova conta deve ser instanciada utilizando o construtor criado
no primeiro
requisito deste projeto.

> A escolha entre passar um booleano true ou false para o atributo residentialPlan está a seu
> critério
> e não impactará na saída do teste.

Mostre a mensagem `"Valor estimado para a conta: "` seguida do valor da conta, que pode ser obtido
por meio do método `estimate()` da classe `EnergyBill`.

</details>

---

### 10 - Implemente os métodos `optimizeEnergyBill()` e `suggestReducedUsage`

Implemente em:
> src/main/java/com/betrybe/minhaconta/presentation/Application.java

Devemos sugerir as pessoas clientes meios para economizar na conta de luz.

<details>
  <summary>Descrição</summary><br />

** O método `optimizeEnergyBill()`:**

Este método deve buscar uma pessoa cliente pelo seu CPF, como feito em requisitos anteriores.

Novamente, caso a pessoa não seja encontrada a mensagem `"Pessoa cliente não encontrada!"` deverá
ser apresentada pelo método `showMessage` da nossa CLI.

Caso contrário, deveremos instanciar um objeto da classe `EnergyAccount` que está parcialmente
implementada em:
> src/main/java/com/betrybe/minhaconta/business/EnergyAccount.java

O objeto do tipo EnergyAccount deverá ser repassado ao método `suggestReducedUsage`, ou seja,
garanta que o método `optimizeEnergyBill` invocará o método `suggestReducedUsage`.

** O método `suggestReducedUsage()`:**

Este método receberá um parâmetro do tipo `EnergyAccount`, e deverá usar o método `findHighConsumptionDevices()` do
parâmetro recebido para pegar o array contendo os dispositivos de maior uso.

Além disso, você deverá:

- Mostrar a mensagem `"Considere reduzir o uso dos seguintes dispositivos:"` usando o `showMessage` da nossa CLI;
- Mostrar o nome de cada dispositivo na tela, um por vez, usando o `showMessage` da nossa CLI.

Note que por ora o método `findHighConsumptionDevices()` está retornando um array vazio, mas isso não impedirá os testes
de rodarem. Você fará a implementação desse método no próximo requisito.

</details>

---

### 11 - Desafio final - Implemente o método `findHighConsumptionDevices()`

Implemente em:
> src/main/java/com/betrybe/minhaconta/business/EnergyAccount.java

Este método deve retornar a lista de dispositivos de maior consumo energético em todos os endereços
associados a uma pessoa cliente.

<details>
  <summary>Descrição</summary><br />

Devemos buscar um array de endereços com todos os endereços associados a pessoa cliente passada pelo
construtor da classe `EnergyAccount`.

> Há um método da classe `Client` que automatiza esse processo, certifique-se de utilizá-lo.

Para cada endereço precisamos encontrar os dispositivos que mais consomem energia no mês. A classe
`ElectronicDevice` conta com um método que pode ser útil.

Retorne um array com os dispositivos de maior consumo de cada endereço.

O array retornado deve ter o mesmo tamanho que o número de endereços. Caso um endereço não possua dispositivos cadastrados, utilize `null` como valor correspondente.

</details>

---

Uma vez finalizado o projeto tente combinar sua implementação com a SDK fornecida pela Íons Energia,
emita faturas e ponha em prática os conhecimentos de Java adquiridos durante o desenvolvimento deste
projeto.

---
<details>
<summary><strong>🗣 Nos dê feedbacks sobre o projeto!</strong></summary>

Ao finalizar e submeter o projeto, não se esqueça de avaliar sua experiência preenchendo o
formulário.
**Leva menos de 3 minutos!**

[Formulário de avaliação do projeto](https://be-trybe.typeform.com/to/ZTeR4IbH#cohort_hidden=CH36-JAVA&template=betrybe/java-0x-projeto-minha-conta)

</details>

<details>
<summary><strong>🗂 Compartilhe seu portfólio!</strong></summary>

Você sabia que o LinkedIn é a principal rede social profissional e compartilhar o seu aprendizado lá
é muito importante para quem deseja construir uma carreira de sucesso? Compartilhe esse projeto no
seu LinkedIn, marque o perfil da Trybe (@trybe) e mostre para a sua rede toda a sua evolução.

</details>

---

<!-- mdi versão 1.1 projeto ⚠️ não exclua esse comentário -->
