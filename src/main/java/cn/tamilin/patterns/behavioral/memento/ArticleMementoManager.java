package cn.tamilin.patterns.behavioral.memento;

import java.util.Stack;

/**
 * @ClassName ArticleMementoManager
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 15:39
 */
public class ArticleMementoManager {
	private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

	public ArticleMemento getMemento() {
		ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
		return articleMemento;
	}

	public void addMemento(ArticleMemento articleMemento) {
		ARTICLE_MEMENTO_STACK.push(articleMemento);
	}

}
