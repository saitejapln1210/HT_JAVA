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

# core java package 7
- For this package you can create extra classes and if required create sub package inside this package for cleaner understanding
- Explain about inheritance in java with a example
- Explain all possible usage of super i.e. at method, field, constructor in inheritance
- Explain about types of inheritance in java with examples
- Explain rules in inheritance
- Explain about overloading in inheritance with examples
- Explain about overriding in inheritance
- Rule of method overriding - method signature , covariant return types, parent method as final , child method final, scope of modifiers in overriding, scope of modifier in overloading, static method related i.e. method hiding not overriding ? also explain why ?, overriding for var-arg methods, is overriding applicable for variables ? if no why ? 
- Is cyclic inheritance possible in Java
- Edge and interview specific scenarios in inheritance and super keyword
- How is inheritance linked with tight coupling ? when to use inheritance ?


# core java 8
- Explain about exceptional handling in java, for this package you can create another classes apart from demo and main
- Explain about throwable, exception and error. Difference between error and exception
- Explain some examples that comes under error and explain some examples that comes exception
- Explain in detail about checked  and unchecked exceptions
- Provide some examples what comes under checked and unchecked in exceptional handling hierarchy
- Explain about try, catch and finally and its scenarios like can we have try and finally without catch, can we have try , catch without finally etc 
- Explain about throw and throws in detail and provide an example for it. 
- Explain in detail and scenarios around partially checked exceptions and fully checked exceptions. Cover these with proper examples and explanation
- Rules while writing try catch finally from interview perspective
- Explain and provide examples regarding try with resources and with multiple resources and Auto closable mechanism in it and what is it, explain in detail
- Explain and provide examples multiple catch blocks and multi catch blocks and scenarios around it like relationships between exceptions in multi catch block
- Explain the difference between final, finally and finalize

# core java 9
- Explain about Object class
- Will each objects extends object class ? is it implicit ?
- Explain the things that is present in the Object class ? explain them clearly 
- Explain in detail about Hashcode and equals and its internal and about its contract 
- Rules and scenarios related to Hashcode and equals with examples 
- Hashcode and equals for different objects and datatypes with example
- Interview specific scenarios related to Object class and Hashcode and equals

# core java 10
- Explain in detail about wrapper class and provide some examples
- boxing and unboxing in wrapper classes
- Explain about Strings in java, how objects are created for string, string methods in java
- Explain about immutability in java and consider example of string
- Interview questions related to string in java along with edge case scenarios and important concepts about Strings (like string pool)
- Interview questions related to Wrapper classes

# Core java 11
- Explain and implement below topics of generics and can create simple and understanding classes if required apart from demo and main
- Generics provide compile-time type safety, eliminate casting, support reusable code using type parameters, differ from raw types (no checks), and use diamond operator (<>) for type inference while runtime uses type erasure.
- Generic classes use type parameters (<T>) to create reusable types, support multiple parameters (<K,V>), follow conventions (T,E,K,V), are instantiated with concrete types (Box<String>), and can include generic constructors.
- Generic methods declare their own type parameter (<T>) before return type, can be static, support type inference, and are independent of whether the class itself is generic.
- Type parameters define placeholders (<T>, <T,U,V>), can be bounded using extends, and support recursive bounds like <T extends Comparable<T>> for type-safe comparisons.
- Bounded generics restrict types using upper bounds (<T extends Class>), enforce inheritance constraints, and support multiple bounds (<T extends A & B>) combining class and interfaces.
- Wildcards represent unknown types where unbounded (List<?>) is generic read-only, upper bounded (<? extends T>) allows safe reading, and lower bounded (<? super T>) allows writing.
- PECS (Producer Extends, Consumer Super) means use <? extends T> for reading data and <? super T> for writing data to ensure type safety.
- Type erasure removes generic type information at runtime, converts generics to raw types, ensures backward compatibility, and introduces bridge methods for polymorphism.
- Generics do not support primitives, cannot instantiate type parameters (new T()), disallow static type parameters, forbid generic arrays, and restrict instanceof with parameterized types.
- Arrays are covariant while generics are invariant, mixing both leads to runtime issues, and can cause heap pollution due to type safety violations.
- Generics are invariant (List<Integer> ≠ List<Number>), require wildcards for flexibility, and follow strict subtyping rules based on exact types or bounds.
- Generic interfaces define contracts with type parameters (e.g., Repository<T>) and can be implemented with fixed types or remain generic.
- Generic constructors declare their own type parameters independent of class generics and allow flexible object initialization.
- Java does not support generic exception classes and does not allow catching exceptions using type parameters due to type erasure.
- Bridge methods are compiler-generated during type erasure to preserve method overriding and ensure runtime polymorphism.
- Type inference allows the compiler to automatically determine types using diamond operator (<>) and improved significantly in Java 8 with lambdas.
- Generic patterns include factory methods, singleton patterns, and helper utilities that promote reusable and type-safe designs.
- Collections use generics (List<T>, Map<K,V>) for type safety, Comparable<T> for natural ordering, and Comparator<T> for custom sorting.