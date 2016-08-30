class Person
{
     String Name;
     String address;
 
     Person(String Name, String address)
     {
              Name = Name;
              address = address;
      }

      void Display()
      {
            System.out.println("Name : " + Name);
            System.out.println("address : " + address);
       }
} 

class Student extends Person
{
     int year;
     String program;
     double fee;
 
     Student(String name, String add, int year, String program, double fee)
     {
          super(name,add);
          year = year;
          program = program;
          fee = fee;         
      }
     void Display()
     {
            super.Display();

            System.out.println("year : " + year);
            System.out.println("program : " + program);
            System.out.println("fee : " + fee);
     }
}

class staff extends Person
{
      String school;
      double pay;
  
 
     staff(String name, String add, String school,double pay)
     {
          super(name,add);
          school = school;
          pay = pay;
                   
      }
     void Display()
     {
            super.Display();

            System.out.println("school : " + school);
            System.out.println("pay: " + pay);
            
     }
}

class InheritanceDemo
{
       public static void main(String args[])
       {
               Person pObj = new Person("Rayan","kakinada");
               Student sObj = new Student("Jacob","garividi",1,"btech",600.00);
               staff tObj = new staff("Daniel","bhimavaram","vishnu",7000.00);
               System.out.println("Person :");
               pObj.Display();
               System.out.println("");
               System.out.println("Student :");
               sObj.Display();
               System.out.println("");
               System.out.println("Teacher :");
               tObj.Display();
        }
}
 