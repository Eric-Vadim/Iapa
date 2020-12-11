package oop.lab8.geometry;

public class Sphere implements GeometricBody {

  private final float radius;

  public Sphere(float radius) {
    this.radius = radius;
  }

  @Override
  public float getSurface() {
    return (float) (4f * Math.PI * radius * radius);
  }

  @Override
  public float getVolume() {
    return (float) ((4f * Math.PI * Math.pow(radius, 3f)) / 3f);
  }
}