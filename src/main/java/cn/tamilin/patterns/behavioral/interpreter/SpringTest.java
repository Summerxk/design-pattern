package cn.tamilin.patterns.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @ClassName SpringTest
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 18:18
 */
public class SpringTest {
	public static void main(String[] args) {
		ExpressionParser parser =  new SpelExpressionParser();
		Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
		int result = (Integer) expression.getValue();
		System.out.println(result);
	}
}
