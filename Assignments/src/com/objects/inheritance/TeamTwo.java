package com.objects.inheritance;

public class TeamTwo extends Project{
    String[] tools;

    public TeamTwo(String projectName, int durationInMonths, String domain, String projectManager, String[] tools) {
        super(projectName, durationInMonths, domain, projectManager);
        this.tools = tools;
    }


    void showSupportTools(){
//        String[] s1 = {"hello"};
//        System.out.println(s1);
        for(String tool:tools)
        {
            System.out.println(tools);
        }
    }
}
