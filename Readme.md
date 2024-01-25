# Exceptions Handling
- It is a mechanism that allows you to handle and manage errors or exceptional conditions that can occur during the execution of a program.

## Exception Handling Keywords
- *try*:  Specify a block where we should place an exception code.

- *catch*: Handle the exception.Can have multiple catch blocks to handle different types of exceptions. They are evaluated in order, and the first matching catch block is executed.

- *finally*: The code within the finally block is executed regardless of whether an exception occurred or not. It is typically used for cleanup tasks.
- *throw*: used to throw an exception.

- *throws*: Is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.

### Types of Exceptions
#### **Checked exceptions:**
- It is a subclass that directly inherit the Throwable class 
- Exceptions that must be explicitly handled or declared in the method signature using the throws keyword.

- **checked Exception Types**
- IOException: The IOException class and its subclasses represent exceptions related to input/output operations.Examples of IOException subclasses include FileNotFoundException and SocketException.

- ClassNotFoundException: The ClassNotFoundException is thrown when an attempt is made to load a class dynamically using reflection, but the specified class is not found. This exception is commonly encountered when working with class loaders or when loading external modules or plugins.

- SQLException: The SQLException class and its subclasses are used to handle exceptions related to database access and SQL operations. These exceptions are thrown when there is an error in executing SQL queries or interacting with a database. Examples of SQLException subclasses include SQLSyntaxErrorException and SQLIntegrityConstraintViolationException.

- ParseException: The ParseException and its subclasses are used to handle exceptions related to parsing operations, such as parsing dates or numbers from strings. These exceptions are thrown when there is an error in parsing a string representation into a specific data type.

- etc

### **Unchecked Exception**
- Subclasses that inherit the RuntimeException

- Are exceptions that do not need to be explicitly handled or declared

- Unlike checked exceptions, they are not enforced by the compiler, which means that the calling code is not required to catch or declare these exceptions.

- Are typically caused by programming errors, such as logical mistakes or violations of the Java language rules.

- **Unchecked Exception Types**
- NullPointerException: This exception occurs when a null reference is encountered where an object is expected. It typically happens when you try to access or invoke a method on a null object.

- IllegalArgumentException: This exception is thrown when a method receives an illegal or inappropriate argument. It indicates that the caller has passed an invalid value or an argument that violates the method's contract.

- IllegalStateException: This exception signifies that the state of an object is not suitable for the requested operation. It is usually thrown when a method is invoked in a situation that violates its expected state.

- ArithmeticException: This exception is raised during arithmetic operations, such as division by zero or an operation that results in a numeric overflow or underflow.

- ArrayIndexOutOfBoundsException: This exception occurs when you attempt to access an array element with an invalid index. It is thrown if the index is negative, greater than or equal to the array length, or otherwise out of bounds.

- ClassCastException: This exception is thrown when an attempt is made to cast an object to a type that is not compatible with its actual type. It typically occurs when performing inappropriate type conversions.

- NumberFormatException: This exception is thrown when a method, such as Integer.parseInt(), is unable to parse a string into a numeric representation because the string does not have the expected format.

- UnsupportedOperationException: This exception is thrown when an operation is not supported or implemented by a particular class or method.

- ConcurrentModificationException: This exception occurs when a collection is modified concurrently while it is being iterated. It indicates that the collection's structure has been modified unexpectedly during iteration.

- OutOfMemoryError: This error is thrown when the Java Virtual Machine (JVM) is unable to allocate more memory for an object because the heap space is exhausted.

- StackOverflowError: This error occurs when the call stack, which is used to keep track of method invocations, exceeds its maximum limit. It commonly happens due to infinite recursion or excessive method nesting.