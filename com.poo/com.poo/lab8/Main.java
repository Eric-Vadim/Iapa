package oop.lab8;

import java.util.List;
import oop.lab8.geometry.Cub;
import oop.lab8.geometry.GeometricBody;
import oop.lab8.geometry.Parallelepiped;
import oop.lab8.geometry.Sphere;
import oop.lab8.utils.GeometricBodyController;

public class Main {

  public static void main(String[] args) {
    final List<GeometricBody> bodies = List.of(
        new Cub(12f),
        new Parallelepiped(1f, 2f, 3f),
        new Sphere(2f));

    showBiggestBodies(bodies);
  }

  private static void showBiggestBodies(List<GeometricBody> bodies) {
    GeometricBody bodyWithBiggestSurface = GeometricBodyController
        .findBodyWithBiggestSurface(bodies);
    GeometricBody bodyWithBiggestVolume = GeometricBodyController
        .findBodyWithBiggestVolume(bodies);

    System.out.printf("Body with biggest surface has surface=%.3f and volume=%.3f\n",
        bodyWithBiggestSurface.getSurface(), bodyWithBiggestSurface.getVolume());
    System.out.printf("Body with biggest volume has surface=%.3f and volume=%.3f\n",
        bodyWithBiggestVolume.getSurface(), bodyWithBiggestVolume.getVolume());
    System.out.println();
  }
}