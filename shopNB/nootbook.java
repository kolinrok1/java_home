public class nootbook {

    public String name;
    public Integer RAM;
    public Integer HDD;
    public String OS;
    public Integer prise;

    public nootbook(String n, Integer r, Integer h, String o, Integer p) {
        this.name = n;
        this.RAM = r;
        this.HDD = h;
        this.OS = o;
        this.prise = p;
    }
    public String getName(){
        return name;
    }
}
