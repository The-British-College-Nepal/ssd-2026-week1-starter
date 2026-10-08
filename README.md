# 💻 SSD Week 1 Lab: Object-Oriented Review & Setup
**Software Systems Development (CRN 12391) · Level 5**  
**The British College (Leeds Beckett University) · Sudan Pudasaini**

> 📘 **Day 2 Theory Notes & Lab Companion:**  
> For full lecture notes, constructor chaining rules, JVM vtable mechanics, Heron's formula derivation, and Component 2 formative MCQ practice, see [CLASS_2_NOTES_AND_LAB_GUIDE.md](CLASS_2_NOTES_AND_LAB_GUIDE.md).

---

## 🎯 Lab Objectives
1. Verify your local development environment (**JDK 21** and your preferred IDE).
2. Complete and push `SETUP.md` with your environment details and team preferences.
3. Review core Object-Oriented principles in Java:
   - **Encapsulation:** Private attributes with getters/setters and invariant validation.
   - **Inheritance:** Using `extends` and constructor chaining with `super()`.
   - **Abstraction:** Defining and implementing `abstract class` and `abstract` methods.
   - **Polymorphism:** Declaring collections of super-types (`List<Shape>`) and invoking polymorphic methods.
4. Run automated tests using JUnit 5 (`mvn test`).

---

## 📋 Exercises & Tasks

### Task 1: Inspect the Shape Hierarchy
Open `src/main/java/shapes/` in IntelliJ IDEA or your IDE.
- Inspect `Shape.java`: Notice how it is declared `abstract` and has an abstract `getArea()` and `getPerimeter()` method.
- Inspect `Square.java`: Extends `Shape`. Notice how `super(4)` is called to pass the side count to the superclass constructor.

### Task 2: Complete `Circle.java`
- In `Circle.java`, extend `Shape`.
- Pass `0` as the number of sides to `super(0)`.
- Store `radius` (type `double`) as a private field.
- Implement `getArea()`: returns $\pi \times r^2$ (`Math.PI * radius * radius`).
- Implement `getPerimeter()`: returns $2 \times \pi \times r$ (`2 * Math.PI * radius`).
- Add input validation: throw an `IllegalArgumentException` if `radius <= 0`.

### Task 3: Complete `Triangle.java`
- In `Triangle.java`, extend `Shape`.
- Pass `3` as the number of sides to `super(3)`.
- Store `sideA`, `sideB`, and `sideC` (all `double`) as private fields.
- Implement `getPerimeter()`: returns $a + b + c$.
- Implement `getArea()`: use Heron's formula:
  $$s = \frac{a + b + c}{2}$$
  $$\text{Area} = \sqrt{s(s - a)(s - b)(s - c)}$$
- Add triangle inequality validation: the sum of any two sides must be greater than the third side!

### Task 4: Run the JUnit 5 Tests
In terminal or your IDE:
```bash
mvn test
```
All tests in `src/test/java/shapes/ShapeTest.java` should pass with green checkmarks!

### Task 5: Commit and Push
```bash
git add .
git commit -m "Week 1: completed OO review and setup verification"
git push origin main
```
Verify that the GitHub Actions autograder runs on your repository and shows a green checkmark!
