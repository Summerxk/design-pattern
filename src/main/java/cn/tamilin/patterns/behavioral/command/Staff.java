package cn.tamilin.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Staff
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 16:11
 */
public class Staff {

	private List<Command> commandsList = new ArrayList<>();

	public void addCommand(Command command) {
		commandsList.add(command);
	}

	public void executeCommands() {
		for (Command command : commandsList) {
			command.execute();
		}
		commandsList.clear();
	}
}
