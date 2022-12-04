/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

import java.util.Scanner;

/**
 *
 * @author DeS
 */
public class Economyclass {
int SeatNumber;
    String SeatType;
    public void DisplayEconomyClassSeats(){}
     public void Reserve(){

        Scanner read = new Scanner(System.in);

        // Initialization

        final int ROWS = 2;
        final int COLS = 3;

        char [][] seats = new char [ROWS][COLS];
        int i, j, seatNum, counter = 0;
        char seatLetter = 'A';
        int choice = 0;
        String seatEnter;
        boolean cont = true; // loops of running the program

        while( choice != 4 ){

            System.out.print( "1. Assign Seats"      );
            System.out.print( "2. Exit"              );
            System.out.print( "Select your choice: " );

            choice = read.nextInt();

            switch( choice ){

                case 1:
                    //Set the value.
                    for (i=0; i < seats.length; i++) {

                        for (j=0; j < seats[i].length; j++)
                            seats[i][j] = seatLetter++;

                        seatLetter = 'A'; // to reset the value to A for the new loop
                    }

                    //To display the list of seats

                    for (i=0; i < seats.length; i++) {
                        System.out.print((i+1)+" ");

                        for (j=0; j < seats[i].length; j++)
                            System.out.print(seats[i][j]+" ");

                        System.out.println();
                    }

                    //condition
                    while (counter < 6 && cont) {
                        do {

                            System.out.print("Please type the chosen seat(starts with row and column,e.g:2A):" + "");

                            seatEnter = (read.nextLine()).toUpperCase(); //covert to Upper case
                            seatNum   = Integer.parseInt(seatEnter.charAt(0)+"");

                            if (seatNum != 0)
                                seatLetter = seatEnter.charAt(1);

                            i++;

                            //if user enters wrong input, error message will appear.

                            if (seatLetter!='A'){
                                if (seatLetter!='B'){
                                    if(seatLetter!='C'){
                                        if(seatLetter!='D')
                                            System.out.println ("Invalid! Please enter the correct seat:");
                                    }
                                }
                            }
                        }

                        //continue to loop until the condition true
                        while (seatNum < 0 || seatNum > 7 || seatLetter < 'A' || seatLetter > 'D');

                        if (seatNum == 0) {
                            cont = false;
                        } else {
                            if (seats[seatNum-1][seatLetter-65] == 'X')
                                System.out.println("Seat have been taken.Please choose another seat:");
                            else {
                                seats[seatNum -1][seatLetter-65] = 'X';

                                counter++;
                            }

                            // To display updated lists of seats
                            for (i=0; i < seats.length; i++) {
                                System.out.print((i+1)+" ");

                                for (j=0; j < seats[i].length; j++)
                                    System.out.print(seats[i][j] + " ");

                                System.out.println();
                            }

                            System.out.println(" ") ;

                            //}
                            //}
                            // displays fully booked message
                            if (counter == 6)
                                System.out.println("All seats are now fully-booked.");
                            break;
                        }
                    }

                case 2://syntax error here
                    if (counter == 6)
                        System.out.println( "All seats are now fully-booked." );
                        System.out.println( "End of Program");

                        System.exit(0);
                        break;

                default:
                    System.out.println("Error input"); 
                    break;//syntax error here as well.
    }

        }
    }
}
