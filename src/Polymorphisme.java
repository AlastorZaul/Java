class Animal {
    public void cri() {
        System.out.println("Le cri d'animaux");
    }
}
class Chat extends Animal {
    public void cri() {
        System.out.println("meow, meow");
    }
}
class Chien extends Animal {
    public void cri() {
        System.out.println("ouah, ouah");
    }
}

class Poussin extends Animal {
    public void cri () {
        System.out.println("piou, piou");
    }
}

class Polymorphisme {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal chat = new Chat();
        Animal chien = new Chien();
        Animal poussin = new Poussin();
        animal.cri();
        chat.cri();
        chien.cri();
        poussin.cri();
    }
}
