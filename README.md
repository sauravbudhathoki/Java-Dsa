## 1.Missing Char


Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

- missingChar("kitten", 1) → "ktten"
- missingChar("kitten", 0) → "itten"
- missingChar("kitten", 4) → "kittn"


## 2.FrontBack


Given a string, return a new string where the first and last chars have been exchanged.

- frontBack("code") → "eodc"
- frontBack("a") → "a"
- frontBack("ab") → "ba"


## 3.Front3

Given a string, we'll say that the front is the first 3 chars of the string. 
If the string length is less than 3, the front is whatever is there. 
Return a new string which is 3 copies of the front.


- front3("Java") → "JavJavJav"
- front3("Chocolate") → "ChoChoCho"
- front3("abc") → "abcabcabc"


## 4.BackAround


Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". 
The original string will be length 1 or more.

- backAround("cat") → "tcatt"
- backAround("Hello") → "oHelloo"
- backAround("a") → "aaa"


## 5.or35

Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator.

- or35(3) → true
- or35(10) → true
- or35(8) → false


## 6.Front22

Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

- front22("kitten") → "kikittenki"
- front22("Ha") → "HaHaHa"
- front22("abc") → "ababcab"


## 7.startHi

Given a string, return true if the string starts with "hi" and false otherwise.

- startHi("hi there") → true
- startHi("hi") → true
- startHi("hello hi") → false

## 8.IcyHot

Given two temperatures, return true if one is less than 0 and the other is greater than 100.

- icyHot(120, -1) → true
- icyHot(-1, 120) → true
- icyHot(2, 120) → false


## 8.In1020

Given 2 int values, return true if either of them is in the range 10..20 inclusive.

- in1020(12, 99) → true
- in1020(21, 12) → true
- in1020(8, 99) → false


## 9.hasTeen

We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

- hasTeen(13, 20, 10) → true
- hasTeen(20, 19, 10) → true
- hasTeen(20, 10, 13) → true


## 10.LoneTeen

We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

- loneTeen(13, 99) → true
- loneTeen(21, 19) → true
- loneTeen(13, 13) → false


## 11.delDel

Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

- delDel("adelbc") → "abc"
- delDel("adelHello") → "aHello"
- delDel("adedbc") → "adedbc"
