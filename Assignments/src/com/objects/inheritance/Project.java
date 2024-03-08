package com.objects.inheritance;

public class Project {
    String projectName;
    int durationInMonths;
    String domain;
    String projectManager;

    public Project(String projectName, int durationInMonths, String domain, String projectManager) {
        this.projectName = projectName;
        this.durationInMonths = durationInMonths;
        this.domain = domain;
        this.projectManager = projectManager;
    }

    void showProjectDetails(){
        System.out.println(this.projectName);
        System.out.println(this.durationInMonths);
        System.out.println(this.domain);
        System.out.println(this.projectManager);
    }


}


