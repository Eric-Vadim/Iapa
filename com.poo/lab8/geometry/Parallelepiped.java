package oop.lab8.geometry;

public class Parallelepiped implements GeometricBody {

  private final float sideA;
  private final float sideB;
  private final float sideC;

  public Parallelepiped(float sideA, float sideB, float sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  @Override
  public float getSurface() {
    return (2 * sideA * sideB) + (2 * sideB * sideC) + (2 * sideA * sideC);
  }

  @Override
  public float getVolume() {
    return sideA * sideB * sideC;
  }
}