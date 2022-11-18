package homeWork6;

class Cat {
    private int id;
    private int age;
    private String gender;
    private String name;
    private String color;

    public Cat(String name, String color, String gender, int age) {
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " name: " + this.name + " color: " + this.color + " gender: " + this.gender + " age: " + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cat)) return false;
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && gender.equals(cat.gender) && color.equals(cat.color) && age == cat.age && id == cat.id;
    }

    @Override
    public int hashCode() {
        return this.id = this.name.hashCode() + this.color.hashCode() + this.gender.hashCode() + age;
    }
}
