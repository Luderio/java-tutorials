# Exploring OOP in Java: Classes, Objects, Inheritance, and Core Principles
## Design a basic employee management system in Java using object-oriented principles.

### You need to:

- Create a base class **Employee** with:

  - Private fields: **name (String)**, **salary (double)**
  - A constructor to initialize these fields
  - Public getter methods
  - A method **getDetails()** that returns:
    ```
    Name: {name}, Salary: {salary}
    ```

- Create a subclass **Manager** that:
  - Has an additional private field: **department (String)**
  - Uses **super()** to call the parent constructor
  - Overrides **getDetails()** to include the department:
    ```
    Name: {name}, Salary: {salary}, Department: {department}
    ```

- In the **main()** method:
  - Create one **Employee** object and one **Manager** object
  - Store both in variables of type **Employee**
  - Print their details using the **getDetails()** method

This will demonstrate how inheritance and polymorphism work in Java.

### Instructions:

- Define class **Employee** and subclass **Manager**.
- Keep fields _**private**_ and use a **constructor** to set values.
- Override **getDetails()** in the subclass to extend functionality.
- Use _**super()**_ and _**this**_ keywords appropriately.
- Print output using **System.out.println()** and match formatting.

### Expected Output:
```
Name:  Alice,  Salary:  50000.0
```