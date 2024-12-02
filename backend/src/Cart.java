import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Cart {

    public String[][] mainTable = new String[4][4];
    public String[][] products = new String[10][2];

    public Cart() {
        //fixed student names in the first column
        mainTable[0][0] = "Student 1";
        mainTable[1][0] = "Student 2";
        mainTable[2][0] = "Student 3";
        mainTable[3][0] = "Student 4";
        //fixed student IDs in the second column
        mainTable[0][1] = "1";
        mainTable[1][1] = "2";
        mainTable[2][1] = "3";
        mainTable[3][1] = "4";
        //initialize items
        mainTable[0][2] = "";
        mainTable[1][2] = "";
        mainTable[2][2] = "";
        mainTable[3][2] = "";
        //initialize total values to 0
        mainTable[0][3] = "0";
        mainTable[1][3] = "0";
        mainTable[2][3] = "0";
        mainTable[3][3] = "0";
    }
    public void addItem(String itemId, String SID, int price) {
        //look for SID then concat itemID with " "
        for (int i = 0; i<4; i++){
            int productPrice = 0;
            if (mainTable[i][1].equals(SID)){
                for(int y = 0; y<10;y++){
                    if (products[y][0].equals(itemId)){
                        productPrice = Integer.parseInt(products[y][1]);
                        break;
                    }
                }
                //mainTable[i][3] is converted from string to integer
                //we then add the converted result to the product price and store it in the variable total
                int total = productPrice + Integer.parseInt(mainTable[i][3]);
                String tableTotal = Integer.toString(total);
                mainTable[i][2] = mainTable[i][2] + " " + itemId;
                mainTable[i][3] = tableTotal;
                return;
            }
        }
    }

    public void removeItem(String itemId, String SID) {
        for (int i = 0; i < 4; i++){
            if (mainTable[i][1].equals(SID)){
                String[] items = mainTable[i][2].split(" ");
                StringBuilder newItems = new StringBuilder();
                for (String item : items){
                    if(!item.equals(itemId)){
                        if (newItems.length()>0){
                            newItems.append(" ");
                        }
                        newItems.append(item);
                    }
                }
                mainTable[i][2] = newItems.toString().trim();
                break;
            }
        }
    }


    public void viewItems(){

    }

}
