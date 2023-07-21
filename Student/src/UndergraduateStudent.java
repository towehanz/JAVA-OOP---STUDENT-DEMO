
public class UndergraduateStudent extends Student {
    public static final double tuition = 16000;
    
    public UndergraduateStudent(int idNumber, String fullName){
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
