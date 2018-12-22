package com.yuhaowin.design.structure.composite;

public class Test {
    public static void main(String[] args) {

        CatalogComponent LiunxCourse = new Course("Linux课程",11);
        CatalogComponent winCourse = new Course("win课程",22);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java",2);

        CatalogComponent java1 = new Course("JAVA1",33);
        CatalogComponent java2 = new Course("JAVA2",44);
        CatalogComponent java3 = new Course("JAVA3",55);
        CatalogComponent java4 = new Course("JAVA4",66);

        javaCourseCatalog.add(java1);
        javaCourseCatalog.add(java2);
        javaCourseCatalog.add(java3);
        javaCourseCatalog.add(java4);

        CatalogComponent mainCourseCatalog = new CourseCatalog("主目录",1);
        mainCourseCatalog.add(LiunxCourse);
        mainCourseCatalog.add(winCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();

    }
}
