package shape;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Circle circle1 = new Circle(2);
		Square square1 = new Square(10, 5);
		Triangle triagle1 = new Triangle(3, 2, 4);
		Sphere sphere1 = new Sphere(10);
		Cube cube1 = new Cube(10, 5, 6);
		Tetrahedron tetrahedron1 = new Tetrahedron(3, 4, 5, 10);

		// Tao danh sach cac shape
		ArrayList<Shape> listShape = new ArrayList<Shape>();
		listShape.add(circle1);
		listShape.add(square1);
		listShape.add(tetrahedron1);
		listShape.add(cube1);
		listShape.add(sphere1);
		listShape.add(triagle1);

		for (int i = 0; i < listShape.size(); i++) {
			Shape sh = listShape.get(i);
			System.out.println(sh);
		}

	}
}
