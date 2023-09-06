package Задание2;

import Задание1.Main;

import java.util.Random;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public double lenghtVector() {
        return Math.sqrt(
                this.getX() * this.getX() + this.getY() * this.getY() + this.getZ() * this.getZ());
    }

    public double scalarMultyply(Vector vector2) {
        return this.getX() * vector2.getX() + this.getY() * vector2.getY() + this.getZ() * vector2.getZ();
    }

    public Vector vectorMultyply(Vector vector2) {
        Vector answer = new Vector();
        answer.setX(this.getY() * vector2.getZ() - this.getZ() * vector2.getY());
        answer.setY(this.getZ() * vector2.getX() - this.getX() * vector2.getZ());
        answer.setZ(this.getX() * vector2.getY() - this.getY() * vector2.getX());
        return answer;
    }

    public double angleBetweenVectors(Vector vector2) {
        double scalarMultyply = this.scalarMultyply(vector2);
        double lenghtVector = Math.abs(this.lenghtVector() * vector2.lenghtVector());
        try {
            double result = scalarMultyply / lenghtVector;
            return result;
        } catch (ArithmeticException e) {
            System.err.println("Ошибка: Попытка деления на ноль!");
        }
        return Double.MIN_VALUE;
    }


    public Vector sum(Vector vector1) {
        Vector vector = new Vector();
        vector.setX(this.getX() + vector1.getX());
        vector.setY(this.getY() + vector1.getY());
        vector.setZ(this.getZ() + vector1.getZ());
        return vector;
    }

    public Vector minus(Vector vector1) {
        Vector vector = new Vector();
        vector.setX(this.getX() - vector1.getX());
        vector.setY(this.getY() - vector1.getY());
        vector.setZ(this.getZ() - vector1.getZ());
        return vector;
    }

    public static Vector[] generateRandomVectors(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("N должно быть положительным числом.");
        }

        Random random = new Random();
        Vector[] vectors = new Vector[N];

        for (int i = 0; i < N; i++) {
            double x = random.nextDouble(); //
            double y = random.nextDouble(); //
            double z = random.nextDouble(); //
            vectors[i] = new Vector(x, y, z);
        }

        return vectors;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
