public class general {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of bike you want to drive ... ");

        String input = scanner.next();

        if(input.equals("FZ")) {

            new Garage(new YamahaFactory());

        } else if(input.equals("Hunk")) {

            new Garage(new HondaFactory());

        } else {
            System.out.println("Sry wrong bike name entered .... ");
        }

        System.out.println("\nEnter the name of another bike ... ");

        input = scanner.next();

        if(input.equals("FZ")) {

            new Garage(new YamahaFactory());

        } else if(input.equals("Hunk")) {

            new Garage(new HondaFactory());

        } else {
            System.out.println("Sry wrong bike name entered .... ");
        }

        System.out.println("\nEnter the name of another bike ... ");

        input = scanner.next();

        if(input.equals("FZ")) {

            new Garage(new YamahaFactory());

        } else if(input.equals("Hunk")) {

            new Garage(new HondaFactory());

        } else {
            System.out.println("Sry wrong bike name entered .... ");
        }



    }




}
