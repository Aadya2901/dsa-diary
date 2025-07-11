public class PracticeQuestion_18_3 {

}

// //
// // Shape.java
// public class Shape {
// protected void display() {
// System.out.println("Display-base");
// }
// }
// // Circle.java
// public class Circle extends Shape { <
// < access - modifier > void display() {
// System.out.println("Display-derived");
// }
// }

// The parent method is protected, so the overriding method can be:
// protected ✅
// public ✅
// but not private ❌
// and not default/package-private ❌ (i.e., no modifier)