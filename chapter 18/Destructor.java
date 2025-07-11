/*
 * Explain class diagram with an example.
 * 🔹 Introduction
 * A Class Diagram is a structural UML diagram that represents the classes,
 * attributes, methods, and relationships in an object-oriented system.
 * 
 * It is one of the most commonly used diagrams in software design because it
 * lays out the blueprint of the system's code structure.
 * 
 * ✅ Class diagrams help in designing and documenting the static structure of a
 * system.
 * 
 * 🔹 Purpose of Class Diagram
 * To model the structure of the system
 * 
 * To define classes, objects, and relationships
 * 
 * To assist in code generation and database design
 * 
 * To identify inheritance, composition, and association among classes
 * 
 * 🔹 Components of a Class
 * A class is represented as a rectangle with three compartments:
 * 
 * pgsql
 * Copy code
 * +--------------------+
 * | Class Name |
 * +--------------------+
 * | Attributes |
 * +--------------------+
 * | Methods |
 * +--------------------+
 * 🔹 Relationships in Class Diagram
 * Relationship Symbol Description
 * Association Straight line "uses-a" or "has-a" relationship
 * Aggregation Hollow diamond Whole-part relationship (weaker)
 * Composition Filled diamond Strong whole-part relationship
 * Inheritance Arrow with triangle "is-a" relationship (generalization)
 * Dependency Dashed arrow One class uses another temporarily
 * 
 * 🔹 Example: Library Management System – Class Diagram
 * Let’s define the following classes:
 * 
 * Book
 * 
 * Student
 * 
 * Librarian
 * 
 * Library (manages book issuing and returning)
 * 
 * 🔹 Class Diagram Sketch
 * pgsql
 * Copy code
 * +------------+ +-------------+
 * | Student |<>------| Book |
 * +------------+ +-------------+
 * | -name | | -title |
 * | -rollNo | | -author |
 * | | | -ISBN |
 * | +borrow() | | +isIssued() |
 * | +return() | +-------------+
 * 
 * ▲
 * |
 * +---------------+
 * | Librarian |
 * +---------------+
 * | -empID |
 * | +addBook() |
 * | +removeBook() |
 * +---------------+
 * 
 * ▲
 * |
 * +---------------+
 * | Library |
 * +---------------+
 * | -name |
 * | -location |
 * | +issueBook() |
 * | +returnBook() |
 * +---------------+
 * 🔹 Explanation:
 * Student borrows and returns books
 * 
 * Book class holds book details
 * 
 * Library class manages the process of issuing and returning books
 * 
 * Librarian extends Library (inheritance) and can add or remove books
 * 
 * 🔹 Advantages of Class Diagrams
 * Easy to visualize the system architecture
 * 
 * Helps in object-oriented modeling and coding
 * 
 * Aids in database design and schema generation
 * 
 * Clarifies relationships and interactions between entities
 * 
 * 🔹 Class Diagram vs Object Diagram
 * Aspect Class Diagram Object Diagram
 * Scope Blueprint of system structure Snapshot of object states
 * Usage Used in design phase Used in testing/debugging
 * Shows Classes, methods, relationships Objects and their data values
 * 
 * 🔹 Conclusion
 * A Class Diagram is fundamental to object-oriented design. It helps in
 * defining the classes, attributes, methods, and their relationships, which
 * forms the foundation of system development.
 * 
 * ✅ It serves as a communication tool between analysts, designers, and
 * developers, and directly maps to code in object-oriented languages.
 * 
 * ✅ Next:
 * Q8: What are activity diagrams? Explain with a neat diagram. Shall I
 * continue?
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Ask ChatGPT
 * 
 * 
 * 
 * Tools
 * 
 * 
 * 
 * ChatGPT can m
 */