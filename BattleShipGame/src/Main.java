import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


/*
The ocean map is represented by a 10 by 10 grid of different characters. The grid is managed by a two-dimensional array.
 You will use this 2D array to save where the user and computer decide to place their ships, as well as when someone
 tries to attack a location and misses. At the start of the game the array will be empty and as the game is played you
 will change what is stored at each index of the array accordingly.

Once you create your 2D array you need a way to display it to the user so they can choose coordinates.
You should display your array surrounded by indexes like
Once you have your ocean map, you'll need to ask the user where they would like to place their ships.
The player should deploy 5 ships. A ship will be stored in a single index of the array as a special character.
To place the user's ships they need to tell you the coordinates of where the ship should be placed and you need
to update the ocean map to reflect their choices. Remember you'll need to use a Scanner to allow the user to enter
in input
As the user is telling you where to place their ships you need to check if that is an appropriate location:

you can NOT place two or more ships on the same location
you can’t place ships outside the 10 by 10 grid
If the player is trying to put the ship somewhere it can't be, re-prompt them until they choose legal coordinates for
 the ship.

You should store the player's ships within the OceanMap as '1'. That way you know within your own code which
 indexes store the player's ships. However, when you are printing out the map from the method you created in Step 1
 you should hide where the ships are by printing an '@' symbol instead. You can accomplish this with an extra if check
 within the for loop that prints your ocean map.

Once the user is finished placing a ship you should print out the map so they can see the current state of their ships.
The computer will deploy 5 ships by randomly picking X and Y coordinates. Your code is responsible for generating these
 locations, checking if they are valid, and if so placing the ships accordingly.

Keep in mind:

you cannot place the ship on a location that is already taken by another ship (player’s or computer’s)
you can’t place ships outside the 10 by 10 grid
If the computer tries to place the ship somewhere it can't be, regenerate random coordinates until all ships are placed
 appropriately.

You should store the computer's ships within the OceanMap as '2' and they should be invisible on the ocean map.
This is because the game is to have the player guess where the ships are, so you don't want to give the game away
 by showing the location of the computer's ships. Thus, as the ships are being deployed you want to give the user
  some feedback about what is happening
 */

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row=10;
        int col=10;

        char map[][]=new char[row][col];

        char player = '@';
        char pc = '#';

        System.out.print("  ");
        for (int i=0;i<10;i++){
            System.out.print(i);
        }
        System.out.println(" ");

        for (row=0; row<(map.length);row++){
            System.out.print(row+"|");
            for(col=0; col<map.length;col++){
                System.out.print(" ");
            }
            System.out.println("|"+row);
        }
        System.out.print("  ");
        for (int j=0;j<10;j++){
            System.out.print(j);
        }
        System.out.println(" ");

        for (int k = 0; k<5;k++){
            System.out.println("Where do you want to place your "+ k + " ship? Pick x and y coordinate");
            int[] x=new int[5];
            int[] y=new int[5]
             x[k] = input.nextInt();
             y[k] = input.nextInt();
            System.out.println("Ship "+ (k+1)+" is placed in coordinates "+ x + " and "+y);

            Random ran = new Random();
            int[] w =new int[5];
            int[] z=new int[5];
            w[k]=ran.nextInt((9-0)+1);
            z[k]=ran.nextInt((9-0)+1);
            System.out.println("Pc ship "+ (k+1)+" is placed in coordinates "+ w + " and "+z);


            System.out.print("  ");
            for (int i=0;i<10;i++){
                System.out.print(i);
            }
            System.out.println(" ");

            for (row=0; row<(map.length);row++){
                System.out.print(row+"|");
                for(col=0; col<map.length;col++){
                    if (row == (x[])&&col==(y[])){
                        map[x][y]=player;
                        System.out.print(map[x][y]);
                    }
                    if(row==w&&col==z){
                        map[w][z]=pc;
                        System.out.print(map[w][z]);

                    }else System.out.print(" ");
                }
                System.out.println("|"+row);
            }
            System.out.print("  ");
            for (int j=0;j<10;j++){
                System.out.print(j);
            }
            System.out.println(" ");

        }

    }
}
