package cn.tamilin.patterns.structural.composite;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/28 15:09
 */
public class Test {

	public static void main(String[] args) {
		CatalogComponent linuxCourse = new Course("linux 课程", 20);
		CatalogComponent windowsCourse = new Course("windows 课程", 21);

		CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录",2);

		CatalogComponent mmallCourse1 = new Course("java1", 22);
		CatalogComponent mmallCourse2 = new Course("java2", 33);
		CatalogComponent mmallCourse3 = new Course("java design", 77);
		javaCourseCatalog.add(mmallCourse1);
		javaCourseCatalog.add(mmallCourse2);
		javaCourseCatalog.add(mmallCourse3);

		CatalogComponent imoocMainCourseCatelog = new CourseCatalog("imooc 课程主目录",1);
		imoocMainCourseCatelog.add(linuxCourse);
		imoocMainCourseCatelog.add(windowsCourse);
		imoocMainCourseCatelog.add(javaCourseCatalog);
		imoocMainCourseCatelog.print();
	}
}
