package wiki;
import java.util.Map;


class Variable implements Expression {
	private String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public int interpret(Map<String, Expression> variables) {
		if (variables.get(name) == null)
			return 0; // Either return new Number(0).
		return variables.get(name).interpret(variables);
	}
}