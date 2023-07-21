/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StudentDemo {
    public static void main(String[] args){
        UndergraduateStudent undergraduatestudent = new UndergraduateStudent(25252, "Bob De Jesus");
        GraduateStudent graduatestudent = new GraduateStudent(88899, "Hud Santos");
        StudentAtLarge studentatlarge = new StudentAtLarge(5858, "Kelly Oubs");
        
        System.out.println("The annual tuition is: "+undergraduatestudent.getannualTuition() +"\nUndergraduate Student with the ID number of: " +undergraduatestudent.getidNumber() + "\nThe name of the student: "+undergraduatestudent.getfullName());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("The annual tuition is: "+graduatestudent.getannualTuition() +"\nGraduate Student with the ID number of: " +graduatestudent.getidNumber() + "\nThe name of the student: "+graduatestudent.getfullName());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("The annual tuition is: "+studentatlarge.getannualTuition() +"\nStudent at Large with the ID number of: " +studentatlarge.getidNumber() + "\nThe name of the student: "+studentatlarge.getfullName());
        
    }
}
