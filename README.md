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


