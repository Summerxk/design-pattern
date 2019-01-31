package cn.tamilin.patterns.behavioral.interpreter;

/**
 * @ClassName NumberInterpreter
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 18:17
 */
public class NumberInterpreter implements Interpreter{
	private int number;

	public NumberInterpreter(int number) {
		this.number = number;
	}

	public NumberInterpreter(String number) {
		this.number = Integer.valueOf(number);
	}

	@Override
	public int interpret() {
		return this.number;
	}
}
