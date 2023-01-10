package Entity;

public class member_entity {
    String name,noHP;

    public member_entity(String name, String noHP){
        this.name = name;
        this.noHP = noHP;
    }

    public String getName() {
        return name;
    }

    public String getNoHP() {
        return noHP;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

}
