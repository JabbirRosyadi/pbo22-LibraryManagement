package Entity;

public class staff_entity extends member_entity {
    private String password;
    public staff_entity(String name, String noHP, String password) {
        super(name, noHP);
        this.password = password;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public String getNoHP() {
        // TODO Auto-generated method stub
        return super.getNoHP();
    }

    public String getPassword() {
        return password;
    }
    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void setNoHP(String noHP) {
        // TODO Auto-generated method stub
        super.setNoHP(noHP);
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
