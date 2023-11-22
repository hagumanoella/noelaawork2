class Check{

public static void main(String args[]){

Cat c=new Cat();

c.meow();

c.eat();

}
}
class Pets {

void eat() {
    System.out.println("eat");
}
}

class Dog extends Pets{

void bark(){
System.out.println("bark\n");
}
}

class Cat extends Pets{

void meow(){
    System.out.println("meow\n");
}
}

