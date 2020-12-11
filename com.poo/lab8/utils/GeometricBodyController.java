package oop.lab8.utils;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import oop.lab8.geometry.GeometricBody;

public class GeometricBodyController {

  public static GeometricBody findBodyWithBiggestVolume(List<GeometricBody> bodies) {
    return findBodyWithMaximalValue(bodies, GeometricBody::getVolume);
  }

  public static GeometricBody findBodyWithBiggestSurface(List<GeometricBody> bodies) {
    return findBodyWithMaximalValue(bodies, GeometricBody::getSurface);
  }

  private static <T extends Comparable<T>> GeometricBody findBodyWithMaximalValue(
      List<GeometricBody> bodies, Function<GeometricBody, T> extractor) {

    if (bodies == null || bodies.isEmpty()) {
      throw new IllegalArgumentException("Body list must not be empty");
    }

    return bodies.stream()
        .max(Comparator.comparing(extractor)).get();
  }
}