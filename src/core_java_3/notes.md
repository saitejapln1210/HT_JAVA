# Core Java Package 3 Nodes

- Goal: understand where Java stores variables, methods, and objects during program execution.

## Big Picture

- Java memory is mainly discussed using these runtime areas:
  - method area
  - stack memory
  - heap memory
  - pc register
  - native method stack
- For core Java basics, the most important areas are method area, stack, and heap.

## Method Area

- Method area stores class-level metadata.
- It commonly includes:
  - class structure information
  - method information
  - static variables
  - runtime constant pool
- This memory is shared across objects of the same class.
- Example idea:
  - if a class has a static variable `count`, that static variable is stored once at class level.

## Stack Memory

- Stack memory stores method call frames.
- Every thread gets its own stack.
- Each method call creates one stack frame.
- A stack frame usually contains:
  - local variables
  - method parameters
  - partial results
  - reference variables pointing to heap objects
- When the method finishes, that frame is removed automatically.

## Heap Memory

- Heap memory stores objects and instance data.
- Objects created using `new` are stored in the heap.
- Instance variables belong to the object, so they are stored inside heap objects.
- Heap memory is shared and managed by the garbage collector.

## Where Different Things Are Stored

- Local primitive variables:
  - stored in the current method stack frame
- Local reference variables:
  - reference itself is in stack
  - actual object is in heap
- Instance variables:
  - stored inside the object in heap
- Static variables:
  - stored in method area
- Method definitions:
  - class metadata stored in method area
- Objects:
  - stored in heap

## Simple Example Mapping

```java
class Student {
    static String institute = "HT Java";
    int id = 101;

    void learn() {
        int hours = 2;
        Student helper = new Student();
    }
}
```

- `institute` is static, so it is stored in method area.
- `id` is an instance variable, so it is stored in each `Student` object in heap.
- `hours` is a local variable, so it is stored in stack.
- `helper` reference is stored in stack.
- object created by `new Student()` is stored in heap.
- `learn()` method metadata belongs to class information in method area.

## Method Execution Flow

- JVM loads class metadata into method area.
- When a method is called, a new stack frame is created.
- If the method creates an object, that object goes to heap.
- Stack frame may contain a reference pointing to that heap object.
- When method execution ends, the local frame is removed from stack.
- If no references point to an object, it becomes eligible for garbage collection.

## Key Interview Points

- Stack is per thread, heap is shared.
- Local variables live in stack frames.
- Objects live in heap.
- Static members belong to the class, not to objects.
- Java methods are part of class metadata, not stored inside each object.
- Reference variables are not the object itself; they only store the address-like link to the object.
