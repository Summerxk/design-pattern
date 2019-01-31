package cn.tamilin.patterns.behavioral.interpreter;

/**
 * @ClassName MultiInterpreter
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 18:16
 */
public class MultiInterpreter implements Interpreter{
	private Interpreter firstExpression, secondExpression;

	public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
		this.firstExpression = firstExpression;
		this.secondExpression = secondExpression;
	}

	@Override
	public int interpret() {
		return this.firstExpression.interpret() * this.secondExpression.interpret();
	}

	@Override
	public String toString() {
		return "*";
	}
}
