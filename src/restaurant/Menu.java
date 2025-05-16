package restaurant;
/**
 * Use this class to test your Menu method. 
 * This class takes in two arguments:
 * - args[0] is the menu input file
 * - args[1] is the output file
 * 
 * This class:
 * - Reads the input and output file names from args
 * - Instantiates a new RUHungry object
 * - Calls the menu() method 
 * - Sets standard output to the output and prints the restaurant
 *   to that file
 * 
 * To run: java -cp bin restaurant.Menu menu.in menu.out
 * 
 */
public class Menu {
    public static void main(String[] args) {

	// 1. Read input files
	// Option to hardcode these values if you don't want to use the command line arguments
	   
        String inputFile = args[0];
        String stockInput = args[1];
        String order = args[2];
        String donation = args[3];
        String restock = args[4];
        String transaction = args[5];
        StdOut.println("INput file: " + inputFile);
        StdOut.println("STOCKinput file: " + stockInput);

	
        // 2. Instantiate an RUHungry object
        RUHungry rh = new RUHungry();
        

	// 3. Call the menu() method to read the menu
        rh.menu(inputFile);
        rh.createStockHashTable(stockInput);
        rh.updatePriceAndProfit();
        /*StdIn.setFile(order);
        
        int len = StdIn.readInt();
        for (int i = 0; i < len; i ++){
                int amount = StdIn.readInt();
                StdIn.readChar();
                String item = StdIn.readLine();
                rh.order(item, amount);
                
        }
        StdIn.resetFile();
        StdIn.setFile(donation);
        int lenDon = StdIn.readInt();
        for (int i = 0; i < lenDon; i++){
                int donAmount = StdIn.readInt();
                StdIn.readChar();
                String donItem = StdIn.readLine();
                rh.donation(donItem, donAmount);
        }
        StdIn.resetFile();
        StdIn.setFile(restock);
        int lenRest = StdIn.readInt();
        for (int i = 0; i < lenRest; i++){
                int restAmount = StdIn.readInt();
                StdIn.readChar();
                String restItem = StdIn.readLine();
                rh.restock(restItem, restAmount);
        }
        StdIn.resetFile();*/
        StdIn.setFile(transaction);
        int lenTrans = StdIn.readInt();
        for (int i = 0; i < lenTrans; i++){
                String transType = StdIn.readString();
                int transAmount = StdIn.readInt();
                StdIn.readChar();
                String transItem = StdIn.readLine();
                if (transType.equals("order")){
                        rh.order(transItem, transAmount);
                }
                else if (transType.equals("donation")){
                        rh.donation(transItem, transAmount);
                }
                else if (transType.equals("restock")){
                        rh.restock(transItem, transAmount);
                }
        }
        
        

        StdOut.println("Called menu: " + inputFile);

	// 4. Set output file
	// Option to remove this line if you want to print directly to the screen
        //StdOut.setFile(outputFile);

	// 5. Print restaurant
        rh.printRestaurant();
    }
}

