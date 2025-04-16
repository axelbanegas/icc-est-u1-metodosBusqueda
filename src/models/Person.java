package models;
public class Person {

    private int code;
    private String name;
    
    public Person( int code, String name) {
        this.name = name;
        this.code = code;
    }
    public String getNombre() {
        return name;
    }
    public void setNombre(String name) {
        this.name = name;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    
}
