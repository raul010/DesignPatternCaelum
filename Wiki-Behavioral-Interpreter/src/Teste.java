/**
	The following Reverse Polish notation example illustrates the interpreter pattern. The grammar
	expression ::= plus | minus | variable | number
	plus ::= expression expression '+'
	minus ::= expression expression '-'
	variable  ::= 'a' | 'b' | 'c' | ... | 'z'
	digit = '0' | '1' | ... '9'
	number ::= digit | digit number
	
	defines a language which contains reverse Polish expressions like:
	a b +
	a b c + -
	a b + c a - -
	
 **/

//Following the interpreter pattern there is a class for each grammar rule.
import java.util.HashMap;
import java.util.Map;

//Finally evaluating the expression "w x z - +" with w = 5, x = 10, and z = 42.
public class Teste {
	public static void main(String[] args) {
		String expression = "w x z - +";
		Evaluator sentence = new Evaluator(expression);
		Map<String, Expression> variables = new HashMap<String, Expression>();
		variables.put("w", new Number(5));
		variables.put("x", new Number(10));
		variables.put("z", new Number(42));
		int result = sentence.interpret(variables);
		System.out.println(result);
	}
}