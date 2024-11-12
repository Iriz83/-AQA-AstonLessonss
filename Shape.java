public interface Shape {
    double calculatePerimeter();
    double calculateArea();

    String getFillColor();
    String getBorderColor();
    String getType();

    void setFillColor(String color);
    void setBorderColor(String color);
    void setType(String type);
}
