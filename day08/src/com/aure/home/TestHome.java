package com.aure.home;

public class TestHome {
	public static void main(String[] args) {
		Circle c = new Circle(10, "黑色", 2);
		MyRectangle m = new MyRectangle(4, 5, "橙色", 5);

		TestHome t = new TestHome();
		t.equalsArea(c, m);
		t.displayGeometricObject(c, m);

	}

	public void equalsArea(GeometricObject c, GeometricObject m) {
		double i = 0, j = 0;
		if (c instanceof Circle) {
			Circle a = (Circle) c;
			i = a.findArea();
		} else if (c instanceof MyRectangle) {
			MyRectangle a = (MyRectangle) c;
			i = a.findArea();
		}

		if (m instanceof Circle) {
			Circle b = (Circle) m;
			j = b.findArea();
		} else if (m instanceof MyRectangle) {
			MyRectangle b = (MyRectangle) m;
			j = b.findArea();
		}

		if (i == j) {
			System.out.println("圆和矩形的面积相等！");
		} else {
			System.out.println("面积不等");
		}

	}

	public void displayGeometricObject(GeometricObject c, GeometricObject m) {
		double i = 0, j = 0;
		if (c instanceof Circle) {
			Circle a = (Circle) c;
			i = a.findArea();
		} else {
			if (c instanceof MyRectangle) {
				MyRectangle a = (MyRectangle) c;
				i = a.findArea();
			}
		}
		if (m instanceof Circle) {
			Circle b = (Circle) m;
			j = b.findArea();
		} else {
			if (m instanceof MyRectangle) {
				MyRectangle b = (MyRectangle) m;
				j = b.findArea();
			}
		}
		System.out.println("面积为：" + i);
		System.out.println("面积为：" + j);
	}

}

class GeometricObject {
	private String color;
	private double weight;

	public GeometricObject() {
	}

	public GeometricObject(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}

	public double findArea() {
		System.out.println("面积:");
		return 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}

class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius, String color, double weight) {
		super(color, weight);
		this.radius = radius;
	}

	public double findArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class MyRectangle extends GeometricObject {

	private double width;
	private double height;

	public MyRectangle() {
	}

	public MyRectangle(double width, double height, String color, double weight) {
		super(color, weight);
		this.width = width;
		this.height = height;
	}

	public double findArea() {
		return width * height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
