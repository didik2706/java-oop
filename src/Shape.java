class Shape {
    int getCorder() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorder() {
        return 4;
    }

    int getParentCorner() {
        return super.getCorder();
    }
}
