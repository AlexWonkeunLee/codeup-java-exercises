class Person {
    private String name;
    public Person(String newName){
        name = newName;
    }


    public String getName(){
        return name;
    }
    public void setName(String input) {
        name = input;
    }
    public void sayHello(){
        System.out.printf("Hello there, %s\n", name);
    }

    public static void main(String[] args){
        Person alex =  new Person("Alex");
        alex.setName("Alex Lee");
        System.out.println(alex.getName());
        alex.sayHello();

    }
}
