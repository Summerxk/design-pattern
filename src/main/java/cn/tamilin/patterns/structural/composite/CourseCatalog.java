package cn.tamilin.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseCatalog
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/28 14:44
 */
public class CourseCatalog extends CatalogComponent {
	private List<CatalogComponent> items = new ArrayList<>();
	private String name;
	private Integer level;

	public CourseCatalog(String name, Integer level) {
		this.name = name;
		this.level = level;
	}

	@Override
	public void add(CatalogComponent catalogComponent) {
		items.add(catalogComponent);
	}

	@Override
	public void remove(CatalogComponent catalogComponent) {
		items.remove(catalogComponent);
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(this.name);
		for (CatalogComponent catalogComponent : items) {
			if(this.level != null) {
				for (int i = 0; i < this.level; i++) {
					System.out.print("  ");
				}
			}
			catalogComponent.print();
		}
	}
}
