public abstract class Food implements Consumable {
    String name = null;
    String size = "";

    public Food(String name) {
        this.name = name;
    }

    public void setParam(String param) {
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean equals(Food object) {return (this.name == object.name);}

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

