package Examples;


    class Shape {
        void draw() {
            System.out.println("Drawing a shape.");
        }
    }

    class Circle extends Shape {
        void area() {
            System.out.println("Calculating area of a circle.");
        }
    }

    class Rectangle extends Shape {
        void area() {
            System.out.println("Calculating area of a rectangle.");
        }
    }

    public class HierarchicalInheritance {
        public static void main(String[] args) {
            Circle circle = new Circle();
            Rectangle rectangle = new Rectangle();

            circle.draw();
            circle.area();

            rectangle.draw();
            rectangle.area();
        }
    }


