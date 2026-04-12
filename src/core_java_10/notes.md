# Core Java Package 10 Notes

- Goal: understand wrapper classes, boxing/unboxing, strings, string immutability, string pool, and interview-focused edge scenarios.

## Wrapper Classes In Java

- Wrapper classes convert primitives into objects.
- Java wrapper classes:
  - `byte` -> `Byte`
  - `short` -> `Short`
  - `int` -> `Integer`
  - `long` -> `Long`
  - `float` -> `Float`
  - `double` -> `Double`
  - `char` -> `Character`
  - `boolean` -> `Boolean`
- Why wrappers are needed:
  - collections (`ArrayList<Integer>`) require objects, not primitives
  - generics work with reference types
  - utility methods are available (`parseInt`, `compare`, `valueOf`)
  - wrappers can hold `null` unlike primitives

## Boxing And Unboxing

- Boxing: converting primitive to wrapper object.
- Unboxing: converting wrapper object to primitive.
- Manual:

```java
Integer boxed = Integer.valueOf(10);
int unboxed = boxed.intValue();
```

- Automatic (autoboxing/unboxing):

```java
Integer boxed = 10;  // autoboxing
int unboxed = boxed; // unboxing
```

- Common pitfall:

```java
Integer score = null;
int value = score; // NullPointerException during unboxing
```

## Wrapper Utility Methods

- `Integer.parseInt("120")` -> returns primitive `int`
- `Integer.valueOf("120")` -> returns `Integer`
- `Integer.compare(a, b)` -> helps compare two primitive ints
- `Boolean.parseBoolean("true")` -> converts string to boolean

## String In Java

- `String` is a class in `java.lang`.
- String objects can be created in two common ways:

```java
String a = "java";              // string literal (string pool)
String b = new String("java");  // always creates new object in heap
```

- Important difference:
  - `==` compares references
  - `equals()` compares content

## Common String Methods

- `length()` -> size of string
- `charAt(index)` -> character at index
- `substring(begin, end)` -> part of string
- `toUpperCase()`, `toLowerCase()`
- `trim()` -> removes leading/trailing spaces
- `contains()`, `startsWith()`, `endsWith()`
- `indexOf()` -> index search
- `replace()` -> replace content
- `split(regex)` -> split into array

## String Immutability

- String is immutable in Java.
- Once a string object is created, its internal value cannot be changed.
- Any modification creates a new object.

```java
String s1 = "Core";
String s2 = s1.concat(" Java");
// s1 is still "Core"
// s2 is "Core Java"
```

- Why immutability is useful:
  - security (safe to share)
  - thread safety
  - string pool optimization
  - stable hash codes for map keys

## String Pool

- String literals are stored in String Constant Pool.
- If same literal appears again, JVM reuses existing pooled object.
- `intern()` can return pooled reference.

```java
String a = "java";
String b = "java";
String c = new String("java");

// a == b is true (same pooled object)
// a == c is false (different object)
// a == c.intern() is true
```

## Why `StringBuilder` For Frequent Modifications?

- Since `String` is immutable, repeated concatenations create many objects.
- `StringBuilder` is mutable and efficient for repeated changes.

```java
StringBuilder builder = new StringBuilder("Core");
builder.append(" Java");
```

## `StringBuilder` Vs `StringBuffer`

- Both are mutable string classes.
- Common behavior:
  - both support `append`, `insert`, `delete`, `reverse`
  - both avoid creating a new object on every update
- Key difference:
  - `StringBuffer` methods are synchronized -> thread-safe
  - `StringBuilder` methods are not synchronized -> faster in single-threaded code
- Selection rule:
  - single-threaded or local method usage -> prefer `StringBuilder`
  - shared mutable text across threads -> use `StringBuffer` (or external synchronization)

```java
StringBuilder builder = new StringBuilder("Java");
builder.append(" Builder");

StringBuffer buffer = new StringBuffer("Java");
buffer.append(" Buffer");
```

## Quick Revision Points

- Wrapper classes are object versions of primitives.
- Boxing/unboxing can happen automatically.
- Be careful with unboxing `null` (NPE risk).
- `String` is immutable.
- `==` checks reference, `equals()` checks content.
- String literals use pool for reuse.
- Use `StringBuilder` for repeated modifications.
- `StringBuilder` is faster; `StringBuffer` is synchronized and thread-safe.
- Use `equals()` for wrapper comparisons.
