package com.poo.lab4;

public class MathExpressionValidator {

  public static boolean hasValidBrackets(String expression) {
    int openBracketCount = 0;

    for (char ch : expression.toCharArray()) {
      if (ch == '(') {
        openBracketCount++;
      } else if (ch == ')') {
        if (openBracketCount == 0) {
          return false;
        }
        openBracketCount--;
      }
    }
    return openBracketCount == 0;
  }
}