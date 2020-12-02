class Person {
  private String name;
  private int age;
  private String color;

  public Person(String aName, int anAge, String aColor){
    this.name = aName;
    this.age = anAge;
    this.color = aColor;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getColor(){
    return color;
  }
  
}