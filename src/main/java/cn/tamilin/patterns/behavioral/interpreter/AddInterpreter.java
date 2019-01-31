package cn.tamilin.patterns.behavioral.interpreter;

/**
 * @ClassName AddInterpreter
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 18:15
 */
public class AddInterpreter implements Interpreter{
	private Interpreter firstExpression, secondExpression;

	public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
		this.firstExpression = firstExpression;
		this.secondExpression = secondExpression;
	}

	@Override
	public int interpret() {
		return this.firstExpression.interpret() + this.secondExpression.interpret();
	}

	@Override
	public String toString() {
		return "+";
	}
}
