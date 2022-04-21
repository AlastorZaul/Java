public class Heritage {
    public static void main(String[] args) {
        Apartment MyApartment = new Apartment();
        Person person = new Person();
        person.name = "Serge";
        person.house = MyApartment;
        person.display();
    }
}

class House {
    protected int surface;
    protected Door door;

    public House(int surface) {
        this.surface = surface;
        door = new Door();
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int value) {
        surface = value;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door d) {
        door = d;
    }

    public void display() {
        System.out.println("Je suis une maison, ma surface est de " + surface + " m2.");
    }
}

class Door {
    protected String color;

    public Door() {
        color = "blue";
    }

    public Door(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        color = value;
    }

    public void display() {
        System.out.println("Je suis une porte, ma couleur est " + color + ".");
    }
}

class Apartment extends House {
    public Apartment() {
        super(50);
    }

    public void display() {
        System.out.println("Je suis un appartement, ma surface est de " + surface + " m2");
    }
}

class Person {
    protected String name;
    protected House house;

    public Person() {
        this.name = "Thomas";
        this.house = new House(150);
    }

    public Person(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House h) {
        house = h;
    }

    public void display() {
        System.out.println("Je m'appel " + name + ".");
        house.display();
        house.door.display();
    }
}


