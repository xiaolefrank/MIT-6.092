# Abstract-class and interface in Java

## Similar

1. They have to implement all methods that define in themselves.
2. They can both have abstract-methods that don't need to provide implement-code in other class.

## Difference

1. `Abstract class`:Define both normal methods & abstract methods.Its variables aren't static by default.
`Interface`:Define abstract methods and its variables are implicitly `static`,`public` and `final`.
2. `Abstract Class`: A class can only inherit from one abstract class (single inheritance).
`Interface`: A class can implement multiple interfaces (multiple inheritance), allowing for greater flexibility.
3. `Abstract Class`: Can have constructors, which can be used by subclasses.
`Interface`: Cannot have constructors, because interfaces are not meant to be instantiated directly.
4. `Abstract Class`: Used when you have a common base class that can provide some shared functionality for its subclasses but also wants to leave some methods unimplemented for subclasses to define.
`Interface`: Used to define a contract for what a class can do, without specifying how it should do it. It's a way to enforce certain behavior across unrelated classes.

## Example programme

> Abstract class

```Java
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void sound();

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void sound() {
        System.out.println(name + " barks.");
    }
}
```

> interface

```Java
interface Animal {
    void sound(); // no implementation

    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```
