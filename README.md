<div align="center">

```
   ██╗ █████╗ ██╗   ██╗ █████╗     ██████╗ ███████╗ █████╗
   ██║██╔══██╗██║   ██║██╔══██╗    ██╔══██╗██╔════╝██╔══██╗
   ██║███████║██║   ██║███████║    ██║  ██║███████╗███████║
██ ██║██╔══██║╚██╗ ██╔╝██╔══██║    ██║  ██║╚════██║██╔══██║
╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║    ██████╔╝███████║██║  ██║
 ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝    ╚═════╝ ╚══════╝╚═╝  ╚═╝
```

#  java-problem-solving

**Grinding DSA, one `.java` file at a time.**  
_Coding Blocks ki class + real problem solving + optimized solutions = this repo_

---

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![DSA](https://img.shields.io/badge/DSA-Practice-00ff87?style=for-the-badge)
![Coding Blocks](https://img.shields.io/badge/Coding%20Blocks-Class%20Notes-ff006e?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Actively%20Grinding-brightgreen?style=for-the-badge)
![LeetCode](https://img.shields.io/badge/LeetCode-Solving-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)

</div>

---

##  What is this repo?

> This is my personal **Java DSA practice repository** — where I push every problem I solve during my [Coding Blocks](https://codingblocks.com/) classes and beyond. Not just copy-paste — I write **clean, optimized, commented code** so I actually _understand_ what's happening.

```java
while (alive) {
    learnDSA();
    pushToGitHub();
    becomeUnstoppable();
}
```

---

---

## Repository layout

All sources live under **src/** so topics are easy to browse on GitHub and in your editor.

| Path | Contents |
| ---- | -------- |
| [src/basics/](src/basics/) | Loops, math, type casting, simple I/O, starter Main demos |
| [src/arrays-1d/](src/arrays-1d/) | 1D arrays: sort, rotate, reverse, search-style drills |
| [src/arrays-2d/](src/arrays-2d/) | Matrices: transpose, spiral, wave, merging |
| [src/patterns/](src/patterns/) | Pattern printing (nested loops) |
| [src/strings/](src/strings/) | String and character exercises |
| [src/searching/](src/searching/) | Binary search and related |
| [src/functions/](src/functions/) | Methods: factorial, sums, printing |
| [src/practice/](src/practice/) | Extra practice / experiments |
| [src/assignments/](src/assignments/) | Course assignments (ssignment-2 through ssignment-4) |
| [src/list/](src/list/) | Placeholder for linked-list exercises |
| [docs/](docs/) | Notes (for example datatype cheatsheets) |

These files use the **default package** (no package line). The public class name must match the file name (for example EvenNumber.java contains public class EvenNumber).
## 🚀 Topics Covered

| Category        | Topics                                  |
| --------------- | --------------------------------------- |
| **Basics**      | Variables, TypeCasting, Loops, Patterns |
| **Math**        | GCD, Prime, Digit Sum, SI, Reverse      |
| **Arrays**      | Sort, Rotate, Transpose, Spiral, Pivot  |
| **Algorithms**  | Selection Sort, Optimized Transpose     |
| **Coming Soon** | LinkedList, Recursion, Trees, DP        |

---

##  Why This Repo Exists

-  **Problem solving** — not just theory, actual working programs
-  **Optimized solutions** — I try to push the most efficient version
-  **Interview prep** — building the base for placements

---

##  How to Run Any File

**Requirements:** JDK 8+ · terminal or any IDE (VS Code / IntelliJ / Eclipse)

**Option A — run from the folder that contains the source**

```bash
git clone https://github.com/grchetan/java-problem-solving.git
cd java-problem-solving

cd src/basics
javac FindMaxNumber.java
java FindMaxNumber
```

**Option B — compile from the repo root into an `out/` folder**

```bash
cd java-problem-solving
mkdir out
javac -d out src/basics/FindMaxNumber.java
java -cp out FindMaxNumber
```

Swap in any path under `src/` (for example `src/arrays-2d/spiralmatrix.java` then run `java -cp out spiralmatrix`).

---

## 📊 Progress Tracker

```
Basics          ████████████████████  Done ✅
Arrays          █████████████░░░░░░░  In Progress 🔄
Sorting         ████████░░░░░░░░░░░░  Started 🟡
Searching       ████░░░░░░░░░░░░░░░░  Early Stage 🟠
Recursion       ░░░░░░░░░░░░░░░░░░░░  Coming Soon ⏳
Linked Lists    ░░░░░░░░░░░░░░░░░░░░  Coming Soon ⏳
Trees & Graphs  ░░░░░░░░░░░░░░░░░░░░  Coming Soon ⏳
Dynamic Prog.   ░░░░░░░░░░░░░░░░░░░░  Coming Soon ⏳
```

---

## 🔥 Notable Solutions

### 🎯 Find Pivot Index — LeetCode #724

```java
// O(n) time | O(1) space
// Left sum == Right sum → pivot found
```

### 🌀 Spiral Matrix Traversal

```java
// Classic 2D array traversal
// Top → Right → Bottom → Left, shrink boundaries
```

### 🔄 Optimized Matrix Transpose

```java
// In-place transpose: swap matrix[i][j] ↔ matrix[j][i]
// O(n²) time | O(1) space
```

---

## 📌 Coding Blocks Journey

> Currently enrolled in **Coding Blocks** — learning DSA systematically.  
> Every class → new concept → new `.java` file → commit → push. That's the loop. 🔁

**Course Focus:**

- Core Java & OOPs
- Data Structures (Arrays, LinkedList, Stack, Queue, Trees)
- Algorithms (Sorting, Searching, Recursion, DP)
- Problem Solving on LeetCode & HackerRank

---

## 🤝 Connect with Me

<div align="center">

[![GitHub](https://img.shields.io/badge/GitHub-grchetan-181717?style=for-the-badge&logo=github)](https://github.com/grchetan)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Chetan%20Prajapat-0077B5?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/chetan-prajapat-58350b285/)
[![Portfolio](https://img.shields.io/badge/Portfolio-grchetan.github.io-00ff87?style=for-the-badge)](https://grchetan.github.io/)
[![LeetCode](https://img.shields.io/badge/LeetCode-chetanprajapat07-FFA116?style=for-the-badge&logo=leetcode)](https://leetcode.com/u/chetanprajapat07/)

</div>

---

<div align="center">

**Made with ☕ + grind by [Chetan Prajapat](https://grchetan.github.io/)**  
_BCA @ Sage University Indore · Full Stack Dev · DSA Grinder_

> _"The best way to learn DSA is to just start writing the code — ugly first, optimized later."_

⭐ **Star this repo if you're also on the grind!**

</div>
