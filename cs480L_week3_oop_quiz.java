class Person{
    private int age;
    private String name;
    public Person(int a, String n){
        this.age = a;
        this.name = n;
    }
    //GET & SET 
    public int getAge(){
        return this.age;
    }
    public void setAge(int a){
        this.age = a;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    //////////////////////////////////////
    public boolean isOld(){
        return (this.age > 16);
    }
    public boolean isJack(){
        return this.name.equals("Jack");
    }
    public String toString(){
        return ("\nName: " + this.name + "\nAge: " + this.age + "\nIs old?(+16): " + this.isOld() + "\nIs Jack?: " + this.isJack());
    }
    public boolean equals(Object obj){
        Person tmpPerson;
        if (!(obj instanceof Person)) return false;
        tmpPerson = (Person)obj;
        return (this.age == tmpPerson.age && this.name.equals(tmpPerson.name));
    }
}
public class cs480L_week3_oop_quiz {
    public static void main(String args[]) {
        Person jack = new Person(20, "Jack");
        System.out.println(jack.toString());
        Person mary = new Person(13, "Mary");
        System.out.println(mary.toString());
        System.out.println("\nAre the persons the same?: " + jack.equals(mary));
    }
}