<!-- Badges -->
<p align="center">
  <img src="https://img.shields.io/badge/Java-SE-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/OOP-Inheritance_%7C_Interface_%7C_Polymorphism-007396?style=flat-square" alt="OOP" />
  <img src="https://img.shields.io/badge/CLI-Terminal_App-4EAA25?style=flat-square&logo=gnometerminal&logoColor=white" alt="CLI" />
  <img src="https://img.shields.io/badge/License-MIT-blue?style=flat-square" alt="License" />
</p>

<h1 align="center">Java OOP — Exercise 1: Shapes</h1>

<p align="center">
  A command-line Java application demonstrating core <strong>Object-Oriented Programming</strong> concepts — <strong>inheritance</strong>, <strong>interfaces</strong>, and <strong>polymorphism</strong> — through geometric shape rendering and area calculation.
</p>

---

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [OOP Concepts Demonstrated](#oop-concepts-demonstrated)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Sample Output](#sample-output)
- [Author](#author)
- [License](#license)

---

## Features

- **Shape rendering** — draws squares and triangles as asterisk patterns in the terminal
- **Area calculation** — computes area for each shape via a shared interface
- **Batch processing** — processes collections of shapes uniformly via polymorphism
- **Clean separation** — shape logic vs. rendering vs. calculation in distinct classes
- **Modular CLI** — `UIManager` and `Matematika` managers coordinate operations

---

## Tech Stack

| Technology | Purpose |
|---|---|
| **Java SE** | Core language — no external libraries |
| **OOP Design** | Inheritance, interfaces, polymorphism |

---

## Project Structure

```
java-oop-exercise1/
├── src/
│   └── nexsoft/
│       └── uicli/
│           ├── MainUI.java          # Entry point — runs the app
│           ├── UIManager.java       # Manages shape list and rendering
│           ├── Matematika.java      # Manages area calculations
│           ├── Soal.java            # Interface — calculate()
│           └── bidang/
│               ├── RuangBidang.java # Abstract base — draw()
│               ├── Kotak.java       # Square — extends RuangBidang, implements Soal
│               └── Segitiga.java    # Triangle — extends RuangBidang, implements Soal
├── LICENSE
└── README.md
```

---

## OOP Concepts Demonstrated

### Inheritance

Both `Kotak` (Square) and `Segitiga` (Triangle) extend the abstract base class `RuangBidang`, inheriting common properties like width, height, and the `draw()` contract.

```
RuangBidang (abstract)
 ├── Kotak      → draws a filled asterisk rectangle
 └── Segitiga   → draws a right-aligned asterisk triangle
```

### Interface & Polymorphism

`Kotak` and `Segitiga` both implement the `Soal` interface, which defines `calculate()`. The `Matematika` class processes any `Soal` implementation uniformly — it doesn't need to know whether it's calculating a square or triangle.

```java
public interface Soal {
    double calculate();
}
```

### Batch Processing

The `UIManager` stores shapes in a `List<RuangBidang>` and can `drawAll()` without knowing the concrete type of each shape. Similarly, `Matematika` calls `calculate()` on a `List<Soal>`.

---

## Prerequisites

| Requirement | Version |
|---|---|
| Java JDK | 8 or later |
| IDE (optional) | Eclipse, IntelliJ, or VS Code |

---

## Getting Started

### Clone & Compile

```bash
# Clone the repository
git clone https://github.com/ridhotadjudin/java-oop-exercise1.git
cd java-oop-exercise1

# Compile
javac -d bin src/nexsoft/uicli/MainUI.java src/nexsoft/uicli/*.java src/nexsoft/uicli/bidang/*.java

# Run
java -cp bin nexsoft.uicli.MainUI
```

### Open in Eclipse

1. **File → Import → Existing Projects into Workspace**
2. Select the `java-oop-exercise1` directory
3. Right-click `MainUI.java` → **Run As → Java Application**

---

## Sample Output

```
========== Drawing Shapes ==========
Kotak (4x4):
****
****
****
****

Segitiga (5):
*
**
***
****
*****

========== Area Calculation ==========
Luas Kotak: 16.0
Luas Segitiga: 12.5
```

---

## Author

**Ridho Tadjudin**

- 🌐 Website: [ridhotadjudin.id](https://ridhotadjudin.id)
- 💻 GitHub: [@ridhotadjudin](https://github.com/ridhotadjudin)

---

## 📄 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.

---

<p align="center">
  Built with ☕ and Java
</p>
