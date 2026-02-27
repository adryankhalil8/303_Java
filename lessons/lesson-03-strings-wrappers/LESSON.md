# Lesson 3: Strings & Wrapper Classes (~15 min)

## 🎯 Goal
Translate JS string knowledge to Java. Understand wrapper classes.

---

## 1. JS Reminder (2 min)
Strings in JS and Java are both **immutable**. Most methods are the same — just slightly different names.

---

## 2. JS vs Java: Strings (5 min)

> Open both files side-by-side

| JS | Java | Notes |
|---|---|---|
| `s.length` | `s.length()` | Property vs method! |
| `s.toUpperCase()` | `s.toUpperCase()` | Same |
| `s.substring(0,3)` | `s.substring(0,3)` | Same |
| `s.indexOf("x")` | `s.indexOf("x")` | Same |
| `s.includes("x")` | `s.contains("x")` | Different name |
| `s.split(",")` | `s.split(",")` | Same |
| `s.trim()` | `s.trim()` | Same |
| `` `Hello ${name}` `` | `"Hello " + name` | No template literals! |
| `s === t` | `s.equals(t)` | NEVER use == for Strings |

---

## 3. Wrapper Classes (3 min)
JS doesn't need these. Java does because generics only work with objects, not primitives.

| Primitive | Wrapper | When You Need It |
|---|---|---|
| `int` | `Integer` | Collections: `ArrayList<Integer>` |
| `double` | `Double` | Collections |
| `char` | `Character` | Checking character types |
| `boolean` | `Boolean` | Collections |

Key methods:
- `Integer.parseInt("42")` → `42` (like JS `parseInt("42")`)
- `String.valueOf(42)` → `"42"` (like JS `String(42)`)

---

## 4. Live Exercise (5 min)

> Open `java-code/Exercise.java`

Read a string, print it reversed, count the vowels.

---

## 5. GLAB/PA Handoff (2 min)
- ✅ **GLAB 303.3.1** — String methods. Same methods, Java syntax.
- ✅ **GLAB 303.3.2** — Reading string from console. You know ScannerPrac.
- ✅ **PA 303.3.1** — String practice.
