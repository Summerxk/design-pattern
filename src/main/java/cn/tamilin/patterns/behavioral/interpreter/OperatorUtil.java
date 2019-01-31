package cn.tamilin.patterns.behavioral.interpreter;

/**
 * @ClassName OperatorUtil
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 18:17
 */
public class OperatorUtil {
	public static boolean isOperator(String symbol) {
		return (symbol.equals("+") || symbol.equals("*"));
	}

	public static Interpreter getExpressionObject(Interpreter firstExpresssion, Interpreter secondExpression, String symbol) {
		if(symbol.equals("+")) {
			return new AddInterpreter(firstExpresssion,secondExpression);
		}else if(symbol.equals("*")) {
			return new MultiInterpreter(firstExpresssion,secondExpression);
		}
		return null;
	}
}
