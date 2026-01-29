# Mission Impossible: Solis Decoder

## Overview

This project implements a solution for decoding number sequences that represent encrypted messages. The cipher uses a simple number-to-letter mapping where numbers are translated to letters (1 → A, 2 → B, ..., 26 → Z). The challenge lies in the ambiguity of decoding continuous strings without breaks or spaces.

## Problem

Messages are encoded as continuous number strings without spaces, creating multiple possible interpretations. For example, `"7213"` could be decoded as:
- `"guc"` (7-21-3)
- `"gbm"` (7-2-13)
- And other valid combinations

The project solves this by:
1. Counting the total number of valid ways to decode a given string
2. Finding all possible decoded strings
3. Handling invalid strings (returning `0` or empty results)

## Implementation

The solution is implemented in `TheSolisCode.java` with three main methods:

### 1. Divide and Conquer Approach
```java
public static Integer SolisDecodeDiv(String Code)
```
Implements a divide and conquer recursive approach to count the number of valid decodings.

### 2. Dynamic Programming Approach (Count)
```java
public static Integer SolisDecodeDP(String Code)
```
Implements an optimized dynamic programming solution with O(n) time complexity to count valid decodings.

### 3. Dynamic Programming Approach (All Results)
```java
public static ArrayList<String> SolisDecodedResults(String Code)
```
Returns all possible decoded strings using dynamic programming.

## Examples

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

### Example 3 (Invalid Input)
```java
Code = "80"
Output DP: 0
Output Results: []
```
*Note: "80" is invalid because "0" cannot be decoded on its own, and "80" is not in the valid range [1-26].*

## Algorithm Details

### Decoding Rules
- Single digits (1-9) can be decoded individually
- Two digits (10-26) can be decoded as a pair
- '0' can only appear as part of "10" or "20"
- Any other '0' placement makes the string invalid
- Decoded output is in lowercase (a-z)

### Key Implementation Details
- **Base Cases:**
  - Empty string: 1 way to decode (used as recursion base case)
  - Null string: Return 0 (invalid input)
  - Single digit: 1 way if valid (1-9), 0 ways if '0'
  - Invalid sequences with '0': Handle carefully

- **Dynamic Programming Optimization:**
  - Build solution bottom-up
  - Store intermediate results to avoid recomputation
  - Achieve O(n) time complexity

## Testing

The repository includes comprehensive test cases in `src/csen703/test/assignment1/TheSolisTest.java`.

### Running Tests in IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Right-click on `TheSolisTest.java` in the Project Explorer
3. Select "Run 'TheSolisTest'" or press `Ctrl+Shift+F10` (Windows/Linux) or `Cmd+Shift+R` (Mac)
4. View test results in the Run window at the bottom

### Running Tests in Eclipse
1. Open the project in Eclipse
2. Right-click on `TheSolisTest.java` in the Package Explorer
3. Select "Run As" → "JUnit Test"
4. View test results in the JUnit view

## Project Structure

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
---
