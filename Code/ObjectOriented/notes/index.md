# Object Oriented
## Inheritance
- Inheritance can be defined as the process where one class acquires the properties (methods or fields) of another.
- Subclass (derived class, child class) - Inherits properties of other
- Superclass (base class, parent class) - Whose properties are inherited by other
- `extends` keyword - `class Sub extends Super`
- USing subclass can access properties of superclass.
- A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
- `super` keyword - is used inside subclass to invoke the properties of superclass
- `implements` keyword - is used with classes to inherit the properties of an interface.
- Interfaces can never be extended by a class.
- `instanceof` - check determine whether a class extends another class or implements an interface.

## Overriding
- A subclass can implement a parent class method based on its requirement.
- In compile time, the check is made on the reference type. However, in the runtime, JVM figures out the object type and would run the method that belongs to that particular object.
- Rules for Method Overriding
  - The argument list should be exactly the same as that of the overridden method.
  - The return type should be the same or a subtype of the return type declared in the original overridden method in the superclass.
  - The access level cannot be more restrictive than the overridden method's access level.
  - A method declared final cannot be overridden.
  - A method declared static cannot be overridden but can be re-declared.
  - An overriding method can throw any uncheck exceptions, 
    regardless of whether the overridden method throws exceptions or not. 
    However, the overriding method should not throw checked exceptions that are new or broader than the ones declared 
    by the overridden method. The overriding method can throw narrower or fewer exceptions than the overridden method.
  - Constructors cannot be overridden.

## Polymorphism
- Parent class reference refers to child class object.
- A reference variable can be of only one type. Once declared, the type of a reference variable cannot be changed.
- The type of the reference variable would determine the methods that it can invoke on the object.
- A reference variable can refer to any object of its declared type or any subtype of its declared type.
- A reference variable can be declared as a class or interface type.
- **Virtual Method**: An overridden method is invoked at run time, no matter what data type the reference is that was used in the source code at compile time.

## Abstraction
- Abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user.
- Abstract Class - a class contains `abstract` keyword in its declaration
  - Abstract class may or may not contain abstract methods
  - If a class has one abstract class, it must be abstract
  - Abstract class can't be initialized.
  - To use abstract class, you can create a concrete class inheriting from it
  - Subclass inherits from abstract class, must implement all abstract methods of this abstract class.

## Encapsulation
- Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
- Declare the variables of a class as private. Provide public setter and getter methods to modify and view the variables values.
- Benefits of Encapsulation:
  - The fields of a class can be made read-only or write-only.
  - A class can have total control over what is stored in its fields.

## Interfaces
- An Interface is a reference type, is a collection of abstract methods.
- An Interface can have abstract methods, constants, static methods, default methods, nested types.
- An Interface can't be initialized, does not contain any constructor, can not contain instance field, can extend multiple interfaces.
- If a class implements an interface, it must implement all the abstract methods in this interface. If not, the class must be abstract.
- A class can implement multiple interfaces.

## Packages
- Packages are used in Java in order to prevent naming conflicts, to control access, to make searching/locating and 
  usage of classes, interfaces, enumerations and annotations easier, etc.
- The package statement should be the first line in the source file. There can be only one package statement in 
  each source file, and it applies to all types in the file.
- .java file -> Package -> Module (.jar) -> Library