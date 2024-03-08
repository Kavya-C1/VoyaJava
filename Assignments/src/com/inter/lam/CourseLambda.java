package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {
        ICourse course = () ->{
           String[] webCourse = {"Html", "css", "bootstrap"};
            for (String courses:webCourse){
                System.out.println(courses);
            }
           return webCourse;
        };
        course.showCourse();

        ICourse course1 = () -> {
            String[] cloud = {"aws", "googlecloud", "azure"};
            for (String courses:cloud){
                System.out.println(courses);
            }
            return  cloud;
        };
        course1.showCourse();

//        ICourse course2 = ()->{
//            String[] javaFullStack = {"java", "spring", "junit"};
//            for(String courses:javaFullStack) {
//                System.out.println(courses);
//            }
//            return  javaFullStack;
//        };
//        course2.showCourse();

        ICourse course2 = ()->{
            String[] javaFullStack = {"java", "spring", "junit"};
            return  javaFullStack;
        };

        String[] web =  course2.showCourse();
        for(String webc:web) {
            System.out.println(webc);
        }

        ICourse course3 = ()-> new String[]{"mongodb","mysql"};
        for(String stack:course3.showCourse())
        System.out.println(stack);





    }
}
