# Lesson 2: Variables, Types & Operators (~20 min)

## 🎯 Goal
Understand Java's type system vs JavaScript's. Use ScannerPrac for input. Master the modulus operator.

---

## 1. JS Reminder (2 min)
In JS, variables are **dynamically typed** — a variable can hold anything:
```javascript
let x = 5;       // number
x = "hello";     // now a string — JS doesn't care
```
Java will **not** let you do this. Every variable declares its type **once**.

---

## 2. JS vs Java: Variables & Types (5 min)

> Open both files side-by-side: `js-compare/variables.js` and `java-code/Variables.java`

| JS Type | Java Type | Notes |
|---|---|---|
| `number` | `int` | Whole numbers only |
| `number` | `double` | Decimals |
| `string` | `String` | Capital S! It's a class |
| `boolean` | `boolean` | Same |
| N/A | `char` | Single character: `'A'` |

**Operators are the same:** `+`, `-`, `*`, `/`, `%`, `++`, `--`, `+=`

**Key difference:** No `===` in Java. Use `==` for primitives, `.equals()` for objects (Strings!).

---

## 3. ScannerPrac — Getting User Input (3 min)

> Open `java-code/ScannerDemo.java`

In JS (browser): `prompt("Enter name")`
In JS (Node): `readline`
In Java: `ScannerPrac`

```java
ScannerPrac sc = new ScannerPrac(System.in);
int num = sc.nextInt();
String name = sc.nextLine();
double gpa = sc.nextDouble();
```

---

## 4. Live Exercise (8 min)

> Open `java-code/Exercise.java` — fill in together

Read two numbers → print sum, difference, product, quotient, and **remainder (%)**.
The modulus operator is critical for the SBA!

---

## 5. GLAB/PA Handoff (2 min)
- ✅ **GLAB 303.2.1** — Operators. You just practiced these.
- ✅ **GLAB 303.2.2** — Type Casting. Like JS coercion but explicit: `(int) 3.14` → `3`
- ✅ **PA 303.2.1** — Variables practice
- ✅ **PA 303.2.2** — ScannerPrac practice
- ✅ **PA 303.2.3** — Operators & numbers
- ✅ **PA 303.2.4** — Core Java practice

---

## Key Takeaways
```
JS:    let age = 25;              // type inferred, can change
Java:  int age = 25;              // type declared, locked in
Java:  double price = 9.99;       // decimals need double
Java:  String name = "Alice";     // capital S, use .equals() to compare
```
