package com.poo.lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

  private static final String ONE_EXPRESSION_FILEPATH = "assets/one_expression.txt";
  private static final String THREE_EXPRESSIONS_FILEPATH = "assets/three_expressions.txt";

  public static void main(String[] args) throws IOException {
    validateExpressionsInFile(ONE_EXPRESSION_FILEPATH);
    validateExpressionsInFile(THREE_EXPRESSIONS_FILEPATH);
  }

  private static void validateExpressionsInFile(String filePath) throws IOException {
    List<String> lines = readLines(filePath);

    for (var expression : lines) {
      if (MathExpressionValidator.hasValidBrackets(expression)) {
        System.out.printf("Expression '%s' has valid brackets.\n", expression);
      } else {
        System.out.printf("Expression '%s' has invalid brackets.\n", expression);
      }
    }
  }

  private static List<String> readLines(String filePath) throws IOException {
    return Files.readAllLines(Path.of(filePath));
  }
}