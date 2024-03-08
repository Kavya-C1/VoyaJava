package com.objects.inheritance;

public class TeamOne extends Project{
    String techStack;

    public TeamOne(String projectName, int durationInMonths, String domain, String projectManager, String techStack) {
        super(projectName, durationInMonths, domain, projectManager);
        this.techStack = techStack;
    }

    String[] showTechStack(){
//        String[] s = {"hello"};
//        return s;
        return  new String[]{"java","spring"};
    }
    void getDetails(){

    }
}
