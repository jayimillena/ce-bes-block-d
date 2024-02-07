public class VariableExercise {
  public static void main(String[] args)
  {
    String name = "Jay";
    int age = 50;
    double weight = 67.4;
    boolean isHuman = false;
    boolean isAI = true;
  
    System.out.println("Hi master"+ name);  
    System.out.println("You are "+ age + " years old!");  
    System.out.println("You are "+ weight +" kilogram");  
    
    if (isHuman == true)
    {
      System.out.println("You are a human indeed!, I'm glad to meet you.");  
    }
    else
    {
      System.out.println("You are must be an AI you must be special!");  
      
      if (isAI == true)
      {
        System.out.println("You must be an AI, why do you have emotion?");  
      }
    }
  }
}
