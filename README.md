# Mission Impossible: Solis

**Course:** CSEN 703 Analysis and Design of Algorithms, Winter Term 2025  
**Instructor:** Dr. Nourhan Ehab  
**Institution:** German University in Cairo, Department of Computer Science

## 🎭 Mission Briefing

Welcome back, Agent Hunt. In your absence, a group rose to take over the underworld known as **Solis**. We know that they have been recruiting many of the world's most influential people, who all have a mark on their ring finger resembling a burning sun. They communicate through messages written in number sequences. However, we are having difficulty processing it so far. 

Your mission, if you choose to accept it, is to infiltrate the group using the information in the messages. Time is of the essence, so move now, and when you reach your destination, we will have figured out a way to decode it efficiently. Good Luck!

## 🔐 The Cipher

Solis uses a simple cipher that maps numbers to letters:
- **1 → A, 2 → B, 3 → C, ..., 26 → Z**

The challenge is that messages are written as continuous strings with no breaks or spaces to separate words. This creates ambiguity:
- `"7213"` could be decoded as:
  - `"GUC"` (7-21-3)
  - `"GBM"` (7-2-13)
  - And other combinations...

## 📋 Problem Description

We need to help Ethan decode these messages by:
1. **Counting** the number of ways an input string can be decoded
2. **Finding** all possible decoded strings for the input string
3. Returning `0` or an empty list for invalid strings that cannot be decoded

## 🎯 Technical Requirements

Implement a Java file `TheSolisCode.java` with the following specifications:

### Package and Class Structure
```java
package csen703.main.assignment1;

public class TheSolisCode {
    // Implementation methods
}
```

### Required Methods

#### 1. Divide and Conquer Approach
```java
public static Integer SolisDecodeDiv(String Code)
```
- Implements a divide and conquer approach
- Returns the number of ways the input string can be decoded
- Returns `0` if the string is invalid or cannot be decoded

#### 2. Dynamic Programming Approach (Count)
```java
public static Integer SolisDecodeDP(String Code)
```
- Implements a dynamic programming approach
- Returns the number of ways the input string can be decoded
- **Must run in O(n) time complexity**
- Returns `0` if the string is invalid or cannot be decoded

#### 3. Dynamic Programming Approach (All Results)
```java
public static ArrayList<String> SolisDecodedResults(String Code)
```
- Implements a dynamic programming approach
- Returns all possible decoded strings
- Returns an empty `ArrayList` if the string is invalid or cannot be decoded

### Important Notes
- **Do not use static variables** - they may interfere with test cases
- You may use helper methods as needed
- Stick to the exact method signatures provided

## 📊 Sample Input/Output

### Example 1
```java
Code = "4182113"
Output DP: 10
Output Results: [drum, druac, drbkc, drbam, drbaac, dahum, dahuac, dahbkc, dahbam, dahbaac]
```

### Example 2
```java
Code = "2025"
Output DP: 3
Output Results: [ty, tbe, bbe]
```

### Example 3 (Invalid)
```java
Code = "80"
Output DP: 0
Output Results: []
```
*Note: "80" is invalid because "0" cannot be decoded on its own, and "80" is not in the valid range [1-26].*

## 🛠️ Implementation Strategy

### Key Considerations
1. **Base Cases:**
   - Empty string: 1 way to decode (empty result)
   - Single digit: 1 way if valid (1-9), 0 ways if '0'
   - Invalid sequences with '0': Handle carefully

2. **Dynamic Programming:**
   - Build solution bottom-up
   - Store intermediate results to avoid recomputation
   - Achieve O(n) time complexity

3. **Decoding Rules:**
   - A single digit (1-9) can always be decoded
   - Two digits (10-26) can be decoded as a pair
   - '0' can only appear as part of "10" or "20"
   - Any other '0' placement makes the string invalid

## 🧪 Testing

The repository includes comprehensive test cases in `src/csen703/test/assignment1/TheSolisTest.java`.

To run tests:
```bash
# Using your preferred Java build tool
# Example with JUnit
java -cp <classpath> org.junit.runner.JUnitCore csen703.test.assignment1.TheSolisTest
```

## 📁 Project Structure

```
Mission-Impossible-Solis/
├── src/
│   └── csen703/
│       ├── main/
│       │   └── assignment1/
│       │       └── TheSolisCode.java
│       └── test/
│           └── assignment1/
│               └── TheSolisTest.java
└── README.md
```

## 📝 Submission Guidelines

1. **Auto-Testing:** Your assignment will be automatically tested. You must adhere to:
   - Exact method signatures
   - Class name: `TheSolisCode`
   - Package name: `csen703.main.assignment1`
   - Output format as specified

2. **Team Work:** Work in teams of no more than two people

3. **Academic Integrity:**
   - No plagiarism from other students
   - Do not copy-paste from AI chatbots (use them only for guidance)
   - Violations will result in zero marks for all teams involved

4. **Deadline:** December 15th, 2025 - 11:59 PM

## 🎓 Learning Objectives

This assignment helps you master:
- **Divide and Conquer:** Breaking problems into smaller subproblems
- **Dynamic Programming:** Optimizing recursive solutions
- **Time Complexity Analysis:** Achieving O(n) performance
- **String Processing:** Handling ambiguous encodings
- **Edge Case Handling:** Dealing with invalid inputs

## 💡 Tips for Success

1. Start with the divide and conquer approach to understand the problem
2. Identify overlapping subproblems for DP optimization
3. Draw out the recursion tree for small examples
4. Test with edge cases: empty strings, single digits, strings with '0'
5. Verify your solution matches the expected output format exactly

## 📄 License

This is an academic assignment for CSEN 703 at the German University in Cairo.

---

*This message will self-destruct in 5 seconds... Good luck, Agent Hunt! 🕶️*
