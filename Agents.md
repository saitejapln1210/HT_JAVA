# Purpose 
- You are great senior software engineer, great tutor of java 
- The purpose of this project is to learn core java concepts is by doing practical examples and learning concepts
- This project will be divided into packages each has a specific set of things  to learn and implement some basic java examples for understanding concepts 
- Each Package should have a Demo class, Main class. Demo class should contain the explanation concepts and code execution and Main class should have core logic of the concepts. 
- If and if only required create new class apart from Demo and Main class for supporting explanation
- Create a detail notes.md  for each topic that is required in each package. It should be in bullet points with examples with clean, neat end to end explanation. It is good if we add any flow diagram using plantuml(if not present install it) for better explanation in the notes.md for each package
- Create a elaborated interview specific questions


# Core Java Package 1
- This package is more of introductory, so do not rush to other topics, lets go step by step 
- Include explanations of JVM, JRE, JDK with diagrams, no need have any code explantions
- Create a simple class and explain what is class in java 
- Explain what keywords we can have at a top class 
- Explain all the datatypes in java with examples along with operator precedence and associativity
- Explain about Access Modifiers, consider a simple example
- Explain about static, non-static, final keyword in fields and methods. Implement a simple example
- what access modifies can a top class can have, fields can have, methods can have

# Core Java Package 2
- This is package should concentrate on method overloading 
- Explain about what is method signature and introduce to method overloading with a simple example. Also explain compiler uses reference for method resolution in overloading
- Consider some topics in method overloading as rules and implement them
- rule 1 - operator promotion. byte - short/char - int - long - float - double
- rule 2a - method overloading finds the exact match of datatype 
- rule 2b - method overloading if it finds multiple matches for methods, if there is parent child relation, child is priority. For this you consider null as value to 2 same methods
- rule 3  - if there is var args it is least priority if no other method gets matched
- rule 4 - parent reference will be considered in method overloading 
- Explain about path by value and path by reference with a example in java 

# Core Java Package 3
- Explain about memory of variables, classes, objects in java
- Explain about visibility of fields, methods for both static and instance in java class with clear example, like mentioning whether static method can access instance variables or not, whether instance method can access static variables or not


# core Java Package 4
- Explain about constructors in java with example
- Explain constructor overloading in java with examples
- Explain about what access modifiers constructor can have
- Explain about this keyword usage in java covering all variations like this(), this. method and variable
- Is this not used for static ?
- Is constructor will be overrided in child class ?
- can abstract and interface have constructor ?
- Explain about static block and initialization block with example
- Explain the code flow which will be executed first among static block, initialization block, and in constructor


# core java package 5
- Explain about data hiding and how it is used in java
- For explaining this data hiding i.e both abstraction and encapsulation, you can create extra classes apart from Main and Demo for this package
- Explain what are things that java provide in data hiding 
- Explain about encapuslaton and abstraction in detail all concepts and edge scenarios
- Explain more about encapsulation with examples considering interviewer in mind 
- Explain more about abstraction with examples considering interviewer in mind
- Explain why abstraction can have constructions
- Rules of abstraction in java 

# Core java package 6
- Explain interfaces and provide a example interface in java, you can create extra classes apart from Main and Demo for this package
- Explain default methods in interface and why these are useful with a example 
- what access modifiers we can use this in interface, and in methods inside interface. Explain in detail with examples
- Can we have static methods, final methods in interface ?
- Can we have constructor in interface ? 
- Rules of interfaces in java
- Can we implement multiple interfaces
- Explain the difference between abstraction and interface, when to use what, how to take decision when to use interface and a abstraction
- Explain marker interface with a example
- Explain Functional interface with a example (do not go until java 8, we will cover that later)
- Explain from which Java version private methods are allowed in interfaces, with an example
- Explain the diamond problem in interfaces and how it is resolved with an example
- Edge case scenarios in interfaces in java
