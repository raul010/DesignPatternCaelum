package wiki;
import java.util.Map;


class Plus implements Expression {
	Expression leftOperand;
	Expression rightOperand;

	public Plus(Expression left, Expression right) {
		leftOperand = left;
		rightOperand = right;
	}

	@Override
	public int interpret(Map<String, Expression> variables) {
		return leftOperand.interpret(variables) + rightOperand.interpret(variables);
	}
}