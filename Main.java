import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

class Main {
  static ArrayList<Person> people;
  static String filename;
  static FileReader myFile;
  
  public static void main(String[] args) {
    people = new ArrayList<Person>();
    filename = "data.txt";
    String name = "", age = "", color = "";
    Person p1 = new Person("Tommy", 21, "Green");
    Person p2 = new Person("A", 87, "pink");
    Person p3 = new Person("B", 13, "yellow");
    Person p4 = new Person("C", 55, "black");
    Person p5 = new Person("D", 4, "green");
    people.add(p1);
    people.add(p2);
    people.add(p3);
    people.add(p4);
    people.add(p5);
    


    try {
      FileWriter myFile; 
      myFile = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(myFile);

      for(int i = 0; i < people.size(); i++){
        output.write(people.get(i).getName());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();
        output.flush();
      }
      
      output.close();  
      }
      catch(IOException exception){
        System.out.println("An error occured:" + exception);
      }  
          
    try {
      myFile = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(myFile);
      while(reader.ready()){
        name = reader.readLine();
        age = reader.readLine();
        color = reader.readLine();
        System.out.printf("%-10s %-10s %-10s %n", name, age, color );
      }
      reader.close();
    }
      catch(IOException exception){
      System.out.println("An error occured:" + exception);

    }
    
    
    }  

  } 