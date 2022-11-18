// Programmer: Amanda Windsor 12197877
// File: Binary.java
// Date: November 18, 2022
// Purpose: Convert binary to decimal

public int convertToDecimal(String binary) {
  int conversion = 1;
  int result = 0;
  for (int i = 1; i <= binary.length(); i++) {
    if (binary.charAt(binary.length() - i) == '1')
      result += conversion;
    conversion *= 2;
  }
  return result;
} 
