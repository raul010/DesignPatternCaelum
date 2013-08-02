
###Legenda:

- B - Behavioural / Comportamental

- C - Criacional / Criacional

- S - Structural / Estrutural

--------

######Explica��es e observa��es pessoais sobre cada um dos Patterns.

OBJETIVOS
----------

Criacional
----------

###Factory Method

Encapsular a escolha da classe concreta a ser utilizada na cria��o de objetos de um determinado tipo.

### Abstract Factory 
Encapsular a escolha das classes concretas a serem utilizadas na cria��o dos objetos de diversas fam�lias.

###Builder

Separar o processo de constru��o de um objeto de sua representa��o e permitir a sua cria��o passo-a-passo. Diferentes tipos de objetos podem ser criados com implementa��es dis-tintas de cada passo.

###Prototype 

Possibilitar a cria��o de novos objetos a partir da c�pia de objetos existentes.

###Singleton 

Permitir a cria��odeuma�nica inst�nciadeuma classee fornecer ummodopara recuper�-la.

###Multiton 

Permitir a cria��o de uma quantidade limitada de inst�ncias de determinada classe e fornecer ummodo para recuper�-las.

###Object Pool 
Possibilitar o reaproveitamento de objetos.

Estrutural
----------

###Adapter 

Permitir que um objeto seja substitu�do por outro que, apesar de realizar a mesma tarefa,
possui uma interface diferente.

###Bridge 

Separar uma abstra��o de sua representa��o, de forma que ambos possam variar e produzir
tipos de objetos diferentes.

###Composite 

Agrupar objetos que fazem parte de uma rela��o parte-todo de forma a trat�-los sem
distin��o.

###Decorator 

Adicionar funcionalidade a um objeto dinamicamente.

###Facade 

Prover uma interface simplificada para a utiliza��o de v�rias interfaces de um subsistema.

###Front Controller 

Centralizar todas as requisi��es a uma aplica��o Web.

###Flyweight 

Compartilhar, de forma eficiente, objetos que s�o usados em grande quantidade.

###Proxy 

Controlar as chamadas a um objeto atrav�s de outro objeto de mesma interface.

Strategy
----------
Polimorfismo; Qualquer objeto de um mesmo tipo (Imposto), pode ser
passado como par�metro de um m�todo, e utilizado dentro desde m�todo pela mesma
chamada (ex. imposto.calcula(blah)).

Chain Of Responsability
-----------
Uma chamada a um m�todo, desencadeia a chamada � v�rios
m�todos de v�rios objetos de um mesmo tipo at� um deles retornar true. A ordem
da sequ�ncia � previamente definida. Cada um destes objetos de um mesmo tipo
guarda uma inst�ncia do pr�ximo (da cadeia), e se retornar false, o chama.

Template Method
------------
V�rios objetos de um mesmo tipo, t�m o mesmo algor�timo
(m�scara). Ent�o � delegado a chamada destes m�todos � um m�todo pai, que
implementar� uma m�scara, que possui 'buracos' que s�o os m�todos implementados na
classe filho.


State
-------------
Alguns objetos necessitam de um estado, e muitas vezes, de um comportamento
diferenciado, conforme o estado espec�fico no qual ele se encontra atualmente.
A classe de um pojo, guardar� um atributo que faz refer�ncia � interface que 
representa o estado atual (EstadoAtualDoObjeto), e alguns m�todos que permitem alterarmos
entre os objetos implementadores que representam cada estado (Aprovado), e outros
m�todos que tamb�m usam este atributo do EstadoAtualDoObjeto, para executar a��o
ou lan�ar uma Runtime, de acordo com o estado atual.

Builder
------------
Permite criar objetos complexos com maior facilidade. Pode usar os 
metodos flutuantes para facilitar a leitura da constru��o. Haver� um pojo 
(NotaFiscal), uma classe - intermedi�ria - construtora (ContrutorNotaFiscal), que
por sua vez, trata todos os atributos recebidos atrav�s da "constru��o facilitada"
e por final, repassa ao pojo (NotaFiscal).

No outro exemplo:

- Product (Boleto)
Define os objetos que devemser constru�dos pelos Builders.

- Builder (BoletoBuilder)
Interface que define os passos para a cria��o de um produto.

- ConcreteBuilder (BBBoletoBuilder, ItauBoletoBuilder, BradescoBoletoBuilder)
Constr�i um produto espec�fico implementando a interface Builder.

- Director (GeradorDeBoleto)
Aciona osm�todo de um Builder para construir um produto

Pattern Relacionados:

- Abstract Factory, que foca na camada do factory pattern (podendo ser simples ou complexo),
enquanto um builder pattern foca na constru��o de um objeto complexo de outros objetos simples.

- Composite, que � frequentemente usado para construir um objeto complexo.

Observer 
---------------
Um objeto notifica outro, se ouver altera��es neste. 
Na constru��o do Builder, pode-se definir servi�os � serem executados
ao final da constru��o. No momento da constru��o, � passado um objeto implementador
da interface ExecutaAcao como par�metro do m�todo � classe construtora
(ConstrutorNotaFiscal), que a recebe e inclui numa lista. Esta lista � iterada no
mesmo m�todo que constr�i a NotaFiscal, e cada itera��o, chamado o m�todo executa
da interface implementada por cada a��o.

-----------------

Patterns da Wikipedia

-----------------

Command
-----------
Um objeto encapsula toda necessidade para executar um m�todo em outro objeto.

######No exemplo:
Os objetos concretos do tipo Command (FlipUpCommand e FlipDownCommand) sabem trabalhar com o m�todo
Light.turnOn e Light.turnOFF, respectivamente, em suas implementa��es de Command.execute().
Um Invoker, que � uma classe intermedi�ria (Switch) � respons�vel por chamar a execu��o
dos comandos. Alternativamente, ele tamb�m salva o hist�rico da a��o. A implementa��o do Command
optada (via polimorfismo), � passada como par�metro do m�todo. 

Patterns Relacionados:

- Composite, que agrega um objeto. Voc� pode combinar isto dentro de um Composite Command Pattern. 
Em geral, um Composite Command � uma interface de Composite.
- Memento, que mantem o estado de um objeto. Command suporta undo e reundo.


Interpreter
-----------------
Define uma linguagem macro ou sintaxe, fazendo o parse e armazenando
em objetos cada opera��o respectiva. 

######No exemplo:
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


Mediator
------------------
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

######No exemplo:
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

Memento
--------------
Memento permite armazenar o estado interno de um objeto em um determinado momento, para que 
seja poss�vel retorn�-lo a este estado, caso necess�rio. � an�logo � uma serializa��o.

######No exemplo:
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


Visitor
----------------
Opera��es que podem ser aplicadas a objetos sem mudar suas classes.

Permite que se crie um nova opera��o sem que se mude a classe dos elementos sobre as quais 
ela opera. � uma maneira de separar um algoritmo da estrutura de um objeto.  Um resultado pr�tico
� a habilidade de adicionar novas funcionalidades a estruturas de um objeto pr�-existente sem a 
necessidade de modific�-las.

######No exemplo:
Ao inv�s de criar "print()" em cada subclasse de Elemento (Wheel, Engine, Body, and Car), deixando
o c�digo de impress�o espalhado, uma �nica classe Visitante [CarElementPrintVisitor] efetua a
a��o de impress�o requisitada.

Essencial:

1 - Os tipos corretos de Elemento (definidos em runtime/polimorfismo) [e.g Wheels] delegam algumas 
a��es [elemento.accept(:Visitor)] para o tipo correto Visitor.

2 - Dentro deste accept(), na classe do Elemento [e.g Wheels], o visitor enviado anteriormente por
par�metro [runtime], tem todas as sobrecargas dos tipos concretos de Element, ele ent�o chamar� 
seu m�todo visitor.visit(THIS) [e.g visit(:Wheels)] (para em runtime, via sobrecarga, tratar o 
Elemento correto).

3 - Existe o Elemento "diferenciado", Car. Ele � o primeiro a ser chamado [car.accept()] e o
�ltimo a ser realizar sua a��o [visitor.visit()].

Abstract Factory
----------------
Prov� uma interface para criar uma fam�lia de objetos relacionados ou dependentes sem especificar 
suas classes concretas.

Quando usar o padr�o Abstract Factory?

- Quando um sistema deve ser independente de como seus produtos s�o criados, compostos e
representados;
- Quando um sistema deve ser configurado com uma entre v�rias fam�lias de produtos;
- Quando uma fam�lia de produtos relacionados foi projetada para uso conjunto e voc� deve 
implementar essa restri��o;
- Quando voc� quer fornecer uma biblioteca de classes e quer revelar sua interface e n�o sua 
implementa��o;
- N�o permita portanto que objetos sejam diretamente criados com new.

http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/pat/abstractfactory.htm

######No exemplo:
Ao receber um dado externo, � definido qual dos Objetos de um mesmo tipo [Factory] que o 
represente que ser� utilizado [OSXFactory, no caso].

Este objeto � ent�o passado no construtor de uma classe intermedi�ria [Application]. Ela � 
respons�vel por armazenar o objeto concreto em seu atributo, e mais tarde ser� invocado
seu m�todo que j� sabe, em tempo de execu��o, tipo concreto Factory [OSXFactory] e chama
seu m�todo dever� ser chamado [factory|:OSXFactory|.createButton()].

� retornado, portanto, para Application, a refer�ncia concreta do tipo Button, no caso OSXButton,
que ent�o chama o m�todo de OSXButton.

Patterns Relacionados:

- Factory method, que � frequentemente implementado com um Abstract Factory.
- Singleton, que � frequentemente implementado com um Abstract Factory.
- Prototype, que � frequentemente implementado com um Abstract Factory.
- Fa�ade, que frequentemente usado com um Abstract Factory, por fornecer uma interface para
cria��o implementado classe.

Factory Method
---------------
http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/pat/factory.htm

Define uma interface para criar objetos de forma a deixar subclasses decidirem qual classe
instanciar.
Factory Method deixa que subclasses fa�am a instancia��o.

A id�ia � simples: em vez de um cliente que precisa de um objeto chamar new e assim especificar
a classe concreta que ele instancia, o cliente chama um m�todo abstrato (Factory Method) 
especificado em alguma classe abstrata (ou interface) e a subclasse concreta vai decidir que 
tipo exato de objeto criar e retornar.

- Mudar a subclasse concreta que cria o objeto permite mudar a classe do objeto criado sem que o
cliente saiba;
- Permite estender a funcionalidade atrav�s da constru��o de subclasses sem afetar os clientes.

Patterns Relacionados:

- Abstract Factory, que � uma camada acima que um Factory Method;
- Template method, que define um esqueleto do algor�tmo para adiar alguns passos da subclasse,
ou evitar subclasses;
- Prototype, que cria um novo objeto copiando uma inst�ncia, portanto, reduzindo as subclasses;
- Singleton, que faz com que o retorno do factory method, seja �nico.

###Diferen�as do Abstract Factory para o Factory Method

Ambos parecem semelhante, mas:

- Em vez do cliente (que quer criar objetos sem saber as classes exatas) chamar um m�todo de 
cria��o (Factory Method), ele de alguma forma possui um objeto (uma Abstract Factory) e usa este
objeto para chamar os m�todos de cria��o;
- Onde Factory Method quer que voc� seja diferente (via heran�a) para criar objetos diferentes,
o Abstract Factory quer que voc� tenha algo diferente;
- Se ele possuir uma refer�ncia a uma Abstract Factory diferente, toda a cria��o ser� diferente;
- O fato de todos os m�todos de cria��o estarem na mesma subclasse de uma Abstract Factory permite 
satisfazer a restri��o de criar apenas objetos relacionados ou dependentes.

Prototype
---------
Cont�m os seguintes elementos:

- prototype � uma classe que declara uma interface para objetos capazes de clonar a si mesmo;
- prototype concreto � implementa��o de um prototype;
- cliente � cria um novo objeto atrav�s de um prototype que � capaz de clonar a si mesmo.

O padr�o Prototype exige a implementa��o de uma opera��o de clonagem em cada uma das classes 
concretas do prot�tipo. Esta tarefa pode ser inconveniente, no caso do reaproveitamento de classes
pr�-existentes que n�o possuem tal opera��o, ou mesmo complexa, se for considerada a possibilidade
de existirem refer�ncias circulares nos atributos de um objeto (um objeto possui um atributo que
refer�ncia um objeto que, por sua vez, refer�ncia o objeto original). 

Utiliza��o

O padr�o Prototype pode ser utilizado em sistemas que precisam ser independentes da forma como
os seus componentes s�o criados, compostos e representados. O padr�o Prototype pode ser �til em
sistemas com as seguintes caracter�sticas:

- sistemas que utilizam classes definidas em tempo de execu��o;
- sistemas que utilizam o padr�o Abstract Factory para cria��o de objetos. Neste caso, a hierarquia
de classes pode se tornar muito complexa e o padr�o Prototype pode ser uma alternativa mais 
simples, por realizar a mesma tarefa com um n�mero reduzido de classes;
- sistemas que possuem componentes cujo estado inicial possui poucas varia��es e onde � conveniente
disponibilizar um conjunto pr�-estabelecido de prot�tipos que d�o origem aos objetos que comp�em
o sistema.
Quando utiliza o framework Spring, por exemplo, um desenvolvedor pode configurar um JavaBean como
"prototype". Esta configura��o faz com que cada uma das refer�ncias a um JavaBean aponte para uma
inst�ncia diferente. O comportamento padr�o, ou singleton, define que todas as refer�ncias a um 
JavaBean apontem para a mesma inst�ncia de uma classe.

Patterns Relacionados:

- Abstract Factory, que � frequentemente usado junto com Prototype. Um Abstract Factory pode
armazenar alguns prototypes para clonar objetos e retorn�-los.
- Composite, que � frequentemente usado com Prototypes criando um relacionamento parte-todo.
- Decorator, que � usado para adicionar funcionalidades adicionais ao Prototype.

Singleton
-----------
Muitos projetos necessitam que algumas classes tenham apenas uma inst�ncia. Por exemplo, em uma 
aplica��o que precisa de uma infraestrutura de log de dados, pode-se implementar uma classe no 
padr�o singleton. Desta forma existe apenas um objeto respons�vel pelo log em toda a aplica��o 
que � acess�vel unicamente atrav�s da classe singleton.

Patterns Relacionados:

- Abstract factory, que � frequentemente usado para retornar objetos �nicos.
- Builder, que � usado para construir um objeto complexo, enquanto que um Singleton � usado
para criar um objeto acess�vel globalmente.
- Prototype, que � suado para copiar um objeto, ou criar um objeto deste prot�tipo, enquanto um
Singleton � usado para certificar-se que apenas um prot�tipo ser� garantido.

Adapter
------------
Adapter, tamb�m conhecido como Wrapper, � utilizado para 'adaptar' a interface de uma classe.
O Adapter permite que classes com interfaces incompat�veis possam interagir.

Adapter permite que um objeto cliente utilize servi�os de outros objetos com interfaces diferentes por meio de uma interface �nica.

Patterns Relacionados:

- Proxy, que fornece a mesma interface como seu objeto, enquanto que um adapter fornece uma 
interfate difrente para o objeto que se adapta.
- Decorator, qie foca na adi��o de novas fun��es para um objeto, enquanto que um Adapter
coordena dois objetos diferentes.
- Bridge, que tenta separar uma interface de sua implementa��o, e faz um objeto variar 
independentemente, enquanto um Adapter tenta alterar e cooperar a interface de um objeto.


Bridge
--------------
Bridge � utilizado quando � desej�vel que uma interface (abstra��o) possa variar independentemente das suas implementa��es.

Imagine um sistema gr�fico de janelas que deve ser port�vel para diversas plataformas. Neste sistema s�o encontrados diversos tipos de janelas, como �cones, di�logos, etc. Estas janelas formam uma hierarquia que cont�m uma abstra��o das janelas (classe base). Normalmente, a portabilidade seria obtida criando-se especializa��es dos tipos de janelas para cada uma das plataformas suportadas. O problema com essa solu��o reside na complexidade da hierarquia gerada e na depend�ncia de plataforma que existir� nos clientes do sistema.

Atrav�s do padr�o Bridge, a hierarquia que define os tipos de janelas � separada da hierarquia que cont�m a implementa��o. Desta forma todas as opera��es de Janela s�o abstratas e suas implementa��es s�o escondidas dos clientes.

Patterns Relacionados:

- Abstract Factory, que pode ser usado para cirar e configurar um Bridge particular.
- Adapter, que classes n�o-relacionadas trabalhem juntas, sendo que Bridge faz um "clear-cut" entre abstra��o e implementa��o.

Composite
---------------
Composite � utilizado para representar um objeto que � constitu�do pela composi��o de objetos similares a ele. Neste padr�o, o objeto composto possui um conjunto de outros objetos que est�o na mesma hierarquia de classes a que ele pertence.

O padr�o composite � normalmente utilizado para representar listas recorrentes - ou recursivas - de elementos. Al�m disso, esta forma de representar elementos compostos em uma hierarquia de classes permite que os elementos contidos em um objeto composto sejam tratados como se fossem um �nico objeto. Desta forma, todos os m�todos comuns �s classes que representam objetos at�micos da hierarquia poder�o ser aplic�veis tamb�m ao conjunto de objetos agrupados no objeto composto.

Pattern Relacionados:

- Decorator, que � frequentemente usado com Composite Pattern e com a mesma super classe.
- Flyweight, que � frequentemente usado com Composite Pattern para compartilhar componentes.
- Iterator, que � usado para percorrer os compostos.
- Visitor, que localiza opera��es entre as classes Composite e Leaf.


Decorator 
------------
Alguns objetos podem ser compostos. Ou seja, usar a funcionalidade de
outro objeto do mesmo tipo. � passado um segundo objeto (decorador), na constru��o
de um objeto. Este segundo objeto, � armazenado no atributo da classe pai 
(ImpostoComposto). O pai, al�m de armazenar este segundo objeto em seu atributo,
tamb�m possui um m�todo que ser� chamado pelo filho (de dentro do m�todo calcula())
que verifica se o atributo n�o � null, ou seja, se possui um objeto composto e caso 
exista ele chamar� o m�todo (calcula()) deste objeto composto, caso contr�rio, retornar� 
um valor padr�o (0 no caso).

Patterns Relacionados:

- Adapter pattern, que fornece uma interface diferente de objeto que adapta, enquanto um Decorator, 
altera as responsalidades de um objeto.
- Proxy pattern, que controla o acesso para o objeto, enquanto o Decorator foca na adi��o de novas
funcionalidades de um objeto.
- Composite pattern, que agrega um objeto, enquanto um Decorator adiciona resposabilidades para um
objeto.
- Strategy pattern, que muda as entranhas do objeto, enquanto um decorator muda o 'skin' de um 
objeto.
- Facade pattern, que fornece uma forma de esconder uma classe complexa, enquanto um decorator
adiciona fun��o envolvendo uma classe;


Fa�ade
----------------
Um fa�ade (fachada em franc�s) � um objeto que disponibiliza uma interface simplificada para uma das funcionalidades de uma API, por exemplo. Um fa�ade pode:

- tornar uma biblioteca de software mais f�cil de entender e usar;
- tornar o c�digo que utiliza esta biblioteca mais f�cil de entender;
- reduzir as depend�ncias em rela��o �s caracter�sticas internas de uma biblioteca, trazendo flexibilidade no desenvolvimento do sistema;
- envolver uma interface mal desenhada, com uma interface melhor definida.

Um fa�ade � um padr�o de projeto (design pattern) do tipo estrutural. Os fa�ades s�o muito comuns em projeto orientados a objeto. Por exemplo, a biblioteca padr�o da linguagem Java cont�m d�zias de classes para processamento do arquivo fonte de um caractere, gera��o do seu desenho geom�trico e dos pixels que formam este caractere. Entretanto, a maioria dos programadores Java n�o se preocupam com esses detalhes, pois a biblioteca cont�m as classes do tipo fa�ade (Font e Graphics) que oferecem m�todos simples para as opera��es relacionadas com fontes.

Patterns Relacionados:

- Abstract Factory, que � frequentemente usado para criar uma interface para um subsistema de uma
forma independente, e pode ser usado com uma maneira alternativa ao Fa�ade.
- Singleton, que � frequentemente usado com um Fa�ade.
- Mediator, que � similar ao Fa�ade, mas um Fa�ade n�o define novas funcionalidades � um subsistema.


Flyweight
-----------------
Flyweight � um padr�o de projeto de software apropriado quando v�rios objetos devem ser manipulados, e esses n�o suportam dados adicionais. No padr�o flyweight n�o existem ponteiros para os m�todos do dado, pois isto consome muita mem�ria. Em contrapartida s�o chamadas sub-rotinas diretamente para acessar o dado.

Um exemplo � o processador de texto. Cada caractere representa um objeto que possui uma fam�lia de fonte, um tamanho de fonte e outras informa��es sobre o s�mbolo. Como imaginado, um documento grande com tal estrutura de dados facilmente ocuparia toda a mem�ria dispon�vel no sistema. Para resolver o problema, como muitas dessas informa��es s�o repetidas, o flyweight � usado para reduzir os dados. Cada objeto de caractere cont�m uma refer�ncia para outro objeto com suas respectivas propriedades.

Patterns Relacionados:

- Composite, que suporta estruturas recursivas (encadeadas), enquanto um Flyweight � frequentemente aplicado nele.
- Factory Method, que produz objeto espec�fico sobre requerimento, enquanto um  Flyweight utiliza-os para reduzir objetos.
- State, que permite um objeto alterar seu comportamento quando seu estado interno � alterado, enquanto um Flyweight 
� melhor implmentado nele.
- Strategy, que permite que um algor�tmo varie independentemente para alternar suas necessidades, enquanto
um Flyweight baseia-se em tal Strategy.

Proxy
----------------
Um proxy, em sua forma mais geral, � uma classe que funciona como uma interface para outra classe. A classe proxy poderia conectar-se a qualquer coisa: uma conex�o de rede, um objeto grande em mem�ria, um arquivo, ou algum recurso que � dif�cil ou imposs�vel de ser duplicado.

Um exemplo bem conhecido do padr�o proxy � um objeto ponteiro de refer�ncia de contagem.

Em situa��es em que m�ltiplas c�pias de um objeto complexo deve existir o padr�o proxy pode ser adaptado para incorporar o padr�o flyweight a fim de reduzir o rastro de mem�ria das aplica��es. Normalmente uma inst�ncia de um objeto complexo � criada e v�rios objetos proxies s�o criados, todos contendo uma refer�ncia ao �nico objeto complexo original. Quaisquer opera��es realizadas nos proxies s�o enviadas ao objeto original. Uma vez que todas as inst�ncias do proxy estiverem fora do escopo, a mem�ria do objeto complexo pode ser desalocada.

Patterns relacionados:

- Adapter, que fornece uma interface diferente para o objeto que se adapta, enquanto um Proxy fornece
a mesma interface como seu objeto.
- Decorator, que foca na adi��o de novas funcionalidades para um objeto, enquanto um Proxy controla
acesso para o objeto.

http://www.javacamp.org/designPattern/
http://en.wikipedia.org/wiki/Template:Design_Patterns_patterns
