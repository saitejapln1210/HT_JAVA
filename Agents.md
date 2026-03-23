# Purpose 
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