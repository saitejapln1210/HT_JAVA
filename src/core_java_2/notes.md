# Core Java Package 2 Notes

- Goal: understand method signature, method overloading, and compile-time method resolution rules.

## Method Signature

- Method signature means:
  - method name
  - parameter list
- Return type is not part of the method signature.
- Example:

```java
void add(int a, int b) {}
void add(int a, int b, int c) {}
```

- These methods are overloaded because parameter lists are different.

## Method Overloading

- Method overloading means same method name with different parameters.
- It is compile-time polymorphism.
- Compiler resolves which method to call by checking the reference type and arguments available at compile time.

## Rule 1 - Operator Promotion

- If exact match is not found, Java promotes the argument.
- Promotion order:
  - `byte -> short -> int -> long -> float -> double`
  - `char -> int -> long -> float -> double`
- Example:

```java
void show(long value) {}

byte b = 10;
show(b); // byte promoted to long
```

## Rule 2a - Exact Match Wins

- When an exact overloaded method exists, compiler picks that method first.
- Example:

```java
void print(Object value) {}
void print(String value) {}

String name = "Java";
print(name); // String overload selected
```

## Rule 2b - Child Type Gets Priority

- If multiple methods match and there is a parent-child relationship, child type overload gets priority.
- `String` is a child of `Object`.
- Example using `null`:

```java
void print(Object value1, Object value2) {}
void print(Object value1, String value2) {}

print(null, null); // Object, String method wins because String is child
```

## Rule 3 - Var-Args Has Least Priority

- Var-args is considered only when no better fixed-argument overload matches.
- Example:

```java
void show(int value) {}
void show(int... values) {}

show(5);       // exact single int overload
show(5, 6, 7); // var-args overload
```

## Rule 4 - Parent Reference Is Considered

- In overloading, compiler uses the reference type, not the runtime object.
- Example:

```java
class Animal {}
class Dog extends Animal {}

void choose(Animal animal) {}
void choose(Dog dog) {}

Animal pet = new Dog();
choose(pet); // choose(Animal)
```

- Even though object is `Dog`, compiler sees reference `Animal`.

## Pass By Value And Reference Behavior In Java

- Java is always pass by value.
- For primitive types, the method gets a copy of the primitive value.
- For objects, the method gets a copy of the reference, not the original variable itself.
- Because both copied references can point to the same object, object state can be changed inside the method.
- But if the parameter reference is reassigned inside the method, the caller's reference does not change.
- Example:

```java
void changeNumber(int value) {
    value = 100;
}

void changeMarks(ScoreCard card) {
    card.marks = 100;
}

void reassignCard(ScoreCard card) {
    card = new ScoreCard(200);
}
```

- `changeNumber()` does not update the caller variable.
- `changeMarks()` updates the same object, so caller sees changed state.
- `reassignCard()` only changes the local copied reference inside the method.
- So Java does not support true pass by reference for method arguments.

## Resolution Flow

- Compiler reads the method name and argument list.
- Compiler first checks for an exact parameter match.
- If no exact match exists, compiler checks promotion rules.
- If multiple matches exist, the more specific child type gets priority.
- Var-args is considered only when fixed-argument methods are not a better match.
