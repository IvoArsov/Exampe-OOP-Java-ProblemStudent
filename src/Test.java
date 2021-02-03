import models.Student;

public class Test {
    public static void main(String[] args) {
       try{
           Student peter = new Student("Peter", 12, "petergmail.com", 5, "Henrih Ipsen");
           Student john = new Student("John", 15, 7, "Lui Pasteur");
           Student karina = new Student("Karina", 6, "Migel de Servantes");
           Student todor = new Student("Todor", "todor@gmail.com", 4, "'Peter Smithson");

           System.out.println(peter);
           System.out.println(john);
           System.out.println(karina);
           System.out.println(todor);
       } catch (IllegalArgumentException ex){
           System.out.println(ex.getMessage());
       }
    }
}
