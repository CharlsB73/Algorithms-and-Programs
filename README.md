# Algorithms and Programs (ITAM)
A comprehensive Java collection of fundamental algorithms and data structures developed as part of the Computer Science curriculum at ITAM (Instituto Tecnológico Autónomo de México). This repository showcases implementations of core programming concepts including data structures, memory management, array manipulation, and practical applications.

## 📚 Project Overview
This project contains practical implementations of essential computer science topics, demonstrating proficiency in:
- Object-oriented programming and class design
- Array and collection manipulation
- Memory management and data structure optimization
- Algorithm implementation and application
- Software architecture and modular design
- Unit testing and test-driven development

## 🗂️ Repository Structure
### **Arrays (`src/Arrays/`)**
Implementations of array handling techniques and utilities:
- Array manipulation algorithms
- Custom array handler classes (manejadores de arreglos)
- Operations for searching, sorting, and transforming array data

### **Classes (`src/GeneralClasses{i}/`)**
Object-oriented implementations and class hierarchies:
- Custom data structure classes
- Abstract base classes and interfaces
- Practical examples of inheritance and polymorphism

### **Applications (`src/apps{i}/`)**
Practical applications combining multiple concepts:
- Real-world use cases leveraging arrays, classes, and algorithms
- Integration of data structures in functional programs
- Main method implementations for demonstration

### **Tests (`test/`)**
Comprehensive JUnit test suite:
- 25 independent test classes with 200+ test methods
- 1:1 coverage ratio with all source classes
- Tests for constructors, getters, setters, operations, and edge cases
- Batch 1: 15 core classes | Batch 2: 10 advanced classes
- Full documentation: `TEST_SUMMARY.md`, `TEST_SUMMARY_BATCH2.md`, `COMPLETE_TEST_GUIDE.md`

### **Final Project**
Capstone project demonstrating integrated knowledge across all topics.

## 🛠️ Technologies
- **Language**: Java (JDK 8 or higher)
- **Testing**: JUnit 4.13.2 + Hamcrest
- **Build System**: Standard Java compilation with `javac`
- **IDE**: Eclipse, IntelliJ IDEA, NetBeans, or command-line

## 📦 How to Use
### Prerequisites
- Java Development Kit (JDK) 8+
- JUnit 4.13.2 and Hamcrest (for tests)
- A Java IDE or command-line compiler

### Compilation
```bash
# Compile all source files
javac -d bin src/**/*.java

# Compile tests (requires JUnit in classpath)
javac -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar -d bin test/*.java
```

### Running Applications
```bash
java -cp bin package.name.ClassName
```

### Running Tests
```bash
# Run all tests
java -cp bin:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore \
  AnimalTest ZooTest UniversityTest RestauranteTest ... (all 25 test classes)

# Run single test
java -cp bin:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore AnimalTest
```

### Project Setup in Eclipse
1. **File → New → Java Project** → Check "Create from existing source"
2. Browse to repository and click **Finish**
3. **Add JUnit Library**: Right-click project → **Build Path → Add Libraries → JUnit 4**
4. Organize source into `src/` and tests into `test/` folders
5. Right-click any test → **Run As → JUnit Test**

## 📖 Topics Covered
- **Data Structures**: Arrays, collections, custom implementations
- **Object-Oriented Design**: Classes, inheritance, polymorphism, encapsulation
- **Algorithms**: Searching, sorting, binary search, insertion sort
- **Testing**: Unit testing with JUnit, test design, edge case coverage
- **Memory Management**: Java's memory model, object references
- **Software Engineering**: Modular organization, maintainability, documentation

## 📝 Test Coverage Summary
| Category | Count | Examples |
|----------|-------|----------|
| Data Containers | 6 | Animal, Dish, Vehicle |
| Collections | 12 | Zoo, Hospital, Restaurant |
| Utilities | 3 | MAG, DebuggerContador |
| **Total** | **25** | **200+ test methods** |

## 📝 Notes
- Repository represents coursework from ITAM
- Code organized for clarity and educational purposes
- Each module is self-contained
- Tests validate all core functionality
- See `COMPLETE_TEST_GUIDE.md` for detailed testing instructions

## 🎓 Author
**Carlos Gerardo Castillo Campos**  
ITAM Computer Science Coursework

---
**Last Updated**: 2026  
**License**: Educational Use (ITAM)

---
## 🔗 Quick Links
- [ITAM](https://www.itam.mx)
