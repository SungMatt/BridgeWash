import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

class Wash {
        public static void main(String args[]) {
        
            //Edit this number to select number of shuffles!
            
        
            int wantedShuffles = 100000;
            
            
            //End of user editable area.
            
            int washCount = 0;
            int multiWash = 0;
            int washBuffer = 0;
            int doubleWash = 0;
            int tripleWash = 0;
            
            int[] suitCount;
            suitCount = new int[4];
            
            int[] cardNumber;
            cardNumber = new int[52];
            //A=1...J=11...
            int[] cardSuit;
            cardSuit = new int[52];
            //CDHS=1234
            
            int[] playerScore;
            playerScore = new int[4];
            int playerNumber = 0;
            int playerDisplayNumber = 0;
            
            int shuffle1 = 0;
            int shuffle2 = 0;
            
            int bufferCardNumber = 0;
            int bufferCardSuit = 0;
            
            
            int temp = 0;
            Random rand = new Random();
            String textInput;
            String buffer;
            

        
        System.out.println((char)27 + "[32m" + "********************************");
        System.out.println("Hello, and welcome to Card Counter");
        System.out.println((char)27 + "[32m" + "********************************");
        System.out.println((char)27 + "[31m" + "Let's begin! Start a new game by typing \"start\" ");
        Scanner scan = new Scanner(System.in);
        buffer = scan.next();
        textInput = buffer.toLowerCase();
        if (textInput.equals("start")){
            System.out.println("Let's start a game!");
            
            //Initiate Giant Statistics loop
            
            for(int numberOfShuffles = 0; numberOfShuffles<wantedShuffles;numberOfShuffles++){
            
                washBuffer = 0;
            
            //Set Cards
            cardNumber[0] = 1;
            cardNumber[1] = 2;
            cardNumber[2] = 3;
            cardNumber[3] = 4;
            cardNumber[4] = 5;
            cardNumber[5] = 6;
            cardNumber[6] = 7;
            cardNumber[7] = 8;
            cardNumber[8] = 9;
            cardNumber[9] = 10;
            cardNumber[10] = 11;
            cardNumber[11] = 12;
            cardNumber[12] = 13;
            cardNumber[13] = 1;
            cardNumber[14] = 2;
            cardNumber[15] = 3;
            cardNumber[16] = 4;
            cardNumber[17] = 5;
            cardNumber[18] = 6;
            cardNumber[19] = 7;
            cardNumber[20] = 8;
            cardNumber[21] = 9;
            cardNumber[22] = 10;
            cardNumber[23] = 11;
            cardNumber[24] = 12;
            cardNumber[25] = 13;
            cardNumber[26] = 1;
            cardNumber[27] = 2;
            cardNumber[28] = 3;
            cardNumber[29] = 4;
            cardNumber[30] = 5;
            cardNumber[31] = 6;
            cardNumber[32] = 7;
            cardNumber[33] = 8;
            cardNumber[34] = 9;
            cardNumber[35] = 10;
            cardNumber[36] = 11;
            cardNumber[37] = 12;
            cardNumber[38] = 13;
            cardNumber[39] = 1;
            cardNumber[40] = 2;
            cardNumber[41] = 3;
            cardNumber[42] = 4;
            cardNumber[43] = 5;
            cardNumber[44] = 6;
            cardNumber[45] = 7;
            cardNumber[46] = 8;
            cardNumber[47] = 9;
            cardNumber[48] = 10;
            cardNumber[49] = 11;
            cardNumber[50] = 12;
            cardNumber[51] = 13;
            
            
            //Assign Suit
            
            cardSuit[0] = 1;
            cardSuit[1] = 1;
            cardSuit[2] = 1;
            cardSuit[3] = 1;
            cardSuit[4] = 1;
            cardSuit[5] = 1;
            cardSuit[6] = 1;
            cardSuit[7] = 1;
            cardSuit[8] = 1;
            cardSuit[9] = 1;
            cardSuit[10] = 1;
            cardSuit[11] = 1;
            cardSuit[12] = 1;
            cardSuit[13] = 2;
            cardSuit[14] = 2;
            cardSuit[15] = 2;
            cardSuit[16] = 2;
            cardSuit[17] = 2;
            cardSuit[18] = 2;
            cardSuit[19] = 2;
            cardSuit[20] = 2;
            cardSuit[21] = 2;
            cardSuit[22] = 2;
            cardSuit[23] = 2;
            cardSuit[24] = 2;
            cardSuit[25] = 2;
            cardSuit[26] = 3;
            cardSuit[27] = 3;
            cardSuit[28] = 3;
            cardSuit[29] = 3;
            cardSuit[30] = 3;
            cardSuit[31] = 3;
            cardSuit[32] = 3;
            cardSuit[33] = 3;
            cardSuit[34] = 3;
            cardSuit[35] = 3;
            cardSuit[36] = 3;
            cardSuit[37] = 3;
            cardSuit[38] = 3;
            cardSuit[39] = 4;
            cardSuit[40] = 4;
            cardSuit[41] = 4;
            cardSuit[42] = 4;
            cardSuit[43] = 4;
            cardSuit[44] = 4;
            cardSuit[45] = 4;
            cardSuit[46] = 4;
            cardSuit[47] = 4;
            cardSuit[48] = 4;
            cardSuit[49] = 4;
            cardSuit[50] = 4;
            cardSuit[51] = 4;
            
            
            //Shuffle cards
            
            for(int shuffleCounter = 0;shuffleCounter<100;shuffleCounter++){
                shuffle1 = rand.nextInt(52);
                shuffle2 = rand.nextInt(52);
                bufferCardNumber = cardNumber[shuffle1];
                bufferCardSuit = cardSuit[shuffle1];
                cardNumber[shuffle1] = cardNumber[shuffle2];
                cardSuit[shuffle1] = cardSuit[shuffle2];
                cardNumber[shuffle2] = bufferCardNumber;
                cardSuit[shuffle2] = bufferCardSuit;
            }
            
            //Count cards
            
            //By JQKA
            
            for(temp = 0; temp<52;temp++){
                
                playerNumber = temp/13;
                
                if (cardNumber[temp]==1){
                    playerScore[playerNumber] = playerScore[playerNumber] + 4;
                }
                else if (cardNumber[temp]==11){
                    playerScore[playerNumber] = playerScore[playerNumber] + 1;
                }
                else if (cardNumber[temp]==12){
                    playerScore[playerNumber] = playerScore[playerNumber] + 2;
                }
                else if (cardNumber[temp]==13){
                    playerScore[playerNumber] = playerScore[playerNumber] + 3;
                }
            }
            //By Suit
                int temp3 = temp -1;
                if(cardSuit[temp3]==1) {
                    //Clubs
                    suitCount[0]++;
                }
                else if(cardSuit[temp3]==2) {
                    //Diamonds
                    suitCount[1]++;
                }
                else if(cardSuit[temp3]==3) {
                    //Hearts
                    suitCount[2]++;
                }
                else if(cardSuit[temp3]==4) {
                    //Spades
                    suitCount[3]++;
                }
                
                for (int temp2 = 0; temp2<4;temp2++){
                    
                    if (suitCount[temp2]>=5){
                        playerScore[playerNumber] = playerScore[playerNumber] + suitCount[temp2] - 4;
                    }
                }

                //Washability
                for (temp = 0;temp<4;temp++){
                    if (playerScore[temp] <=3){
                        washCount++;
                        washBuffer++;
                    }
                }
                
                
            //Debug output
            /*
            for(int temp = 1; temp<52; temp++){
                System.out.println("Card number " + temp + " is " + cardNumber[temp] + " " + cardSuit[temp]);
            }
            */
            
            //Output
            for(playerNumber = 0;playerNumber<4;playerNumber++){
            
            playerDisplayNumber = playerNumber + 1;
            
            System.out.println("Player " + playerDisplayNumber + ":");
            System.out.println("-----------------------------------------------------------");
            for(temp = 0;temp<13;temp++){
                int playerCardTemp = 0;
                playerCardTemp = temp + playerNumber*13;
                if(cardNumber[playerCardTemp]==1){
                    System.out.print("A");
                }
                else if(cardNumber[playerCardTemp]==11){
                    System.out.print("J");
                }
                else if(cardNumber[playerCardTemp]==12){
                    System.out.print("Q");
                }
                else if(cardNumber[playerCardTemp]==13){
                    System.out.print("K");
                }
                else {
                System.out.print(cardNumber[playerCardTemp]);
                }
                
                
                if(cardSuit[playerCardTemp]==1) {
                    System.out.print("D");
                }
                else if(cardSuit[playerCardTemp]==2) {
                    System.out.print("C");
                }
                else if(cardSuit[playerCardTemp]==3) {
                    System.out.print("H");
                }
                else if(cardSuit[playerCardTemp]==4) {
                    System.out.print("S");
                }
                System.out.print(" ");
            }
            System.out.println();
            System.out.println("Player " + playerDisplayNumber + " Score: " + playerScore[playerNumber]);
                if(playerScore[playerNumber] <=3) {
                    System.out.println("Player " + playerDisplayNumber + " calls for a wash.");
                }
            System.out.println();
            }
            //Reset all values
                playerScore[0] = 0;
                playerScore[1] = 0;
                playerScore[2] = 0;
                playerScore[3] = 0;
                suitCount[0] = 0;
                suitCount[1] = 0;
                suitCount[2] = 0;
                suitCount[3] = 0;
            //Double/Triple Washability
                if (washBuffer == 2) {
                    System.out.println((char)27 + "[36m");
                    System.out.println("We have a multi wash scenario here.");
                    System.out.println((char)27 + "[31m");
                    multiWash++;
                    doubleWash++;
                }
                else if (washBuffer == 3) {
                    System.out.println((char)27 + "[36m");
                    System.out.println("We have a triple wash here!");
                    System.out.println((char)27 + "[31m");
                    multiWash++;
                    tripleWash++;
                }
                
        }
            
        //Final Statistics
            System.out.println("A wash is available " + washCount + " times.");
            System.out.println("A multi-player wash was available "+ multiWash + " times.");
            System.out.println("A Double Wash was available "+ doubleWash + " times.");
            System.out.println("A Triple Wash was available "+ tripleWash + " times.");
        }
                               
        else {
            System.out.println("I did not understand your input of \"" + textInput + "\"");
        }
    }
}