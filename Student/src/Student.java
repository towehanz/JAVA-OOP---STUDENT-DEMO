/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
abstract class Student {
  public int idNumber;
  public String fullName; 
  protected double annualTuition;

public Student(int idNumber, String fullName){
      this.idNumber = idNumber;
      this.fullName = fullName;
}    

public void setidNumber(int idNumber){
     this.idNumber = idNumber;
}

public void setfullName (String fullName){
    this.fullName = fullName;
}

public int getidNumber (){
    return idNumber;
}

public String getfullName(){
    return fullName;
}

public double getannualTuition(){
    return annualTuition;
}

public abstract void setTuition();
    

    
}
