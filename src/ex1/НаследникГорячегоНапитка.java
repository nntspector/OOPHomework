package ex1;

public class НаследникГорячегоНапитка extends ГорячийНапиток {
    private Integer temperature;

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public НаследникГорячегоНапитка(String название, Integer обьем, Integer temperature) {
        super(название, обьем);
        this.temperature = temperature;
    }
    public void добавитьКорицу() {
        System.out.println("Корица добавлена в горячий напиток.");
    }
}
