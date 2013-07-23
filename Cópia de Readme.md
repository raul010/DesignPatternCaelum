Algumas observa��es pessoais sobre cada um dos Patterns.

Strategy - Polimorfismo; Qualquer objeto de um mesmo tipo (Imposto), pode ser
passado como par�metro de um m�todo, e utilizado dentro desde m�todo pela mesma
chamada (ex. imposto.calcula(blah)).

Chain Of Responsability - Uma chamada a um m�todo, desencadeia a chamada � v�rios
m�todos de v�rios objetos de um mesmo tipo at� um deles retornar true. A ordem
da sequ�ncia � previamente definida. Cada um destes objetos de um mesmo tipo
guarda uma inst�ncia do pr�ximo (da cadeia), e se retornar false, o chama.

Template Method - V�rios objetos de um mesmo tipo, t�m o mesmo algor�timo
(m�scara). Ent�o � delegado a chamada destes m�todos � um m�todo pai, que
implementar� uma m�scara, que possui 'buracos' que s�o os m�todos implementados na
classe filho.

Decorator - Alguns objetos podem ser compostos. Ou seja, usar a funcionalidade de
outro objeto do mesmo tipo. � passado um segundo objeto (decorador), na constru��o
de um objeto. Este segundo objeto, � armazenado no atributo da classe pai 
(ImpostoComposto). O pai, al�m de armazenar este segundo objeto em seu atributo,
tamb�m possui um m�todo que ser� chamado pelo filho (de dentro do m�todo calcula())
que verifica se o atributo n�o � null, ou seja, se possui um objeto composto e caso 
exista ele chamar� o m�todo (calcula()) deste objeto composto, caso contr�rio, retornar� 
um valor padr�o (0 no caso).

State - Alguns objetos necessitam de um estado, e muitas vezes, de um comportamento
diferenciado, conforme o estado espec�fico no qual ele se encontra atualmente.
A classe de um pojo, guardar� um atributo que faz refer�ncia � interface que 
representa o estado atual (EstadoAtualDoObjeto), e alguns m�todos que permitem alterarmos
entre os objetos implementadores que representam cada estado (Aprovado), e outros
m�todos que tamb�m usam este atributo do EstadoAtualDoObjeto, para executar a��o
ou lan�ar uma Runtime, de acordo com o estado atual.

Builder - Permite criar objetos complexos com maior facilidade. Pode usar os 
metodos flutuantes para facilitar a leitura da constru��o. Haver� um pojo 
(NotaFiscal), uma classe - intermedi�ria - construtora (ContrutorNotaFiscal), que
por sua vez, trata todos os atributos recebidos atrav�s da "constru��o facilitada"
e por final, repassa ao pojo (NotaFiscal).

Observer - Um objeto notifica outro, se ouver altera��es neste. 
Na constru��o do Builder, pode-se definir servi�os � serem executados
ao final da constru��o. No momento da constru��o, � passado um objeto implementador
da interface ExecutaAcao como par�metro do m�todo � classe construtora
(ConstrutorNotaFiscal), que a recebe e inclui numa lista. Esta lista � iterada no
mesmo m�todo que constr�i a NotaFiscal, e cada itera��o, chamado o m�todo executa
da interface implementada por cada a��o.

-----------------
Patterns da Wikipedia

COMMAND

Um objeto encapsula toda necessidade para executar um m�todo em outro objeto.
No exemplo:
Os objetos concretos do tipo Command (FlipUpCommand e FlipDownCommand) sabem trabalhar com o m�todo
Light.turnOn e Light.turnOFF, respectivamente, em suas implementa��es de Command.execute().
Um Invoker, que � uma classe intermedi�ria (Switch) � respons�vel por chamar a execu��o
dos comandos. Alternativamente, ele tamb�m salva o hist�rico da a��o. A implementa��o do Command
optada (via polimorfismo), � passada como par�metro do m�todo. 


INTERPRETER 

Define uma linguagem macro ou sintaxe, fazendo o parse e armazenando
em objetos cada opera��o respectiva. 
No exemplo: 
Todas as classes exceto o teste, s�o de um mesmo tipo [Expression], que possuem um
m�todo [interpret()]. Uma delas [Evaluator:Expression] faz o parser, e coloca os dados 
[String] passados em objetos dos tipos mencionados, que os representem ["w x z" = 
Variable:Expression, "+" = Plus:Expression e "-" Minus:Expression].
A classe de teste, chama o objeto [Plus] armazenado nos atributos da Evaluator:Expression
e ent�o inicia a cadeia de chamada polim�rfica dos m�todos Expression.interpret().
Este objeto [Plus] � �nico, pois os outros [Minus e Variable] est�o encapsulados nele.
A classe Plus ou Minus, tem uma implementa��o do interpret a mais (de mais ou menos), em rela��o
aos outros tipos Expression [Variable, Number -- O metodo no Evaluator apenas serve de
inicio da chamada da cadeia].
O Plus � chamado. Contem dois atributos chamados left e right. Um contem o Minus, e o
outro uma Variable. O interpret chamar� portanto:
leftExpression|Minus|.interpret(variables) - rightExpression|Variable|.interpret(variables).
Em Minus o interpret() tem duas vari�veis em seus atributos, portanto:
leftExpression|Variable|.interpret(variables) - rightExpression|Variable|.interpret(variables).


MEDIATOR

Um Objeto distribui comunica��o entre dois ou mais objetos.
Desacopla e gerencia as comunica��es entre um grupo de objetos.
Unifica��o da interface de um sistema.

Normalmente, um programa � feito por um n�mero muito grande de classes. Ent�o, a l�gica 
e o c�digo s�o distribu�dos entre essas classes. No entanto, quanto mais classes houver 
no seu projeto, a comunica��o entre essas classes ser� mais complexa. Isso faz com que
a leitura e a manuten��o do programa fique mais dif�cil, tal situa��o acarreta na 
dificuldade de mudan�as no projeto, j� que, uma simples mudan�a pode afetar todo o c�digo
e as outras classes.

A comunica��o entre os objetos � encapsulada com um objeto mediador. Isso reduz a depend�ncia 
entre os objetos que est�o se comunicando.

No Exemplo:
Resumo: A classe concreta que intermedia [Mediator] mant�m todos os objetos de um tipo [tipo Command 
no caso -- possuem um m�todo execute()] e possui a��es para trabalhar com cada um destes objetos
de forma independente. Ent�o � usada uma mesma refer�ncia de Mediator, para armazenar todos os 
outros objetos.

1 - Esta refer�ncia de Mediator, � enviado via par�metro (do construtor no caso) e armazenado em cada
um de seus respectivos objetos. Ent�o os objetos conhecem seu mediador.

2 - Cada objeto envia a si pr�prio (this), via par�metro, para o Mediador registr�-lo 
(em seu atributo).
Portanto o Mediator registra os objetos do mesmo tipo [Mediator.register()], para mais 
tarde trabalhar com cada um deles [book(), view() ou search()]. ISTO DELEGA TODA A COMUNICA��O
ENTRE OS OBJETOS, AO MEDIADOR.

3 - No teste do bot�o (em Java Swing), � chamado polimorficamente o Command.execute() do
objeto que representa o Bot�o apertado (BtnView por ex.), que por sua vez, chama o mediador.view()
(daquele �nico objeto mediador existente e que conhece este e todos os bot�es), e trabalha
com a sua refer�ncia armazenada de BtnView e alternativamente, faz modifica��es nos outros
objetos tamb�m (como alternar flags).


MEMENTO

Memento � um padr�o de projeto que permite armazenar o estado interno de um objeto em um
determinado momento, para que seja poss�vel retorn�-lo a este estado, caso necess�rio.
� an�logo � uma serializa��o.

No exemplo:
1 - � criado uma lista do objeto [Memento] com, pelo menos, os mesmos atributos do objeto 
[Originator] que ser� salvo, o objeto de origem (objeto real -- de neg�cio).

2 - Apenas uma inst�ncia do objeto de origem � criada.

3 - O estado desta inst�ncia � alterado, ou seja, seus atributos s�o modificados.
Dentro do pr�prio objeto de origem, existe um saveToMemento() e restoreFromMemento().
O primeiro m�todo passa os atributos atuais deste objeto de origem, via construtor do 
objeto Memento, que inicializa todos seus atributos com estes mesmos valores, ficando id�ntico
o objeto de origem, e ent�o retorna um novo objeto Memento.

4 - Este novo objeto Memento retornado pelo saveToMemento() � armazenada ent�o na lista criada,
ent�o os estados do objeto de origem continuam a serem alterados, enquanto o Memento permanece
inalterado. O processo � repetido quantas vezes for necess�rio salvar o estado do objeto de 
origem no objeto Memento, cada uma das vezes, criando uma nova inst�ncia de Memento, e populando
a lista.

5 - Por praticidade, esta mesma inst�ncia de Originator (mas pode ser qualquer outra), chama
restoreFromMemento(Memento m), passando um objeto espec�fico de Memento, salvo na lista, 
atribuindo-se ent�o, os mesmos atributos anteriormente salvos em Memento, recuperados agora
portanto em Originator.


VISITOR

Opera��es que podem ser aplicadas a objetos sem mudar suas classes.

Permite que se crie um nova opera��o sem que se mude a classe dos elementos sobre as quais 
ela opera. � uma maneira de separar um algoritmo da estrutura de um objeto.  Um resultado pr�tico
� a habilidade de adicionar novas funcionalidades a estruturas de um objeto pr�-existente sem a 
necessidade de modific�-las.

No exemplo:

Ao inv�s de criar "print()" em cada subclasse de Elemento (Wheel, Engine, Body, and Car), deixando
o c�digo de impress�o espalhado, uma �nica classe Visitante [CarElementPrintVisitor] efetua a
a��o de impress�o requisitada.

Excencial: 
1 - Os tipos corretos de Elemento (definidos em runtime/polimorfismo) [e.g Wheels] delegam algumas 
a��es [elemento.accept(:Visitor)] para o tipo correto Visitor.

2 - Dentro deste accept(), na classe do Elemento [e.g Wheels], o visitor enviado anteriormente por
par�metro [runtime], tem todas as sobrecargas dos tipos concretos de Element, ele ent�o chamar� 
seu m�todo visitor.visit(THIS) [e.g visit(:Wheels)] (para em runtime, via sobrecarga, tratar o 
Elemento correto).

3 - Existe o Elemento "diferenciado", Car. Ele � o primeiro a ser chamado [car.accept()] e o
�ltimo a ser realizar sua a��o [visitor.visit()].


---

