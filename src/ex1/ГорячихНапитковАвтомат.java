package ex1;


    public class ГорячихНапитковАвтомат implements ТорговыйАвтомат{
        @Override
        public void getProduct() {
            System.out.println("Выбран горячий напиток.");
        }


        public void getProduct(int name, int volume, int temperature) {
            ГорячийНапиток горячийНапиток = new ГорячийНапиток(getNameById(name), volume);
            if (горячийНапиток instanceof НаследникГорячегоНапитка) {
                НаследникГорячегоНапитка наследник = (НаследникГорячегоНапитка) горячийНапиток;
                наследник.setTemperature(temperature);
            }

            System.out.println("Выбран горячий напиток:");
            System.out.println("Название: " + горячийНапиток.getНазвание());
            System.out.println("Объем: " + горячийНапиток.getОбьем());

            if (горячийНапиток instanceof НаследникГорячегоНапитка) {
                НаследникГорячегоНапитка наследник = (НаследникГорячегоНапитка) горячийНапиток;
                System.out.println("Температура: " + наследник.getTemperature());
            }
        }

        private String getNameById(int id) {
            return "Название по идентификатору " + id;
        }
    }

