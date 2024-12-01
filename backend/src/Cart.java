import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Cart {

    public String[][] mainTable = new String[4][4];

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
    }
    public void addItem(String itemId, String SID) {
        //look for SID then concat itemID with " "
        for (int i = 0; i<4; i++){
            if (mainTable[i][1].equals(SID)){
                mainTable[i][2] = mainTable[i][2] + " " + itemId;
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
