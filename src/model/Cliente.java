package model;

public abstract class Cliente extends Pessoa {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente(){}

    public Cliente(int id){
        setId(id);
    }
}
