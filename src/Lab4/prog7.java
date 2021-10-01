//WAP that describes a class person. It should have instance variables to record name, age and salary. Create a person object. Set and display its instance variables

package Lab4;

class person {
 String name;
 int age;
 long salary;

 public person(String name, int age, long salary) {
  this.name = name;
  this.age = age;
  this.salary = salary;
 }

 public String getName() {
  return name;
 }

 // method 2
 public int getAge() {
  return age;
 }

 // method 3
 public long getSalary() {
  return salary;
 }

 public String display() {
  return ("Name: " + this.getName() + ".\nAge: " + this.getAge() + "\nSalary: " + this.getSalary());
 }

  public static void main(String[] args) {
   person p = new person("Rahul", 21, 454590);
   person p1 = new person("Virat", 29, 1000000);
   person p2 = new person("Shubham", 25, 674500);
   System.out.println("\n"+p.display()+ "\n");
   System.out.println(p1.display()+ "\n");
   System.out.println(p2.display()+ "\n");
  }
 }