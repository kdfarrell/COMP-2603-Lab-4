//LAB 4

public class StudentApp {
    
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Beatrix Kiddo");
        
        Student s2 = new Student();
        s2.setName("Dominic Toretto");
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        
        System.out.println("\nQuestion 5");
        Undergraduate u1 = new Undergraduate();
        u1.setName("Barry Allen");
        System.out.println(u1.toString());
        
        
        System.out.println("\nAnswer: The state came from the Student class.");
        
        u1.setMajor("Forensics");
        u1.setMinor("Atheltics");
        u1.setCredits(25);
        u1.calculateFees();
        
        Undergraduate u2 = new Undergraduate();
        u2.setName("John Rambo");
        u2.setMajor("Conflict Analysis");
        u2.setMinor("Internal Affairs");
        u2.setCredits(20);
        u2.calculateFees();
        
        Undergraduate u3 = new Undergraduate();
        u3.setName("Ellen Ripley");
        u3.setMajor("Astrobiology");
        u3.setMinor("Conflict Analysis");
        u3.setCredits(15);
        u3.calculateFees();
        
        System.out.println("\nQuestion 8:");
        System.out.print("Answer: Because the toString that was called");
        System.out.println("\ndoes not print the attributes unique to Undergraduate\n");
        
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println(u3.toString());
        
        System.out.println("Question 10:");
        System.out.print("Answer: We get undergraduate details. Yes it did print properly.");
        System.out.println("\nIt differs becuase the u1 objs have pecific attributes for");
        System.out.println("there Subclass\n");
        
        // Postgraduate Objects
        
        Postgraduate p1 = new Postgraduate("John McClain", "Prof. Asp Pirin", "How to Die Hard");
        System.out.println(p1.toString());   
        
        Postgraduate p2 = new Postgraduate("Brain Mills", "Dr. No Kia", "Mobile Usage Patterns in Hostage Situations");
        p2.setStatus("Part Time");
        p2.calcuateFees();
        System.out.println(p2.toString());
        
        
     }
}
