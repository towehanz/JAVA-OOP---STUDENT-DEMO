/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class GraduateStudent extends Student {
     public static final double tuition = 25000;

     public GraduateStudent(int idNumber, String fullName){
          super(idNumber,fullName);
     }
     
     
    @Override
    public  void setTuition(){
        annualTuition = tuition;
    }
    public double getannualTuition(){
    return tuition;
    }
    
    
}
