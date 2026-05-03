package practice;

public class Test {
    public static void main(String[] args){
        Car car = new Car("Kia",2018);
        car.setYear(2022);
        car.showInfo();

        Rectangle rectangle = new Rectangle(6,9);
        rectangle.setWidth(12);
        System.out.println(rectangle.calculateArea());

        Book book = new Book("GOT","Martin");
        book.setAuthor("Petya");
        book.showInfo();

        BankAccount ba = new BankAccount(1000, "Viktor");
        ba.deposit(300.5);
        ba.printBalance();

        Point point = new Point(50,22);
        point.setX(11);
        point.print();

        StudentGroup sg = new StudentGroup("Vasilki",30);
        sg.setCount(42);
        sg.print();

        Circle circle = new Circle(12);
        circle.setRadius(11);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());

        Teacher teacher = new Teacher("Nikolay","History");
        teacher.setSubject("Math");
        teacher.print();

        Product product = new Product("Car",1800);
        product.discount(2000);
        product.discount(200);
        product.printInfo();

        Laptop laptop = new Laptop("Lenovo", 200);
        laptop.setPrice(300);
        laptop.printInfo();
    }
}
class Car{
    Car(String brand, int year){
        this.brand=brand;
        this.year=year;
    }
    private String brand;
    private int year;
    String getBrand(){
        return brand;
    }
    int getYear(){
        return year;
    }
    void setBrand(String b){
        brand=b;
    }
    void setYear(int y){
        year=y;
    }
    void showInfo(){
        System.out.println("Brand: " + brand + ", year: "+ year);
    }
}
class Rectangle{
    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    private int length, width;
    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }
    void setWidth(int width){
        this.width=width;
    }
    int calculateArea(){
        return length*width;
    }
}
class Book{
    Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    private String title, author;
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    void setTitle(String title){
        this.title=title;
    }
    void setAuthor(String author){
        this.author=author;
    }
    void showInfo(){
        System.out.println("Title: " + title + ", author: " + author);
    }

}
class BankAccount{
    BankAccount(double balance, String owner){
        this.balance=balance;
        this.owner=owner;
    }
    private double balance;
    private String owner;

    double getBalance(){
        return balance;
    }
    String getOwner(){
        return owner;
    }
    void setOwner(String owner){
        this.owner=owner;
    }
    void deposit(double deposit){
        balance+=deposit;
    }
    void withdraw(double withdraw){
        if(withdraw<=balance){
        balance-=withdraw;}
        else {
            System.out.println("You cannot withdraw this amount");
        }
    }
    void printBalance(){
        System.out.println("Balance: " + balance);
    }
}
class Point{
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    private int x,y;
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void setX(int x){
        this.x=x;
    }
    void print(){
        System.out.println("X: " + x + " Y: " + y);
    }
}
class StudentGroup{
    StudentGroup(String name, int count){
        this.count= count;
        this.name=name;
    }
    private String name;
    private int count;

    String getName(){
        return name;
    }
    int getCount(){
        return count;
    }
    void setName(String name){
        this.name=name;
    }
    void setCount(int count){
        this.count=count;
    }
    void print(){
        System.out.println("Group name: " + name + ", Student count: " + count);
    }
}
class Circle{
    Circle(int radius){
        this.radius=radius;
    }
    private int radius;
    int getRadius(){
        return radius;
    }
    void setRadius(int radius){
        this.radius=radius;
    }
    double calculateArea(){
        return (double) 3.14*radius*radius;
    }
    double calculateCircumference(){
        return (double) 2*3.14*radius;
    }
}
class Teacher{
    Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }
    private String name, subject;
    void setName(String name){
        this.name=name;
    }
    void setSubject(String subject){
        this.subject=subject;
    }
    String getName(){
        return name;
    }
    String getSubject(){
        return subject;
    }
    void print(){
        System.out.println("Name: " + name + " subject: " + subject);
    }
}
class Product{
    Product(String name, int price){
        this.name=name;
        this.price=price;
    }
    private String name;
    private int price;
    String getName(){
        return name;
    }
    int getPrice(){
        return price;
    }
    void setPrice(int price){
            this.price = price;
    }
    void discount(int discount){
        if(price-discount>=0) {
            price-=discount;
        }
        }
    void printInfo(){
        System.out.println("Product name: " + this.name + " price: " + price);
    }

    }
    class Laptop{
    Laptop(String brand, int price){
        this.brand=brand;
        this.price=price;
    }
        private String brand;
    private int price;
    void setPrice(int price){
        this.price=price;
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    String getBrand(){
        return brand;
    }
    int getPrice(){
        return price;
    }
    void printInfo(){
        System.out.println("Brand: " + brand + " price: " + price);
    }
    }


