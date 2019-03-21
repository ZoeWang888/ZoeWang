package day10_3;

public class lover {
    private String name;

    public lover() {
    }

    public lover(String name) {
        this.name = name;
    }
    public void doing(){
        System.out.println(name+" 我爱你");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
