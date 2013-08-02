
###Legenda:

- B - Behavioural / Comportamental

- C - Criacional / Criacional

- S - Structural / Estrutural

--------

######Explicações e observações pessoais sobre cada um dos Patterns.

OBJETIVOS
----------

Criacional
----------

###Factory Method

Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo.

### Abstract Factory 
Encapsular a escolha das classes concretas a serem utilizadas na criação dos objetos de diversas famílias.

###Builder

Separar o processo de construção de um objeto de sua representação e permitir a sua criação passo-a-passo. Diferentes tipos de objetos podem ser criados com implementações dis-tintas de cada passo.

###Prototype 

Possibilitar a criação de novos objetos a partir da cópia de objetos existentes.

###Singleton 

Permitir a criaçãodeumaúnica instânciadeuma classee fornecer ummodopara recuperá-la.

###Multiton 

Permitir a criação de uma quantidade limitada de instâncias de determinada classe e fornecer ummodo para recuperá-las.

###Object Pool 
Possibilitar o reaproveitamento de objetos.

Estrutural
----------

###Adapter 

Permitir que um objeto seja substituído por outro que, apesar de realizar a mesma tarefa,
possui uma interface diferente.

###Bridge 

Separar uma abstração de sua representação, de forma que ambos possam variar e produzir
tipos de objetos diferentes.

###Composite 

Agrupar objetos que fazem parte de uma relação parte-todo de forma a tratá-los sem
distinção.

###Decorator 

Adicionar funcionalidade a um objeto dinamicamente.

###Facade 

Prover uma interface simplificada para a utilização de várias interfaces de um subsistema.

###Front Controller 

Centralizar todas as requisições a uma aplicação Web.

###Flyweight 

Compartilhar, de forma eficiente, objetos que são usados em grande quantidade.

###Proxy 

Controlar as chamadas a um objeto através de outro objeto de mesma interface.

Strategy
----------
Polimorfismo; Qualquer objeto de um mesmo tipo (Imposto), pode ser
passado como parâmetro de um método, e utilizado dentro desde método pela mesma
chamada (ex. imposto.calcula(blah)).

Chain Of Responsability
-----------
Uma chamada a um método, desencadeia a chamada à vários
métodos de vários objetos de um mesmo tipo até um deles retornar true. A ordem
da sequência é previamente definida. Cada um destes objetos de um mesmo tipo
guarda uma instância do próximo (da cadeia), e se retornar false, o chama.

Template Method
------------
Vários objetos de um mesmo tipo, têm o mesmo algorítimo
(máscara). Então é delegado a chamada destes métodos à um método pai, que
implementará uma máscara, que possui 'buracos' que são os métodos implementados na
classe filho.


State
-------------
Alguns objetos necessitam de um estado, e muitas vezes, de um comportamento
diferenciado, conforme o estado específico no qual ele se encontra atualmente.
A classe de um pojo, guardará um atributo que faz referência à interface que 
representa o estado atual (EstadoAtualDoObjeto), e alguns métodos que permitem alterarmos
entre os objetos implementadores que representam cada estado (Aprovado), e outros
métodos que também usam este atributo do EstadoAtualDoObjeto, para executar ação
ou lançar uma Runtime, de acordo com o estado atual.

Builder
------------
Permite criar objetos complexos com maior facilidade. Pode usar os 
metodos flutuantes para facilitar a leitura da construção. Haverá um pojo 
(NotaFiscal), uma classe - intermediária - construtora (ContrutorNotaFiscal), que
por sua vez, trata todos os atributos recebidos através da "construção facilitada"
e por final, repassa ao pojo (NotaFiscal).

No outro exemplo:

- Product (Boleto)
Define os objetos que devemser construídos pelos Builders.

- Builder (BoletoBuilder)
Interface que define os passos para a criação de um produto.

- ConcreteBuilder (BBBoletoBuilder, ItauBoletoBuilder, BradescoBoletoBuilder)
Constrói um produto específico implementando a interface Builder.

- Director (GeradorDeBoleto)
Aciona osmétodo de um Builder para construir um produto

Pattern Relacionados:

- Abstract Factory, que foca na camada do factory pattern (podendo ser simples ou complexo),
enquanto um builder pattern foca na construção de um objeto complexo de outros objetos simples.

- Composite, que é frequentemente usado para construir um objeto complexo.

Observer 
---------------
Um objeto notifica outro, se ouver alterações neste. 
Na construção do Builder, pode-se definir serviços à serem executados
ao final da construção. No momento da construção, é passado um objeto implementador
da interface ExecutaAcao como parâmetro do método à classe construtora
(ConstrutorNotaFiscal), que a recebe e inclui numa lista. Esta lista é iterada no
mesmo método que constrói a NotaFiscal, e cada iteração, chamado o método executa
da interface implementada por cada ação.

-----------------

Patterns da Wikipedia

-----------------

Command
-----------
Um objeto encapsula toda necessidade para executar um método em outro objeto.

######No exemplo:
Os objetos concretos do tipo Command (FlipUpCommand e FlipDownCommand) sabem trabalhar com o método
Light.turnOn e Light.turnOFF, respectivamente, em suas implementações de Command.execute().
Um Invoker, que é uma classe intermediária (Switch) é responsável por chamar a execução
dos comandos. Alternativamente, ele também salva o histórico da ação. A implementação do Command
optada (via polimorfismo), é passada como parâmetro do método. 

Patterns Relacionados:

- Composite, que agrega um objeto. Você pode combinar isto dentro de um Composite Command Pattern. 
Em geral, um Composite Command é uma interface de Composite.
- Memento, que mantem o estado de um objeto. Command suporta undo e reundo.


Interpreter
-----------------
Define uma linguagem macro ou sintaxe, fazendo o parse e armazenando
em objetos cada operação respectiva. 

######No exemplo:
Todas as classes exceto o teste, são de um mesmo tipo [Expression], que possuem um
método [interpret()]. Uma delas [Evaluator:Expression] faz o parser, e coloca os dados 
[String] passados em objetos dos tipos mencionados, que os representem ["w x z" = 
Variable:Expression, "+" = Plus:Expression e "-" Minus:Expression].
A classe de teste, chama o objeto [Plus] armazenado nos atributos da Evaluator:Expression
e então inicia a cadeia de chamada polimórfica dos métodos Expression.interpret().
Este objeto [Plus] é único, pois os outros [Minus e Variable] estão encapsulados nele.
A classe Plus ou Minus, tem uma implementação do interpret a mais (de mais ou menos), em relação
aos outros tipos Expression [Variable, Number -- O metodo no Evaluator apenas serve de
inicio da chamada da cadeia].
O Plus é chamado. Contem dois atributos chamados left e right. Um contem o Minus, e o
outro uma Variable. O interpret chamará portanto:
leftExpression|Minus|.interpret(variables) - rightExpression|Variable|.interpret(variables).
Em Minus o interpret() tem duas variáveis em seus atributos, portanto:
leftExpression|Variable|.interpret(variables) - rightExpression|Variable|.interpret(variables).


Mediator
------------------
Um Objeto distribui comunicação entre dois ou mais objetos.
Desacopla e gerencia as comunicações entre um grupo de objetos.
Unificação da interface de um sistema.

Normalmente, um programa é feito por um número muito grande de classes. Então, a lógica 
e o código são distribuídos entre essas classes. No entanto, quanto mais classes houver 
no seu projeto, a comunicação entre essas classes será mais complexa. Isso faz com que
a leitura e a manutenção do programa fique mais difícil, tal situação acarreta na 
dificuldade de mudanças no projeto, já que, uma simples mudança pode afetar todo o código
e as outras classes.

A comunicação entre os objetos é encapsulada com um objeto mediador. Isso reduz a dependência 
entre os objetos que estão se comunicando.

######No exemplo:
Resumo: A classe concreta que intermedia [Mediator] mantém todos os objetos de um tipo [tipo Command 
no caso -- possuem um método execute()] e possui ações para trabalhar com cada um destes objetos
de forma independente. Então é usada uma mesma referência de Mediator, para armazenar todos os 
outros objetos.

1 - Esta referência de Mediator, é enviado via parâmetro (do construtor no caso) e armazenado em cada
um de seus respectivos objetos. Então os objetos conhecem seu mediador.

2 - Cada objeto envia a si próprio (this), via parâmetro, para o Mediador registrá-lo 
(em seu atributo).
Portanto o Mediator registra os objetos do mesmo tipo [Mediator.register()], para mais 
tarde trabalhar com cada um deles [book(), view() ou search()]. ISTO DELEGA TODA A COMUNICAÇÃO
ENTRE OS OBJETOS, AO MEDIADOR.

3 - No teste do botão (em Java Swing), é chamado polimorficamente o Command.execute() do
objeto que representa o Botão apertado (BtnView por ex.), que por sua vez, chama o mediador.view()
(daquele único objeto mediador existente e que conhece este e todos os botões), e trabalha
com a sua referência armazenada de BtnView e alternativamente, faz modificações nos outros
objetos também (como alternar flags).

Memento
--------------
Memento permite armazenar o estado interno de um objeto em um determinado momento, para que 
seja possível retorná-lo a este estado, caso necessário. É análogo à uma serialização.

######No exemplo:
1 - É criado uma lista do objeto [Memento] com, pelo menos, os mesmos atributos do objeto 
[Originator] que será salvo, o objeto de origem (objeto real -- de negócio).

2 - Apenas uma instância do objeto de origem é criada.

3 - O estado desta instância é alterado, ou seja, seus atributos são modificados.
Dentro do próprio objeto de origem, existe um saveToMemento() e restoreFromMemento().
O primeiro método passa os atributos atuais deste objeto de origem, via construtor do 
objeto Memento, que inicializa todos seus atributos com estes mesmos valores, ficando idêntico
o objeto de origem, e então retorna um novo objeto Memento.

4 - Este novo objeto Memento retornado pelo saveToMemento() é armazenada então na lista criada,
então os estados do objeto de origem continuam a serem alterados, enquanto o Memento permanece
inalterado. O processo é repetido quantas vezes for necessário salvar o estado do objeto de 
origem no objeto Memento, cada uma das vezes, criando uma nova instância de Memento, e populando
a lista.

5 - Por praticidade, esta mesma instância de Originator (mas pode ser qualquer outra), chama
restoreFromMemento(Memento m), passando um objeto específico de Memento, salvo na lista, 
atribuindo-se então, os mesmos atributos anteriormente salvos em Memento, recuperados agora
portanto em Originator.


Visitor
----------------
Operações que podem ser aplicadas a objetos sem mudar suas classes.

Permite que se crie um nova operação sem que se mude a classe dos elementos sobre as quais 
ela opera. É uma maneira de separar um algoritmo da estrutura de um objeto.  Um resultado prático
é a habilidade de adicionar novas funcionalidades a estruturas de um objeto pré-existente sem a 
necessidade de modificá-las.

######No exemplo:
Ao invés de criar "print()" em cada subclasse de Elemento (Wheel, Engine, Body, and Car), deixando
o código de impressão espalhado, uma única classe Visitante [CarElementPrintVisitor] efetua a
ação de impressão requisitada.

Essencial:

1 - Os tipos corretos de Elemento (definidos em runtime/polimorfismo) [e.g Wheels] delegam algumas 
ações [elemento.accept(:Visitor)] para o tipo correto Visitor.

2 - Dentro deste accept(), na classe do Elemento [e.g Wheels], o visitor enviado anteriormente por
parâmetro [runtime], tem todas as sobrecargas dos tipos concretos de Element, ele então chamará 
seu método visitor.visit(THIS) [e.g visit(:Wheels)] (para em runtime, via sobrecarga, tratar o 
Elemento correto).

3 - Existe o Elemento "diferenciado", Car. Ele é o primeiro a ser chamado [car.accept()] e o
último a ser realizar sua ação [visitor.visit()].

Abstract Factory
----------------
Provê uma interface para criar uma família de objetos relacionados ou dependentes sem especificar 
suas classes concretas.

Quando usar o padrão Abstract Factory?

- Quando um sistema deve ser independente de como seus produtos são criados, compostos e
representados;
- Quando um sistema deve ser configurado com uma entre várias famílias de produtos;
- Quando uma família de produtos relacionados foi projetada para uso conjunto e você deve 
implementar essa restrição;
- Quando você quer fornecer uma biblioteca de classes e quer revelar sua interface e não sua 
implementação;
- Não permita portanto que objetos sejam diretamente criados com new.

http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/pat/abstractfactory.htm

######No exemplo:
Ao receber um dado externo, é definido qual dos Objetos de um mesmo tipo [Factory] que o 
represente que será utilizado [OSXFactory, no caso].

Este objeto é então passado no construtor de uma classe intermediária [Application]. Ela é 
responsável por armazenar o objeto concreto em seu atributo, e mais tarde será invocado
seu método que já sabe, em tempo de execução, tipo concreto Factory [OSXFactory] e chama
seu método deverá ser chamado [factory|:OSXFactory|.createButton()].

É retornado, portanto, para Application, a referência concreta do tipo Button, no caso OSXButton,
que então chama o método de OSXButton.

Patterns Relacionados:

- Factory method, que é frequentemente implementado com um Abstract Factory.
- Singleton, que é frequentemente implementado com um Abstract Factory.
- Prototype, que é frequentemente implementado com um Abstract Factory.
- Façade, que frequentemente usado com um Abstract Factory, por fornecer uma interface para
criação implementado classe.

Factory Method
---------------
http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/pat/factory.htm

Define uma interface para criar objetos de forma a deixar subclasses decidirem qual classe
instanciar.
Factory Method deixa que subclasses façam a instanciação.

A idéia é simples: em vez de um cliente que precisa de um objeto chamar new e assim especificar
a classe concreta que ele instancia, o cliente chama um método abstrato (Factory Method) 
especificado em alguma classe abstrata (ou interface) e a subclasse concreta vai decidir que 
tipo exato de objeto criar e retornar.

- Mudar a subclasse concreta que cria o objeto permite mudar a classe do objeto criado sem que o
cliente saiba;
- Permite estender a funcionalidade através da construção de subclasses sem afetar os clientes.

Patterns Relacionados:

- Abstract Factory, que é uma camada acima que um Factory Method;
- Template method, que define um esqueleto do algorítmo para adiar alguns passos da subclasse,
ou evitar subclasses;
- Prototype, que cria um novo objeto copiando uma instância, portanto, reduzindo as subclasses;
- Singleton, que faz com que o retorno do factory method, seja único.

###Diferenças do Abstract Factory para o Factory Method

Ambos parecem semelhante, mas:

- Em vez do cliente (que quer criar objetos sem saber as classes exatas) chamar um método de 
criação (Factory Method), ele de alguma forma possui um objeto (uma Abstract Factory) e usa este
objeto para chamar os métodos de criação;
- Onde Factory Method quer que você seja diferente (via herança) para criar objetos diferentes,
o Abstract Factory quer que você tenha algo diferente;
- Se ele possuir uma referência a uma Abstract Factory diferente, toda a criação será diferente;
- O fato de todos os métodos de criação estarem na mesma subclasse de uma Abstract Factory permite 
satisfazer a restrição de criar apenas objetos relacionados ou dependentes.

Prototype
---------
Contém os seguintes elementos:

- prototype — uma classe que declara uma interface para objetos capazes de clonar a si mesmo;
- prototype concreto — implementação de um prototype;
- cliente — cria um novo objeto através de um prototype que é capaz de clonar a si mesmo.

O padrão Prototype exige a implementação de uma operação de clonagem em cada uma das classes 
concretas do protótipo. Esta tarefa pode ser inconveniente, no caso do reaproveitamento de classes
pré-existentes que não possuem tal operação, ou mesmo complexa, se for considerada a possibilidade
de existirem referências circulares nos atributos de um objeto (um objeto possui um atributo que
referência um objeto que, por sua vez, referência o objeto original). 

Utilização

O padrão Prototype pode ser utilizado em sistemas que precisam ser independentes da forma como
os seus componentes são criados, compostos e representados. O padrão Prototype pode ser útil em
sistemas com as seguintes características:

- sistemas que utilizam classes definidas em tempo de execução;
- sistemas que utilizam o padrão Abstract Factory para criação de objetos. Neste caso, a hierarquia
de classes pode se tornar muito complexa e o padrão Prototype pode ser uma alternativa mais 
simples, por realizar a mesma tarefa com um número reduzido de classes;
- sistemas que possuem componentes cujo estado inicial possui poucas variações e onde é conveniente
disponibilizar um conjunto pré-estabelecido de protótipos que dão origem aos objetos que compõem
o sistema.
Quando utiliza o framework Spring, por exemplo, um desenvolvedor pode configurar um JavaBean como
"prototype". Esta configuração faz com que cada uma das referências a um JavaBean aponte para uma
instância diferente. O comportamento padrão, ou singleton, define que todas as referências a um 
JavaBean apontem para a mesma instância de uma classe.

Patterns Relacionados:

- Abstract Factory, que é frequentemente usado junto com Prototype. Um Abstract Factory pode
armazenar alguns prototypes para clonar objetos e retorná-los.
- Composite, que é frequentemente usado com Prototypes criando um relacionamento parte-todo.
- Decorator, que é usado para adicionar funcionalidades adicionais ao Prototype.

Singleton
-----------
Muitos projetos necessitam que algumas classes tenham apenas uma instância. Por exemplo, em uma 
aplicação que precisa de uma infraestrutura de log de dados, pode-se implementar uma classe no 
padrão singleton. Desta forma existe apenas um objeto responsável pelo log em toda a aplicação 
que é acessível unicamente através da classe singleton.

Patterns Relacionados:

- Abstract factory, que é frequentemente usado para retornar objetos únicos.
- Builder, que é usado para construir um objeto complexo, enquanto que um Singleton é usado
para criar um objeto acessível globalmente.
- Prototype, que é suado para copiar um objeto, ou criar um objeto deste protótipo, enquanto um
Singleton é usado para certificar-se que apenas um protótipo será garantido.

Adapter
------------
Adapter, também conhecido como Wrapper, é utilizado para 'adaptar' a interface de uma classe.
O Adapter permite que classes com interfaces incompatíveis possam interagir.

Adapter permite que um objeto cliente utilize serviços de outros objetos com interfaces diferentes por meio de uma interface única.

Patterns Relacionados:

- Proxy, que fornece a mesma interface como seu objeto, enquanto que um adapter fornece uma 
interfate difrente para o objeto que se adapta.
- Decorator, qie foca na adição de novas funções para um objeto, enquanto que um Adapter
coordena dois objetos diferentes.
- Bridge, que tenta separar uma interface de sua implementação, e faz um objeto variar 
independentemente, enquanto um Adapter tenta alterar e cooperar a interface de um objeto.


Bridge
--------------
Bridge é utilizado quando é desejável que uma interface (abstração) possa variar independentemente das suas implementações.

Imagine um sistema gráfico de janelas que deve ser portável para diversas plataformas. Neste sistema são encontrados diversos tipos de janelas, como ícones, diálogos, etc. Estas janelas formam uma hierarquia que contém uma abstração das janelas (classe base). Normalmente, a portabilidade seria obtida criando-se especializações dos tipos de janelas para cada uma das plataformas suportadas. O problema com essa solução reside na complexidade da hierarquia gerada e na dependência de plataforma que existirá nos clientes do sistema.

Através do padrão Bridge, a hierarquia que define os tipos de janelas é separada da hierarquia que contém a implementação. Desta forma todas as operações de Janela são abstratas e suas implementações são escondidas dos clientes.

Patterns Relacionados:

- Abstract Factory, que pode ser usado para cirar e configurar um Bridge particular.
- Adapter, que classes não-relacionadas trabalhem juntas, sendo que Bridge faz um "clear-cut" entre abstração e implementação.

Composite
---------------
Composite é utilizado para representar um objeto que é constituído pela composição de objetos similares a ele. Neste padrão, o objeto composto possui um conjunto de outros objetos que estão na mesma hierarquia de classes a que ele pertence.

O padrão composite é normalmente utilizado para representar listas recorrentes - ou recursivas - de elementos. Além disso, esta forma de representar elementos compostos em uma hierarquia de classes permite que os elementos contidos em um objeto composto sejam tratados como se fossem um único objeto. Desta forma, todos os métodos comuns às classes que representam objetos atômicos da hierarquia poderão ser aplicáveis também ao conjunto de objetos agrupados no objeto composto.

Pattern Relacionados:

- Decorator, que é frequentemente usado com Composite Pattern e com a mesma super classe.
- Flyweight, que é frequentemente usado com Composite Pattern para compartilhar componentes.
- Iterator, que é usado para percorrer os compostos.
- Visitor, que localiza operações entre as classes Composite e Leaf.


Decorator 
------------
Alguns objetos podem ser compostos. Ou seja, usar a funcionalidade de
outro objeto do mesmo tipo. É passado um segundo objeto (decorador), na construção
de um objeto. Este segundo objeto, é armazenado no atributo da classe pai 
(ImpostoComposto). O pai, além de armazenar este segundo objeto em seu atributo,
também possui um método que será chamado pelo filho (de dentro do método calcula())
que verifica se o atributo não é null, ou seja, se possui um objeto composto e caso 
exista ele chamará o método (calcula()) deste objeto composto, caso contrário, retornará 
um valor padrão (0 no caso).

Patterns Relacionados:

- Adapter pattern, que fornece uma interface diferente de objeto que adapta, enquanto um Decorator, 
altera as responsalidades de um objeto.
- Proxy pattern, que controla o acesso para o objeto, enquanto o Decorator foca na adição de novas
funcionalidades de um objeto.
- Composite pattern, que agrega um objeto, enquanto um Decorator adiciona resposabilidades para um
objeto.
- Strategy pattern, que muda as entranhas do objeto, enquanto um decorator muda o 'skin' de um 
objeto.
- Facade pattern, que fornece uma forma de esconder uma classe complexa, enquanto um decorator
adiciona função envolvendo uma classe;


Façade
----------------
Um façade (fachada em francês) é um objeto que disponibiliza uma interface simplificada para uma das funcionalidades de uma API, por exemplo. Um façade pode:

- tornar uma biblioteca de software mais fácil de entender e usar;
- tornar o código que utiliza esta biblioteca mais fácil de entender;
- reduzir as dependências em relação às características internas de uma biblioteca, trazendo flexibilidade no desenvolvimento do sistema;
- envolver uma interface mal desenhada, com uma interface melhor definida.

Um façade é um padrão de projeto (design pattern) do tipo estrutural. Os façades são muito comuns em projeto orientados a objeto. Por exemplo, a biblioteca padrão da linguagem Java contém dúzias de classes para processamento do arquivo fonte de um caractere, geração do seu desenho geométrico e dos pixels que formam este caractere. Entretanto, a maioria dos programadores Java não se preocupam com esses detalhes, pois a biblioteca contém as classes do tipo façade (Font e Graphics) que oferecem métodos simples para as operações relacionadas com fontes.

Patterns Relacionados:

- Abstract Factory, que é frequentemente usado para criar uma interface para um subsistema de uma
forma independente, e pode ser usado com uma maneira alternativa ao Façade.
- Singleton, que é frequentemente usado com um Façade.
- Mediator, que é similar ao Façade, mas um Façade não define novas funcionalidades à um subsistema.


Flyweight
-----------------
Flyweight é um padrão de projeto de software apropriado quando vários objetos devem ser manipulados, e esses não suportam dados adicionais. No padrão flyweight não existem ponteiros para os métodos do dado, pois isto consome muita memória. Em contrapartida são chamadas sub-rotinas diretamente para acessar o dado.

Um exemplo é o processador de texto. Cada caractere representa um objeto que possui uma família de fonte, um tamanho de fonte e outras informações sobre o símbolo. Como imaginado, um documento grande com tal estrutura de dados facilmente ocuparia toda a memória disponível no sistema. Para resolver o problema, como muitas dessas informações são repetidas, o flyweight é usado para reduzir os dados. Cada objeto de caractere contém uma referência para outro objeto com suas respectivas propriedades.

Patterns Relacionados:

- Composite, que suporta estruturas recursivas (encadeadas), enquanto um Flyweight é frequentemente aplicado nele.
- Factory Method, que produz objeto específico sobre requerimento, enquanto um  Flyweight utiliza-os para reduzir objetos.
- State, que permite um objeto alterar seu comportamento quando seu estado interno é alterado, enquanto um Flyweight 
é melhor implmentado nele.
- Strategy, que permite que um algorítmo varie independentemente para alternar suas necessidades, enquanto
um Flyweight baseia-se em tal Strategy.

Proxy
----------------
Um proxy, em sua forma mais geral, é uma classe que funciona como uma interface para outra classe. A classe proxy poderia conectar-se a qualquer coisa: uma conexão de rede, um objeto grande em memória, um arquivo, ou algum recurso que é difícil ou impossível de ser duplicado.

Um exemplo bem conhecido do padrão proxy é um objeto ponteiro de referência de contagem.

Em situações em que múltiplas cópias de um objeto complexo deve existir o padrão proxy pode ser adaptado para incorporar o padrão flyweight a fim de reduzir o rastro de memória das aplicações. Normalmente uma instância de um objeto complexo é criada e vários objetos proxies são criados, todos contendo uma referência ao único objeto complexo original. Quaisquer operações realizadas nos proxies são enviadas ao objeto original. Uma vez que todas as instâncias do proxy estiverem fora do escopo, a memória do objeto complexo pode ser desalocada.

Patterns relacionados:

- Adapter, que fornece uma interface diferente para o objeto que se adapta, enquanto um Proxy fornece
a mesma interface como seu objeto.
- Decorator, que foca na adição de novas funcionalidades para um objeto, enquanto um Proxy controla
acesso para o objeto.

http://www.javacamp.org/designPattern/
http://en.wikipedia.org/wiki/Template:Design_Patterns_patterns
