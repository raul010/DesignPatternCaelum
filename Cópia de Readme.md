Algumas observações pessoais sobre cada um dos Patterns.

Strategy - Polimorfismo; Qualquer objeto de um mesmo tipo (Imposto), pode ser
passado como parâmetro de um método, e utilizado dentro desde método pela mesma
chamada (ex. imposto.calcula(blah)).

Chain Of Responsability - Uma chamada a um método, desencadeia a chamada à vários
métodos de vários objetos de um mesmo tipo até um deles retornar true. A ordem
da sequência é previamente definida. Cada um destes objetos de um mesmo tipo
guarda uma instância do próximo (da cadeia), e se retornar false, o chama.

Template Method - Vários objetos de um mesmo tipo, têm o mesmo algorítimo
(máscara). Então é delegado a chamada destes métodos à um método pai, que
implementará uma máscara, que possui 'buracos' que são os métodos implementados na
classe filho.

Decorator - Alguns objetos podem ser compostos. Ou seja, usar a funcionalidade de
outro objeto do mesmo tipo. É passado um segundo objeto (decorador), na construção
de um objeto. Este segundo objeto, é armazenado no atributo da classe pai 
(ImpostoComposto). O pai, além de armazenar este segundo objeto em seu atributo,
também possui um método que será chamado pelo filho (de dentro do método calcula())
que verifica se o atributo não é null, ou seja, se possui um objeto composto e caso 
exista ele chamará o método (calcula()) deste objeto composto, caso contrário, retornará 
um valor padrão (0 no caso).

State - Alguns objetos necessitam de um estado, e muitas vezes, de um comportamento
diferenciado, conforme o estado específico no qual ele se encontra atualmente.
A classe de um pojo, guardará um atributo que faz referência à interface que 
representa o estado atual (EstadoAtualDoObjeto), e alguns métodos que permitem alterarmos
entre os objetos implementadores que representam cada estado (Aprovado), e outros
métodos que também usam este atributo do EstadoAtualDoObjeto, para executar ação
ou lançar uma Runtime, de acordo com o estado atual.

Builder - Permite criar objetos complexos com maior facilidade. Pode usar os 
metodos flutuantes para facilitar a leitura da construção. Haverá um pojo 
(NotaFiscal), uma classe - intermediária - construtora (ContrutorNotaFiscal), que
por sua vez, trata todos os atributos recebidos através da "construção facilitada"
e por final, repassa ao pojo (NotaFiscal).

Observer - Um objeto notifica outro, se ouver alterações neste. 
Na construção do Builder, pode-se definir serviços à serem executados
ao final da construção. No momento da construção, é passado um objeto implementador
da interface ExecutaAcao como parâmetro do método à classe construtora
(ConstrutorNotaFiscal), que a recebe e inclui numa lista. Esta lista é iterada no
mesmo método que constrói a NotaFiscal, e cada iteração, chamado o método executa
da interface implementada por cada ação.

-----------------
Patterns da Wikipedia

COMMAND

Um objeto encapsula toda necessidade para executar um método em outro objeto.
No exemplo:
Os objetos concretos do tipo Command (FlipUpCommand e FlipDownCommand) sabem trabalhar com o método
Light.turnOn e Light.turnOFF, respectivamente, em suas implementações de Command.execute().
Um Invoker, que é uma classe intermediária (Switch) é responsável por chamar a execução
dos comandos. Alternativamente, ele também salva o histórico da ação. A implementação do Command
optada (via polimorfismo), é passada como parâmetro do método. 


INTERPRETER 

Define uma linguagem macro ou sintaxe, fazendo o parse e armazenando
em objetos cada operação respectiva. 
No exemplo: 
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


MEDIATOR

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

No Exemplo:
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


MEMENTO

Memento é um padrão de projeto que permite armazenar o estado interno de um objeto em um
determinado momento, para que seja possível retorná-lo a este estado, caso necessário.
É análogo à uma serialização.

No exemplo:
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


VISITOR

Operações que podem ser aplicadas a objetos sem mudar suas classes.

Permite que se crie um nova operação sem que se mude a classe dos elementos sobre as quais 
ela opera. É uma maneira de separar um algoritmo da estrutura de um objeto.  Um resultado prático
é a habilidade de adicionar novas funcionalidades a estruturas de um objeto pré-existente sem a 
necessidade de modificá-las.

No exemplo:

Ao invés de criar "print()" em cada subclasse de Elemento (Wheel, Engine, Body, and Car), deixando
o código de impressão espalhado, uma única classe Visitante [CarElementPrintVisitor] efetua a
ação de impressão requisitada.

Excencial: 
1 - Os tipos corretos de Elemento (definidos em runtime/polimorfismo) [e.g Wheels] delegam algumas 
ações [elemento.accept(:Visitor)] para o tipo correto Visitor.

2 - Dentro deste accept(), na classe do Elemento [e.g Wheels], o visitor enviado anteriormente por
parâmetro [runtime], tem todas as sobrecargas dos tipos concretos de Element, ele então chamará 
seu método visitor.visit(THIS) [e.g visit(:Wheels)] (para em runtime, via sobrecarga, tratar o 
Elemento correto).

3 - Existe o Elemento "diferenciado", Car. Ele é o primeiro a ser chamado [car.accept()] e o
último a ser realizar sua ação [visitor.visit()].


---

