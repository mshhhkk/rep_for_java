// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        for (int i = 0; args.length > i; ++i) {
            String arg = args[i];
            String[] parts = arg.split("/");

            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
                breakfast[i].setParam(parts[1]);
            } else if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple();
                breakfast[i].setParam(parts[1]);

            } else if (parts[0].equals("IceCream")) {
                breakfast[i] = new IceCream();
                breakfast[i].setParam(parts[1]);

            }


        }

        Food Cheese_C = new Cheese();
        Food apple_C = new Apple();
        Food IceCream_C = new IceCream();

        int IceCream = 0;
        int Apple = 0;
        int Cheese = 0;
        for (int i = 0; i < breakfast.length; ++i) {
            Food item = breakfast[i];
            if (item == null) {
                break;
            }

            if (item.equals(apple_C)) {
                ++Apple;
            }

            if (item.equals(Cheese_C)) {
                ++Cheese;
            }

            if (item.equals(IceCream_C)) {
                ++IceCream;
            }
            item.consume();
        }








        System.out.println("Consumed:");
        System.out.println("Apple - "+Apple +"\nCheese - "+Cheese +"\nIceCream - "+IceCream);
    }
}
