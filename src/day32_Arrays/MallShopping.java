package day32_Arrays;

public class MallShopping {
    public static void main(String[] args) {
        //                  0           1       2           3       4           5
        String[] items =  {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99,     150.0,     9.99,     250.0,   439.50,     39.99};
        int[] itemIDs =   {12345,     12346,     12347,    12348,   12349,      12350};

        //-------index number of gloves-------
        for (int i = 0; i<items.length;i++){
            if (items[i].equals("Gloves")){
                System.out.println("gloves index number is = " + i);
                break;
            }
        }

        //---set the boolean to true if first iPad is found
        boolean ipadExists = false;
        for (int j = 0; j<items.length; j++){
            if (items[j].equalsIgnoreCase("ipad")){
                ipadExists = true;
                break;
            }
        }
        System.out.println("ipadExists = " + ipadExists);

        for (int k = 0; k<items.length; k++){
            System.out.println(itemIDs[k] +" - "+ items[k] +" = " + prices[k]);
        }

        for (int l = 0; l<items.length; l++){
            if (items[l].equalsIgnoreCase("jacket")){
                System.out.println(itemIDs[l] + " - " + items[l] + " = " +prices[l]);
                break;
            }
        }

    }
}
