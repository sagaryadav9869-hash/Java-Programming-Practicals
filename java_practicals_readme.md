# Java-Programming-Practicals

## 📌 Repository Description
A comprehensive collection of foundational Java programming practicals and lab exercises covering Java syntax, primitive data types, operators, control flow, arrays, user input handling, and Object-Oriented Programming (OOP) principles.

## 📂 Complete List of Practicals

### 1. Hello World Program (`Demo.java`)
* **Objective:** Understand the basic structure of a Java program and print output to the console.
* **Key Concepts:** Class declaration, `main` method signature, `System.out.println()`.
* **Sample Output:**
  ```text
  Hello World
  ```

### 2. Variables & Basic Addition (`Student.java`)
* **Objective:** Practice declaring variables of different types and performing simple integer addition.
* **Key Concepts:** Variable declaration (`int`, `boolean`, `String`), assignment, arithmetic addition.
* **Sample Output:**
  ```text
  25
  ```

### 3. Java Data Types Demonstration (`Solution.java`)
* **Objective:** Declare, initialize, and print various primitive and reference data types in Java.
* **Key Concepts:** `int`, `float`, `double`, `char`, `boolean`, `String`, and string concatenation.
* **Sample Output:**
  ```text
  Integer value: 42
  Float value: 3.14
  Double value: 3.14159265359
  Character value: A
  Boolean value: true
  String value: Hello, World!
  ```

### 4. Basic Arithmetic Calculator (`Q2.java`)
* **Objective:** Perform fundamental arithmetic operations on two integer variables.
* **Key Concepts:** Arithmetic operators (`+`, `-`, `*`, `/`, `%`).
* **Sample Output:**
  ```text
  Sum: 15
  Difference: 5
  Product: 50
  Quotient: 2
  Remainder: 0
  ```

### 5. Average Calculator (`Q3.java`)
* **Objective:** Calculate the average of five numerical values.
* **Key Concepts:** Floating-point arithmetic (`double`), sum aggregation, division.
* **Sample Output:**
  ```text
  The average is: 30.0
  ```

### 6. Relational Operators Demonstration (`Q4.java`)
* **Objective:** Compare two integer values using Java's relational operators.
* **Key Concepts:** Relational operators (`==`, `!=`, `>`, `<`, `>=`, `<=`), boolean expressions.
* **Sample Output:**
  ```text
  a == b: false
  a != b: true
  a > b: false
  a < b: true
  a >= b: false
  a <= b: true
  ```

### 7. Logical Operators Demonstration (`Q5.java`)
* **Objective:** Evaluate boolean expressions using logical operators.
* **Key Concepts:** Logical AND (`&&`), Logical OR (`||`), Logical NOT (`!`).
* **Sample Output:**
  ```text
  condition1 && condition2: false
  condition1 || condition2: true
  !condition1: false
  !condition2: true
  ```

### 8. Even or Odd Checker (`Q6.java`)
* **Objective:** Determine whether a given integer is even or odd.
* **Key Concepts:** Conditional branching (`if-else`), modulus operator (`%`).
* **Sample Output:**
  ```text
  7 is odd.
  ```

### 9. Print Even Numbers from 1 to 100 (`Q7.java`)
* **Objective:** Iterate through a range of numbers and print all even numbers.
* **Key Concepts:** `for` loop, conditional filtering (`if`), modulus operator (`%`).
* **Sample Output:**
  ```text
  2
  4
  6
  ...
  100
  ```

### 10. Leap Year Checker (`Q8.java`)
* **Objective:** Accept a year from the user and determine whether it is a leap year.
* **Key Concepts:** User input via `java.util.Scanner`, complex boolean conditions (`&&`, `||`), resource management (`scanner.close()`).
* **Sample Output:**
  ```text
  Enter a year: 2024
  2024 is a leap year.
  ```

### 11. Prime Number Checker (`Q9.java`)
* **Objective:** Check whether numbers in a predefined array are prime using an optimized algorithm.
* **Key Concepts:** Static helper methods (`isPrime`), arrays, enhanced `for-each` loop, `$6k \pm 1$` primality optimization.
* **Sample Output:**
  ```text
  1 is not a prime number.
  2 is a prime number.
  3 is a prime number.
  ...
  19 is a prime number.
  20 is not a prime number.
  ```

### 12. Solar System Planets Array (`Q10.java`)
* **Objective:** Store and display the names of the planets in our solar system.
* **Key Concepts:** `String[]` array initialization and iteration using an enhanced `for-each` loop.
* **Sample Output:**
  ```text
  The planets in our solar system are:
  Mercury
  Venus
  Earth
  Mars
  Jupiter
  Saturn
  Uranus
  Neptune
  ```

### 13. Classroom Occupancy & Capacity System (`Demo2.java`)
* **Objective:** Model a real-world entity using a custom `Classroom` class to calculate room occupancy percentage.
* **Key Concepts:** Object-Oriented Programming (OOP), multiple classes in a file, object instantiation (`new`), instance fields, methods, explicit type casting (`double` to `float`).
* **Sample Output:**
  ```text
  Capacity: 67
  Occupancy: 100.0%
  ```

### 14. ATM Banking Simulation (`ATM.java`)
* **Objective:** Simulate basic ATM operations including balance inquiries, deposits, and withdrawals while enforcing a minimum balance rule.
* **Key Concepts:** Encapsulation (`private` fields), parameterized constructors, `if-else if-else` validation, state management.
* **Sample Output:**
  ```text
  Deposited: 10000.0
  Withdrew: 8000.0
  Final Balance: 7000.0
  ```

## 🛠️ Tools & Technologies Used
* **Language:** Java (JDK 11+)
* **Standard Libraries:** `java.lang`, `java.util.Scanner`
* **Compiler & Runtime:** `javac` (Java Compiler) & JVM (Java Virtual Machine)
* **IDE / Code Editors:** Visual Studio Code / IntelliJ IDEA / Eclipse
* **Version Control:** Git & GitHub

## 🚀 How to Compile and Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/Java-Programming-Practicals.git
   cd Java-Programming-Practicals
   ```

2. **Compile a Java source file (generates `.class` bytecode):**
   ```bash
   javac ATM.java
   ```

3. **Run the compiled program:**
   ```bash
   java ATM
   ```