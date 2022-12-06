public class Main {
    public static void main(String[] args) {

        IndexService service = new IndexService();

        double index = service.calculete(50,170);
        System.out.println("Ваш индекс: " + index);
    }

}
