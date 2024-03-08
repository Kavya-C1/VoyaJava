package com.objects.inheritance;

public class FinMain {
    public static void main(String[] args) {


//    String[] tools = {"Junit", "Maven", "Git", "Docker"};
//    TeamTwo tt = new TeamTwo("IB", 12, "Fin", "AB",tools);
//
//    TeamTwo tt1= new TeamTwo("IB", 12, "Fin", new String[] {"Junit", "Maven","Git","Docker"};);
//
        TeamOne teamOne = new TeamOne("policyBazar",
                12,
                "rahul",
                "java",
                "jfs");

        String[] techStack = teamOne.showTechStack();
        teamOne.getDetails();
        for (String tech : techStack) {
            System.out.println(tech);
        }
        TeamTwo teamTwo
                = new TeamTwo("pbz",
                12,
                "banking",
                "rahul",
                new String[]{"Junit", "Maven", "Git", "Docker"});

        teamTwo.showSupportTools();
    }
}