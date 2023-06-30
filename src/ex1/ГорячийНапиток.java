package ex1;

public class ГорячийНапиток {
    private String название;
    private Integer обьем;

    public String getНазвание() {
        return название;
    }

    public void setНазвание(String название) {
        this.название = название;
    }

    public Integer getОбьем() {
        return обьем;
    }

    public void setОбьем(Integer обьем) {
        this.обьем = обьем;
    }

    public ГорячийНапиток(String название, Integer обьем) {
        this.название = название;
        this.обьем = обьем;
    }

    public void подогреть() {
        System.out.println("Горячий напиток подогревается");
    }


}
