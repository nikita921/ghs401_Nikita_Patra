import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date
 */
public class MyWorld extends World
{
    private String[][] grid;
    private int playerTurn;
    private String playerBlack;
    private String playerRed;
    private String playerBlackInitial;
    private String playerRedInitial;
    private int playerBlackWinTotal;
    private int playerRedWinTotal;
    private double playerBlackWinPercentage;
    private double playerRedWinPercentage;
    private int goalInARow;
    private int firstPlayerTurn;
    private boolean firstPlay;
    private String lastPlayedInitial;
    private int tieCounter;
    private int gameCounter;
    
    
    
    private int turnCounter;
    private int col1x, col1y, colDiff;
    private int actCounter;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() 
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        grid = new String[6][7];    //to keep track of the game board
        firstPlayerTurn = (int)(Math.random()*2+1);   //randomize who starts the game
        playerBlack = "PlayerBlack";
        playerRed = "PlayerRed";
        playerBlackInitial = "b";  //to fill the 2d array grid to know which checker is where
        playerRedInitial = "r";   //to fill the 2d array grid to know which checker is where
        playerBlackWinTotal = 0;  //scoreboard
        playerRedWinTotal = 0;    //scoreboard
        goalInARow = 5;//because it is Connect 4
        actCounter = 20;//sets the speed of the game
        firstPlay = true; //determines if it's first play of new game, so we can alternate first turn each game
        lastPlayedInitial = ""; //keeps track of who played last
        tieCounter = 0;
        gameCounter = 0;
        
        
        
        turnCounter = 1; //used to keep track of number of plays made
        col1x=176; //to place checkers in the correct location
        col1y=72; //to place checkers in the correct location
        colDiff=41; //to place checkers in the correct location
        
        addObject(new Board(),300,200); //adds game board
        
        
        
        
        
        
    }
    
    public void act(){
        
        
        String winner = checkForWinner();  //see if there is a winner
        if(winner != null || tie()){ //if there is a winner or a tie
                
                
            
                if(winner != null && winner.equals("r"))  //red is the winner
                {
                    showPlayer2Winner();
                    
                }
                else if(winner != null && winner.equals("b")) //black is the winner
                {
                    showPlayer1Winner();
                    
                }
                
                //resetGrid();
                
                if(turnCounter % (actCounter) == 0) //after a win,allows last checker to fall before the grid is cleared
                {
                    Greenfoot.delay(500); //allows the highlighted winner more time to be seen
                    resetGame();  //resets game
                    
                }
                
            }
            
            
            if(turnCounter % actCounter == 0){  //this controls the speed of the game
                if(firstPlay && firstPlayerTurn == 1){ //runs only first time of game, to alternate first play of each game between players

                    playerBlackStrategy();   //runs player1 code
                    firstPlayerTurn = 2;    //alternates who plays first next game
                    playerTurn = 2;  //switches to other player
                    firstPlay = false;  //will be set back to true when next game starts
                    
                }
                else if(firstPlay && firstPlayerTurn == 2){//runs only first time of game, to alternate first play of each game between players
                    
                    playerRedStrategy();    //runs player2 code
                    firstPlayerTurn = 1;    //alternates who plays first next game
                    playerTurn = 1;   //switches to other player
                    firstPlay = false;  //will be set back to true when next game starts
                    
                }
                else if(playerTurn==1){  //alternates players
                    playerBlackStrategy();   //runs player1 code
                    
                    playerTurn = 2;  //switches to other player
                }
                else if(playerTurn==2){  //alternates players
                    playerRedStrategy();    //runs player2 code
                    
                    playerTurn = 1;   //switches to other player
                }
                
               }
        
      
            
                turnCounter++;    //adds to turn counter
              
                    
    }
    
    public void playerBlackStrategy(){
        
        //leave these top 4 lines at the top
        playerBlack = "Tito";  //put player1 name here
        showText(playerBlack,70,100); //shows your name
        GreenfootImage image2 = new GreenfootImage("black.png"); //sets image to black checker
        String colorInitial = new String("b"); //fills the 2d array grid with this value
        String opposite = new String("r");
        
        //replace the following code with your strategy
        //but the second line shows you how to place your checker
        
        //makes first move
        if(firstPlay){
            placeCol(3, colorInitial, image2);
        }
        
        //checks for horizontal 3 in a row for player
        int inRow = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] != null && grid[row][col].equals(colorInitial)){
                    inRow++;
                    if(inRow == 3 && col < grid[0].length-1 && grid[row][col+1] == null){
                        placeCol(col + 1,colorInitial,image2);
                    }
                    else if(inRow == 3 && col > 2 && grid[row][col-3] == null){
                        placeCol(col - 3,colorInitial,image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        //checks for vertical 3 in a row for player
        for(int col = 0; col < grid[0].length; col++){
            for(int row = 0; row < grid.length; row++){
                if(grid[row][col] != null && grid[row][col].equals(colorInitial)){
                    inRow++;
                    if(inRow == 3 && row > 2 && grid[row-3][col] == null){
                        placeCol(col, colorInitial, image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        //checks for diagonal 3 in a row for player
        String diag1 = new String();  //Six new Strings to be built
        String diag2 = new String();  //for each possible diagonal to win 
        String diag3 = new String();
        String diag4 = new String();
        String diag5 = new String();
        String diag6 = new String();
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                
                if(r-c==2){ //checks two diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag1 += "-"; //adds a dash if cell is blank
                    else
                         diag1 += grid[r][c];  //adds the player initial to String
                }
                
                if(r-c==1){ //checks one diagonal below the middle diagonal
                    if(grid[r][c] == null)
                         diag2 += "-"; //adds a dash if cell is blank
                    else
                         diag2 += grid[r][c];  //adds the player initial to String
                }
                
                if(r-c==0){//checks the middle diagonal
                    if(grid[r][c] == null)
                         diag3 += "-";
                    else
                         diag3 += grid[r][c];
                }
                
                if(r-c==-1){ //checks one diagonal above the middle diagonal
                    if(grid[r][c] == null)
                         diag4 += "-";
                    else
                         diag4 += grid[r][c];
                }
                
                if(r-c==-2){ //checks two diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag5 += "-";
                    else
                         diag5 += grid[r][c];
                }
                
                if(r-c==-3){  //checks three diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag6 += "-";
                    else
                         diag6 += grid[r][c];
                }
                
                // //check each concatenated diag String to see if it contains a winning streak for black
                // //if so, call the correct diagonal to be highlighted
                
                if(containsAlmostWinningString(diag1, colorInitial)){
                    placeCol(locationAlmostWinning(diag1, colorInitial), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag2, colorInitial)){
                    placeCol(locationAlmostWinning(diag2, colorInitial), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag3, colorInitial)){
                    placeCol(locationAlmostWinning(diag3, colorInitial), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag4, colorInitial)){
                    placeCol(locationAlmostWinning(diag4, colorInitial), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag5, colorInitial)){
                    placeCol(locationAlmostWinning(diag5, colorInitial), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag6, colorInitial)){
                    placeCol(locationAlmostWinning(diag6, colorInitial), colorInitial, image2);
                }
                
                
            }
            
            
        }
        inRow = 0;
        //check for 3 in a row backwards diagonal for player
        diag1="";
        diag2="";
        diag3="";
        diag4="";
        diag5="";
        diag6="";
        //check for diagonal wins starting
        //at bottom left moving up to top right
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                
                if(r+c==3){ //checks the diagonal 2 diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag1 += "-";
                    else
                         diag1 += grid[r][c];
                }
                
                if(r+c==4){  //checks the diagonal 1 diagonal above the middle diagonal
                    if(grid[r][c] == null)
                         diag2 += "-";
                    else
                         diag2 += grid[r][c];
                }
                
                if(r+c==5){  ////checks the middle diagonal 
                    if(grid[r][c] == null)
                         diag3 += "-";
                    else
                         diag3 += grid[r][c];
                }
                
                if(r+c==6){ //checks the diagonal 1 diagonal below the middle diagonal
                    if(grid[r][c] == null)
                         diag4 += "-";
                    else
                         diag4 += grid[r][c];
                }
                
                if(r+c==7){ //checks the diagonal 2 diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag5 += "-";
                    else
                         diag5 += grid[r][c];
                }
                
                if(r+c==8){  //checks the diagonal 3 diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag6 += "-";
                    else
                         diag6 += grid[r][c];
                }
                
                if(containsAlmostWinningString(diag1, colorInitial)){
                    placeCol(locationAlmostWinning(diag1, colorInitial), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag2, colorInitial)){
                    placeCol(locationAlmostWinning(diag2, colorInitial), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag3, colorInitial)){
                    placeCol(locationAlmostWinning(diag3, colorInitial), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag4, colorInitial)){
                    placeCol(locationAlmostWinning(diag4, colorInitial), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag5, colorInitial)){
                    placeCol(locationAlmostWinning(diag5, colorInitial), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag6, colorInitial)){
                    placeCol(locationAlmostWinning(diag6, colorInitial), colorInitial, image2);
                }
                
            }
        
        
         }
         inRow = 0;
         //checks for vertical 3 in a row for opponent
        for(int col = 0; col < grid[0].length; col++){
            for(int row = 0; row < grid.length; row++){
                if(grid[row][col] != null && grid[row][col].equals(opposite)){
                    inRow++;
                    if(inRow == 3 && row > 2 && grid[row-3][col] == null){
                        placeCol(col, colorInitial, image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        //checks for horizontal 3 in a row for opposition
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] != null && grid[row][col].equals(opposite)){
                    inRow++;
                    if(inRow == 3 && col < grid[0].length-1 && grid[row][col+1] == null){
                        placeCol(col + 1,colorInitial,image2);
                    }
                    else if(inRow == 3 && col > 2 && grid[row][col-3] == null){
                        placeCol(col - 3,colorInitial,image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        
        /*
        //check for 3 in a row diagonal opponent
        diag1="";
        diag2="";
        diag3="";
        diag4="";
        diag5="";
        diag6="";
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                
                if(r-c==2){ //checks two diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag1 += "-"; //adds a dash if cell is blank
                    else
                         diag1 += grid[r][c];  //adds the player initial to String
                }
                
                if(r-c==1){ //checks one diagonal below the middle diagonal
                    if(grid[r][c] == null)
                         diag2 += "-"; //adds a dash if cell is blank
                    else
                         diag2 += grid[r][c];  //adds the player initial to String
                }
                
                if(r-c==0){//checks the middle diagonal
                    if(grid[r][c] == null)
                         diag3 += "-";
                    else
                         diag3 += grid[r][c];
                }
                
                if(r-c==-1){ //checks one diagonal above the middle diagonal
                    if(grid[r][c] == null)
                         diag4 += "-";
                    else
                         diag4 += grid[r][c];
                }
                
                if(r-c==-2){ //checks two diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag5 += "-";
                    else
                         diag5 += grid[r][c];
                }
                
                if(r-c==-3){  //checks three diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag6 += "-";
                    else
                         diag6 += grid[r][c];
                }
                
                // //check each concatenated diag String to see if it contains a winning streak for black
                // //if so, call the correct diagonal to be highlighted
                
                if(containsAlmostWinningString(diag1, opposite)){
                    placeCol(locationAlmostWinning(diag1, opposite), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag2, opposite)){
                    placeCol(locationAlmostWinning(diag2, opposite), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag3, opposite)){
                    placeCol(locationAlmostWinning(diag3, opposite), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag4, opposite)){
                    placeCol(locationAlmostWinning(diag4, opposite), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag5, opposite)){
                    placeCol(locationAlmostWinning(diag5, opposite), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag6, opposite)){
                    placeCol(locationAlmostWinning(diag6, opposite), colorInitial, image2);
                }
                
                
            }
            
            
        }
        inRow = 0;
        //check for 3 in a row backwards diagonal for opponent
        diag1="";
        diag2="";
        diag3="";
        diag4="";
        diag5="";
        diag6="";
        //check for diagonal wins starting
        //at bottom left moving up to top right
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                
                if(r+c==3){ //checks the diagonal 2 diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag1 += "-";
                    else
                         diag1 += grid[r][c];
                }
                
                if(r+c==4){  //checks the diagonal 1 diagonal above the middle diagonal
                    if(grid[r][c] == null)
                         diag2 += "-";
                    else
                         diag2 += grid[r][c];
                }
                
                if(r+c==5){  ////checks the middle diagonal 
                    if(grid[r][c] == null)
                         diag3 += "-";
                    else
                         diag3 += grid[r][c];
                }
                
                if(r+c==6){ //checks the diagonal 1 diagonal below the middle diagonal
                    if(grid[r][c] == null)
                         diag4 += "-";
                    else
                         diag4 += grid[r][c];
                }
                
                if(r+c==7){ //checks the diagonal 2 diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag5 += "-";
                    else
                         diag5 += grid[r][c];
                }
                
                if(r+c==8){  //checks the diagonal 3 diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag6 += "-";
                    else
                         diag6 += grid[r][c];
                }
                
                if(containsAlmostWinningString(diag1, opposite)){
                    placeCol(locationAlmostWinning(diag1, opposite), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag2, opposite)){
                    placeCol(locationAlmostWinning(diag2, opposite), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag3, opposite)){
                    placeCol(locationAlmostWinning(diag3, opposite), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag4, opposite)){
                    placeCol(locationAlmostWinning(diag4, opposite), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag5, opposite)){
                    placeCol(locationAlmostWinning(diag5, opposite), colorInitial, image2);
                }
                else if(containsAlmostWinningString(diag6, opposite)){
                    placeCol(locationAlmostWinning(diag6, opposite), colorInitial, image2);
                }
                
            }
        
        
         }
        inRow = 0;
        //check for 2 in a row diagonal opponent
        diag1="";
        diag2="";
        diag3="";
        diag4="";
        diag5="";
        diag6="";
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                
                if(r-c==2){ //checks two diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag1 += "-"; //adds a dash if cell is blank
                    else
                         diag1 += grid[r][c];  //adds the player initial to String
                }
                
                if(r-c==1){ //checks one diagonal below the middle diagonal
                    if(grid[r][c] == null)
                         diag2 += "-"; //adds a dash if cell is blank
                    else
                         diag2 += grid[r][c];  //adds the player initial to String
                }
                
                if(r-c==0){//checks the middle diagonal
                    if(grid[r][c] == null)
                         diag3 += "-";
                    else
                         diag3 += grid[r][c];
                }
                
                if(r-c==-1){ //checks one diagonal above the middle diagonal
                    if(grid[r][c] == null)
                         diag4 += "-";
                    else
                         diag4 += grid[r][c];
                }
                
                if(r-c==-2){ //checks two diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag5 += "-";
                    else
                         diag5 += grid[r][c];
                }
                
                if(r-c==-3){  //checks three diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag6 += "-";
                    else
                         diag6 += grid[r][c];
                }
                
                // //check each concatenated diag String to see if it contains a winning streak for black
                // //if so, call the correct diagonal to be highlighted
                
                if(containsMostWinningString(diag1, opposite)){
                    placeCol(locationMostWinning(diag1, opposite), colorInitial, image2);
                }
                else if(containsMostWinningString(diag2, opposite)){
                    placeCol(locationMostWinning(diag2, opposite), colorInitial, image2);
                }
                else if(containsMostWinningString(diag3, opposite)){
                    placeCol(locationMostWinning(diag3, opposite), colorInitial, image2);
                }
                else if(containsMostWinningString(diag4, opposite)){
                    placeCol(locationMostWinning(diag4, opposite), colorInitial, image2);
                }
                else if(containsMostWinningString(diag5, opposite)){
                    placeCol(locationMostWinning(diag5, opposite), colorInitial, image2);
                }
                else if(containsMostWinningString(diag6, opposite)){
                    placeCol(locationMostWinning(diag6, opposite), colorInitial, image2);
                }
                
                
            }
            
            
        }
        inRow = 0;
        //check for 2 in a row backwards diagonal for opponent
        diag1="";
        diag2="";
        diag3="";
        diag4="";
        diag5="";
        diag6="";
        //check for diagonal wins starting
        //at bottom left moving up to top right
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                
                if(r+c==3){ //checks the diagonal 2 diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag1 += "-";
                    else
                         diag1 += grid[r][c];
                }
                
                if(r+c==4){  //checks the diagonal 1 diagonal above the middle diagonal
                    if(grid[r][c] == null)
                         diag2 += "-";
                    else
                         diag2 += grid[r][c];
                }
                
                if(r+c==5){  ////checks the middle diagonal 
                    if(grid[r][c] == null)
                         diag3 += "-";
                    else
                         diag3 += grid[r][c];
                }
                
                if(r+c==6){ //checks the diagonal 1 diagonal below the middle diagonal
                    if(grid[r][c] == null)
                         diag4 += "-";
                    else
                         diag4 += grid[r][c];
                }
                
                if(r+c==7){ //checks the diagonal 2 diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag5 += "-";
                    else
                         diag5 += grid[r][c];
                }
                
                if(r+c==8){  //checks the diagonal 3 diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag6 += "-";
                    else
                         diag6 += grid[r][c];
                }
                
                if(containsMostWinningString(diag1, opposite)){
                    placeCol(locationMostWinning(diag1, opposite), colorInitial, image2);
                }
                else if(containsMostWinningString(diag2, opposite)){
                    placeCol(locationMostWinning(diag2, opposite), colorInitial, image2);
                }
                else if(containsMostWinningString(diag3, opposite)){
                    placeCol(locationMostWinning(diag3, opposite), colorInitial, image2);
                }
                else if(containsMostWinningString(diag4, opposite)){
                    placeCol(locationMostWinning(diag4, opposite), colorInitial, image2);
                }
                else if(containsMostWinningString(diag5, opposite)){
                    placeCol(locationMostWinning(diag5, opposite), colorInitial, image2);
                }
                else if(containsMostWinningString(diag6, opposite)){
                    placeCol(locationMostWinning(diag6, opposite), colorInitial, image2);
                }
                
            }
        
        
         }*/
        inRow = 0;
        //checks for horizontal 2 in a row for opponent
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] != null && grid[row][col].equals(opposite)){
                    inRow++;
                    if(inRow == 2 && col < grid[0].length-1 && grid[row][col+1] == null){
                        placeCol(col + 1,colorInitial,image2);
                    }
                    else if(inRow == 2 && col > 1 && grid[row][col-2] == null){
                        placeCol(col - 2,colorInitial,image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        //checks for vertical 2 in a row for opponent
        for(int col = 0; col < grid[0].length; col++){
            for(int row = 0; row < grid.length; row++){
                if(grid[row][col] != null && grid[row][col].equals(opposite)){
                    inRow++;
                    if(inRow == 2 && row > 1 && grid[row-2][col] == null){
                        placeCol(col, colorInitial, image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        //checks for horizontal 2 in a row for player
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] != null && grid[row][col].equals(colorInitial)){
                    inRow++;
                    if(inRow == 2 && col < grid[0].length-1 && grid[row][col+1] == null){
                        placeCol(col + 1,colorInitial,image2);
                    }
                    else if(inRow == 2 && col > 1 && grid[row][col-2] == null){
                        placeCol(col - 2,colorInitial,image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        //checks for vertical 2 in a row for player
        for(int col = 0; col < grid[0].length; col++){
            for(int row = 0; row < grid.length; row++){
                if(grid[row][col] != null && grid[row][col].equals(colorInitial)){
                    inRow++;
                    if(inRow == 2 && row > 1 && grid[row-2][col] == null){
                        placeCol(col, colorInitial, image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        diag1="";
        diag2="";
        diag3="";
        diag4="";
        diag5="";
        diag6="";
        //check for 2 in a row diagonal for player
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                
                if(r-c==2){ //checks two diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag1 += "-"; //adds a dash if cell is blank
                    else
                         diag1 += grid[r][c];  //adds the player initial to String
                }
                
                if(r-c==1){ //checks one diagonal below the middle diagonal
                    if(grid[r][c] == null)
                         diag2 += "-"; //adds a dash if cell is blank
                    else
                         diag2 += grid[r][c];  //adds the player initial to String
                }
                
                if(r-c==0){//checks the middle diagonal
                    if(grid[r][c] == null)
                         diag3 += "-";
                    else
                         diag3 += grid[r][c];
                }
                
                if(r-c==-1){ //checks one diagonal above the middle diagonal
                    if(grid[r][c] == null)
                         diag4 += "-";
                    else
                         diag4 += grid[r][c];
                }
                
                if(r-c==-2){ //checks two diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag5 += "-";
                    else
                         diag5 += grid[r][c];
                }
                
                if(r-c==-3){  //checks three diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag6 += "-";
                    else
                         diag6 += grid[r][c];
                }
                
                // //check each concatenated diag String to see if it contains a winning streak for black
                // //if so, call the correct diagonal to be highlighted
                
                if(containsMostWinningString(diag1, colorInitial)){
                    placeCol(locationMostWinning(diag1, colorInitial), colorInitial, image2);
                }
                else if(containsMostWinningString(diag2, colorInitial)){
                    placeCol(locationMostWinning(diag2, colorInitial), colorInitial, image2);
                }
                else if(containsMostWinningString(diag3, colorInitial)){
                    placeCol(locationMostWinning(diag3, colorInitial), colorInitial, image2);
                }
                else if(containsMostWinningString(diag4, colorInitial)){
                    placeCol(locationMostWinning(diag4, colorInitial), colorInitial, image2);
                }
                else if(containsMostWinningString(diag5, colorInitial)){
                    placeCol(locationMostWinning(diag5, colorInitial), colorInitial, image2);
                }
                else if(containsMostWinningString(diag6, colorInitial)){
                    placeCol(locationMostWinning(diag6, colorInitial), colorInitial, image2);
                }
                
                
            }
            
            
        }
        inRow = 0;
        //check for 2 in a row backwards diagonal for player
        diag1="";
        diag2="";
        diag3="";
        diag4="";
        diag5="";
        diag6="";
        //check for diagonal wins starting
        //at bottom left moving up to top right
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                
                if(r+c==3){ //checks the diagonal 2 diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag1 += "-";
                    else
                         diag1 += grid[r][c];
                }
                
                if(r+c==4){  //checks the diagonal 1 diagonal above the middle diagonal
                    if(grid[r][c] == null)
                         diag2 += "-";
                    else
                         diag2 += grid[r][c];
                }
                
                if(r+c==5){  ////checks the middle diagonal 
                    if(grid[r][c] == null)
                         diag3 += "-";
                    else
                         diag3 += grid[r][c];
                }
                
                if(r+c==6){ //checks the diagonal 1 diagonal below the middle diagonal
                    if(grid[r][c] == null)
                         diag4 += "-";
                    else
                         diag4 += grid[r][c];
                }
                
                if(r+c==7){ //checks the diagonal 2 diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag5 += "-";
                    else
                         diag5 += grid[r][c];
                }
                
                if(r+c==8){  //checks the diagonal 3 diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag6 += "-";
                    else
                         diag6 += grid[r][c];
                }
                
                if(containsMostWinningString(diag1, colorInitial)){
                    placeCol(locationMostWinning(diag1, colorInitial), colorInitial, image2);
                }
                else if(containsMostWinningString(diag2, colorInitial)){
                    placeCol(locationMostWinning(diag2, colorInitial), colorInitial, image2);
                }
                else if(containsMostWinningString(diag3, colorInitial)){
                    placeCol(locationMostWinning(diag3, colorInitial), colorInitial, image2);
                }
                else if(containsMostWinningString(diag4, colorInitial)){
                    placeCol(locationMostWinning(diag4, colorInitial), colorInitial, image2);
                }
                else if(containsMostWinningString(diag5, colorInitial)){
                    placeCol(locationMostWinning(diag5, colorInitial), colorInitial, image2);
                }
                else if(containsMostWinningString(diag6, colorInitial)){
                    placeCol(locationMostWinning(diag6, colorInitial), colorInitial, image2);
                }
                
            }
        
        
         }
        inRow = 0;
        //checks for horizontal 1 for player
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] != null && grid[row][col].equals(colorInitial)){
                    inRow++;
                    if(inRow == 1 && col < grid[0].length-1 && grid[row][col+1] == null){
                        placeCol(col + 1,colorInitial,image2);
                    }
                    else if(inRow == 1 && col > 0 && grid[row][col-1] == null){
                        placeCol(col - 1,colorInitial,image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        //checks for vertical 1 for player
        for(int col = 0; col < grid[0].length; col++){
            for(int row = 0; row < grid.length; row++){
                if(grid[row][col] != null && grid[row][col].equals(colorInitial)){
                    inRow++;
                    if(inRow == 1 && row > 0 && grid[row-1][col] == null){
                        placeCol(col, colorInitial, image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        //checks for horizontal 1 for opposite
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] != null && grid[row][col].equals(opposite)){
                    inRow++;
                    if(inRow == 1 && col < grid[0].length-1 && grid[row][col+1] == null){
                        placeCol(col + 1,colorInitial,image2);
                    }
                    else if(inRow == 1 && col > 0 && grid[row][col-1] == null){
                        placeCol(col - 1,colorInitial,image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        //checks for vertical 1 for opposite
        for(int col = 0; col < grid[0].length; col++){
            for(int row = 0; row < grid.length; row++){
                if(grid[row][col] != null && grid[row][col].equals(opposite)){
                    inRow++;
                    if(inRow == 1 && row > 0 && grid[row-1][col] == null){
                        placeCol(col, colorInitial, image2);
                    }
                }
                else{
                    inRow = 0;
                }
            }
        }
        inRow = 0;
        //BACKUP PLAN
        //placeCol(colToPlace,colorInitial,image1);  plays in the specified col and fills the 2D array with the 2nd parameter String
        if(grid[0][6]==null)
        {
            placeCol(6,colorInitial,image2);
        }
        else if(grid[0][5]==null)
        {
            placeCol(5,colorInitial,image2);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        else if(grid[0][4]==null)
        {
            placeCol(4,colorInitial,image2);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        else if(grid[0][3]==null)
        {
            placeCol(3,colorInitial,image2);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        else if(grid[0][2]==null)
        {
            placeCol(2,colorInitial,image2);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        else if(grid[0][1]==null)
        {
            placeCol(1,colorInitial,image2);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        else
        {
            placeCol(0,colorInitial,image2);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        placeCol(0,colorInitial,image2);
        //placeCol((int)(Math.random()*3) + 2, colorInitial, image2);
    }
    public boolean containsAlmostWinningString(String str, String playInit){
        
        //checks if a string contains four identical initials in a row
        return str.contains(playInit+playInit+playInit);
        
    }
    public boolean containsMostWinningString(String str, String playInit){
        
        //checks if a string contains four identical initials in a row
        return str.contains(playInit+playInit);
        
    }
    public int locationAlmostWinning(String str, String playInit){
        
        if(str.contains("-" + playInit+playInit+playInit)){
            return str.indexOf("-" + playInit+playInit+playInit);
        }
        else if(str.contains(playInit+playInit+playInit + "-")){
            return str.indexOf("-");
        }
        return (int)(Math.random()*3) + 2;
        //checks if a string contains four identical initials in a row
        
        
    }
    public int locationMostWinning(String str, String playInit){
        if(str.contains("-" + playInit+playInit)){
            return str.indexOf("-" + playInit+playInit);
        }
        else if(str.contains(playInit+playInit + "-")){
            return str.indexOf("-");
        }
        return (int)(Math.random()*3) + 2;
    }
    
    public void playerRedStrategy(){
        //leave these top 3 lines at the top
        playerRed = "Janet";  //put your name here
        showText(playerRed,getWidth()-70,100); //shows your name
        GreenfootImage image1 = new GreenfootImage("red.png");  //sets image to red checker
        String colorInitial = new String("r");  //fills the 2d array grid with this value
        String enemy = new String("b");
        
        
        
        
        //replace the following code with your strategy
        //but the second line shows you how to place your checker
        int colToPlace = (int)(Math.random()*7);
        
        placeCol(colToPlace,colorInitial,image1);  //plays in the specified col and fills the 2D array with the 2nd parameter String
         
        
        
        
       //were working on this strat ya dumb
       
        //leave these top 4 lines at the top
        
        //replace the following code with your strategy
        //but the second line shows you how to place your checker
        //int colToPlace = (int)(Math.random()*7);

        //strat 1        

        //vertical checker
        /* for(int c = 0; c < grid[0].length; c++)
        {

        String temp = grid[0][c];
        if(temp!=null)
        {
        if(grid[3][c].equals("r")&&grid[4][c].equals("r") &&grid[5][c].equals("r"))
        {
        placeCol(c,colorInitial,image1);
        }

        }
        
        }*/
        
        
        //strat 2
        if(grid[0][6]==null)
        {
            placeCol(6,colorInitial,image1);
        }
        else if(grid[0][5]==null)
        {
            placeCol(5,colorInitial,image1);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        else if(grid[0][4]==null)
        {
            placeCol(4,colorInitial,image1);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        else if(grid[0][3]==null)
        {
            placeCol(3,colorInitial,image1);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        else if(grid[0][2]==null)
        {
            placeCol(2,colorInitial,image1);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        else if(grid[0][1]==null)
        {
            placeCol(1,colorInitial,image1);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        else
        {
            placeCol(0,colorInitial,image1);  //plays in the specified col and fills the 2D array with the 2nd parameter String
        }
        placeCol(0,colorInitial,image1);

            
        
        
        
        
        
        
        
    }
    
    public void placeCol(int column,String teamInitial, GreenfootImage color){
        
        
            
        if(!lastPlayedInitial.equals(teamInitial)){//ensures placeCol() can only be called once per player per turn
        
        //places checker and updates grid
            if(grid[0][column] == null){//makes sure there is a place to play, if not a random col is selected
                addObject(new Checker(column,color),col1x+(column * colDiff),col1y);
                grid[0][column] = teamInitial; //adds initial to 2d grid
                dropGrid(); //drops teamInitial down the column to bottom
            }
            else{//a random column is selected
                
                placeCol((int)(Math.random()*7),teamInitial, color);
                
            }
        
        }
    
        
        
        
        
        lastPlayedInitial = teamInitial;
        
    }
    
    private void dropGrid()
    {
        
        //drops new "b" or "r" to its new location in grid
        int moveToRow = 0;
        for(int c = 0; c < grid[0].length;c++)
        {
            for(int r = 0; r < grid.length - 1;r++)
            {
                if(grid[r][c] != null && grid[r + 1][c] == null)
                {
                    grid[r+1][c] = grid[r][c];
                    grid[r][c] = null;
                }
                else if(grid[r][c] != null && grid[r + 1][c] != null)
                {
                    r+=8;
                }
            }
        }
        
        
        
        
    }
    
    public String checkForWinner(){
        
        //easier to build a String from the 2d array grid, and then check for consecutive initials
        String checkersAsAString = new String();
       
        //check each row for a winner, starting at bottom
        for(int r = grid.length - 1; r >= 0; r--){
            checkersAsAString = ""; //reset String for each row
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == null)
                    checkersAsAString+="-";//adds dash to the String if cell is empty
                else
                    checkersAsAString+= grid[r][c]; //adds player initial to String
            
                if(checkersAsAString.contains(playerBlackInitial+playerBlackInitial+playerBlackInitial+playerBlackInitial))
                {
                    circleRow(r,checkersAsAString, playerBlackInitial);  //calls the winning row to be circled
                    return playerBlackInitial;
                }
                else if(checkersAsAString.contains(playerRedInitial+playerRedInitial+playerRedInitial+playerRedInitial))
                {
                    circleRow(r,checkersAsAString, playerRedInitial); //calls the winning row to be circled
                    return playerRedInitial;
                }
            }
        }
        
        
        //check each column for a winner
        for(int c = 0; c < grid[0].length; c++){
            checkersAsAString = "";  //reset String for each column
            for(int r = grid.length - 1; r >= 0; r--){
                if(grid[r][c] == null)
                    checkersAsAString+="-"; //adds dash to the String if cell is empty
                else
                    checkersAsAString+= grid[r][c]; //adds the initial to the String
            
                if(checkersAsAString.contains(playerBlackInitial+playerBlackInitial+playerBlackInitial+playerBlackInitial))
                {
                    circleColumn(c,checkersAsAString,playerBlackInitial);   //highlights winning column
                    return playerBlackInitial;
                }
                else if(checkersAsAString.contains(playerRedInitial+playerRedInitial+playerRedInitial+playerRedInitial))
                {
                    circleColumn(c,checkersAsAString,playerRedInitial);  //highlights winning column
                    return playerRedInitial;
                }
            }
        }
        
        
        //checks for diagonal winner
        //this checks for diagonal starting at bottom right, moving to top left
        String diag1 = new String();  //Six new Strings to be built
        String diag2 = new String();  //for each possible diagonal to win 
        String diag3 = new String();
        String diag4 = new String();
        String diag5 = new String();
        String diag6 = new String();
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                
                if(r-c==2){ //checks two diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag1 += "-"; //adds a dash if cell is blank
                    else
                         diag1 += grid[r][c]; //adds the player initial to String
                }
                
                if(r-c==1){ //checks one diagonal below the middle diagonal
                    if(grid[r][c] == null)
                         diag2 += "-"; //adds a dash if cell is blank
                    else
                         diag2 += grid[r][c];  //adds the player initial to String
                }
                
                if(r-c==0){//checks the middle diagonal
                    if(grid[r][c] == null)
                         diag3 += "-";
                    else
                         diag3 += grid[r][c];
                }
                
                if(r-c==-1){ //checks one diagonal above the middle diagonal
                    if(grid[r][c] == null)
                         diag4 += "-";
                    else
                         diag4 += grid[r][c];
                }
                
                if(r-c==-2){ //checks two diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag5 += "-";
                    else
                         diag5 += grid[r][c];
                }
                
                if(r-c==-3){  //checks three diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag6 += "-";
                    else
                         diag6 += grid[r][c];
                }
                
                // //check each concatenated diag String to see if it contains a winning streak for black
                // //if so, call the correct diagonal to be highlighted
                if(containsWinningString(diag1, playerBlackInitial)){
                    circleDiagonal(1,diag1,playerBlackInitial);  //highlight the winning diagonal
                    return playerBlackInitial;
                }
                else if(containsWinningString(diag2, playerBlackInitial)){
                    circleDiagonal(2,diag2,playerBlackInitial);
                    return playerBlackInitial;
                }
                else if(containsWinningString(diag3, playerBlackInitial)){
                    circleDiagonal(3,diag3,playerBlackInitial);
                    return playerBlackInitial;
                }
                else if(containsWinningString(diag4, playerBlackInitial)){
                    circleDiagonal(4,diag4,playerBlackInitial);
                    return playerBlackInitial;
                }
                else if(containsWinningString(diag5, playerBlackInitial)){
                    circleDiagonal(5,diag5,playerBlackInitial);
                    return playerBlackInitial;
                }
                else if(containsWinningString(diag6, playerBlackInitial)){
                    circleDiagonal(6,diag6,playerBlackInitial);
                    return playerBlackInitial;
                }
                
                //same as above but checking to see if red is the winner
                if(containsWinningString(diag1, playerRedInitial)){
                    circleDiagonal(1,diag1,playerRedInitial);
                    return playerRedInitial;
                }
                else if(containsWinningString(diag2, playerRedInitial)){
                    circleDiagonal(2,diag2,playerRedInitial);
                    return playerRedInitial;
                }
                else if(containsWinningString(diag3, playerRedInitial)){
                    circleDiagonal(3,diag3,playerRedInitial);
                    return playerRedInitial;
                }
                else if(containsWinningString(diag4, playerRedInitial)){
                    circleDiagonal(4,diag4,playerRedInitial);
                    return playerRedInitial;
                }
                else if(containsWinningString(diag5, playerRedInitial)){
                    circleDiagonal(5,diag5,playerRedInitial);
                    return playerRedInitial;
                }
                else if(containsWinningString(diag6, playerBlackInitial)){
                    circleDiagonal(6,diag6,playerRedInitial);
                    return playerRedInitial;
                }
                
            }
            
            
        }
        
        
        //reset diagonal Strings so we can now check for diagonal wins starting
        //at bottom left moving up to top right
        diag1="";
        diag2="";
        diag3="";
        diag4="";
        diag5="";
        diag6="";
        //check for diagonal wins starting
        //at bottom left moving up to top right
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                
                if(r+c==3){ //checks the diagonal 2 diagonals above the middle diagonal
                    if(grid[r][c] == null)
                         diag1 += "-";
                    else
                         diag1 += grid[r][c];
                }
                
                if(r+c==4){  //checks the diagonal 1 diagonal above the middle diagonal
                    if(grid[r][c] == null)
                         diag2 += "-";
                    else
                         diag2 += grid[r][c];
                }
                
                if(r+c==5){  ////checks the middle diagonal 
                    if(grid[r][c] == null)
                         diag3 += "-";
                    else
                         diag3 += grid[r][c];
                }
                
                if(r+c==6){ //checks the diagonal 1 diagonal below the middle diagonal
                    if(grid[r][c] == null)
                         diag4 += "-";
                    else
                         diag4 += grid[r][c];
                }
                
                if(r+c==7){ //checks the diagonal 2 diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag5 += "-";
                    else
                         diag5 += grid[r][c];
                }
                
                if(r+c==8){  //checks the diagonal 3 diagonals below the middle diagonal
                    if(grid[r][c] == null)
                         diag6 += "-";
                    else
                         diag6 += grid[r][c];
                }
                
                
                //checks each concatenated String to see if it contains a win 
                //streak for black
                if(containsWinningString(diag1, playerBlackInitial)){
                    circleBackwardsDiagonal(1,diag1,playerBlackInitial);
                    return playerBlackInitial;
                }
                else if(containsWinningString(diag2, playerBlackInitial)){
                    circleBackwardsDiagonal(2,diag2,playerBlackInitial);
                    return playerBlackInitial;
                }
                else if(containsWinningString(diag3, playerBlackInitial)){
                    circleBackwardsDiagonal(3,diag3,playerBlackInitial);
                    return playerBlackInitial;
                }
                else if(containsWinningString(diag4, playerBlackInitial)){
                    circleBackwardsDiagonal(4,diag4,playerBlackInitial);
                    return playerBlackInitial;
                }
                else if(containsWinningString(diag5, playerBlackInitial)){
                    circleBackwardsDiagonal(5,diag5,playerBlackInitial);
                    return playerBlackInitial;
                }
                else if(containsWinningString(diag6, playerBlackInitial)){
                    circleBackwardsDiagonal(6,diag6,playerBlackInitial);
                    return playerBlackInitial;
                }
                
                //checks each concatenated String to see if it contains a win 
                //streak for red
                if(containsWinningString(diag1, playerRedInitial)){
                    circleBackwardsDiagonal(1,diag1,playerRedInitial);
                    return playerRedInitial;
                }
                else if(containsWinningString(diag2, playerRedInitial)){
                    circleBackwardsDiagonal(2,diag2,playerRedInitial);
                    return playerRedInitial;
                }
                else if(containsWinningString(diag3, playerRedInitial)){
                    circleBackwardsDiagonal(3,diag3,playerRedInitial);
                    return playerRedInitial;
                }
                else if(containsWinningString(diag4, playerRedInitial)){
                    circleBackwardsDiagonal(4,diag4,playerRedInitial);
                    return playerRedInitial;
                }
                else if(containsWinningString(diag5, playerRedInitial)){
                    circleBackwardsDiagonal(5,diag5,playerRedInitial);
                    return playerRedInitial;
                }
                else if(containsWinningString(diag6, playerBlackInitial)){
                    circleBackwardsDiagonal(6,diag6,playerRedInitial);
                    return playerRedInitial;
                }
                
            }
        
        
         }
    
        return null; //returns null if there is no winner
    
    }

    public void circleDiagonal(int diag,String str, String initial){
        //adds the rainbow rings to the correct locations after a win
        
        int c = 0; //dictates the first column in the diagonal to be circled
        int r = 0; //dicates the first row in the diagonal to be circled
        
        int start = str.indexOf(initial+initial+initial+initial);
        
        
        //the steps below set the starting row and column,
        //depending on which diagonal and which indexOf the streak was found
        if(diag==1){
            r=2;
            c=0;
        }
        else if(diag==2 && start == 0){
            r=1;
            c=0;
        }
        else if(diag==2 && start == 1){
            r=2;
            c=1;
        }
        else if(diag==3 && start == 0){
            r=0;
            c=0;
        }
        else if(diag==3 && start == 1){
            r=1;
            c=1;
        }
        else if(diag==3 && start == 2){
            r=2;
            c=2;
        }
        else if(diag==4 && start == 0){
            r=0;
            c=1;
        }
        else if(diag==4 && start == 1){
            r=1;
            c=2;
        }
        else if(diag==4 && start == 2){
            r=2;
            c=3;
        }
        else if(diag==5 && start == 0){
            r=0;
            c=2;
        }
        else if(diag==5 && start == 1){
            r=1;
            c=3;
        }
        else if(diag==6){
            r=0;
            c=3;
        }
        
        
        
        for(int i=start; i < start + 4; i++){
            //places a ring at each correct x,y location
            //according to the rows and columns needed
            addObject(new Ring(),col1x+(c * colDiff),col1y+(r+1)*38);
            c++;
            r++;
        }
        //}
    }
    
    
    public void circleBackwardsDiagonal(int diag, String str, String initial){
        //adds the rainbow rings to the correct locations after a win
        
        int c = 0; //dictates the first column in the diagonal to be circled
        int r = 5; //dicates the first row in the diagonal to be circled
        int repeat = 6; //dicates how many rainbow rings are needed
        int start = str.indexOf(initial+initial+initial+initial);
        
        
        
        //the steps below set the starting row and column,
        //depending on which diagonal and which indexOf the streak was found
        if(diag==1){
            r=3;
            c=0;
        }
        else if(diag==2 && start==0){
            r=3;
            c=1;
        }
        else if(diag==2 && start==1){
            r=4;
            c=0;
        }
        else if(diag==3 && start==0){
            r=3;
            c=2;
        }
        else if(diag==3 && start==1){
            r=4;
            c=1;
        }
        else if(diag==3 && start==2){
            r=5;
            c=0;
        }
        else if(diag==4 && start==2){
            r=5;
            c=1;
        }
        else if(diag==4 && start==1){
            r=4;
            c=2;
        }
        else if(diag==4 && start==0){
            r=3;
            c=3;
        }
        else if(diag==5 && start==0){
            r=4;
            c=3;
        }
        else if(diag==5 && start==1){
            r=5;
            c=2;
        }
        else if(diag==6){
            r=5;
            c=3;
        }
        
        
         
        for(int i=start; i < start+4; i++){
            //places a ring at each correct x,y location
            //according to the rows and columns needed
            addObject(new Ring(),col1x+(c * colDiff),col1y+(r+1)*38);
            c++;
            r--;
        }
        //}
    }
    
    
    
    
    public void circleRow(int r, String str, String initial){
        //adds the rainbow rings to the correct locations after a win
        
        //check the indexOf so we know where the winner rings should start
        int start = str.indexOf(initial+initial+initial+initial);
        
        for(int c = start; c < start+4; c++){
            addObject(new Ring(),col1x+(c * colDiff),col1y+(r+1)*38);
            
        }
    }
    
    
    public void circleColumn(int c, String str, String initial){
        
        //adds the rainbow rings to the correct locations after a win
        
        int start = str.indexOf(initial+initial+initial+initial);
        if(start==2)
            start = 0;
        else if(start==0)
            start = 2;
        
        
            
        for(int r = start; r < start + 4; r++){
            addObject(new Ring(),col1x+(c * colDiff),col1y+(r+1)*38);
            
        }
    }
    
    
    
    public boolean containsWinningString(String str, String playInit){
        
        //checks if a string contains four identical initials in a row
        return str.contains(playInit+playInit+playInit+playInit);
        
    }
    
    
    public boolean tie()
    {
        //if there is a null in the grid, there is not a tie
        for(int i = 0;i<grid[0].length;i++)
        {
            if(grid[0][i]==null)
            {
                return false;
            }
        }
        tieCounter++;
        
        showText("Ties: " + tieCounter/actCounter,getWidth()/2,370); //shows number of ties
        
        
        
        
        
        return true;
    }
    
    public void showPlayer1Winner(){
        //adds 1 to player1 total wins
        playerBlackWinTotal+=1;
        
        //divides by actCounter since this code 
        //runs actCounter times before game is cleared
        int wins = playerBlackWinTotal/actCounter;
        int wins1 = playerRedWinTotal/actCounter;
        int games = wins + wins1 ;
        
        
    
        //calculates and shows all the stats
        showText("Wins: " + wins,70,130); //shows the total wins
        double winPercentage = (double)(wins)/(games);
        double winPercentageRounded = 100*Math.round(winPercentage*1000)/1000.0;
        showText(winPercentageRounded + "%",70,160); //shows the total win %
        double opponentPercentage = Math.round((100.0-winPercentageRounded)*1000)/1000.0;
        showText(opponentPercentage + "%",getWidth()-70,160); //shows the total win % for other player
    
        addObject(new BigRing(),70,130); //highlights winning name
        
        
    
        
        
    }
    
    public void showPlayer2Winner(){
        
        //adds 1 to player2 total wins
        playerRedWinTotal+=1;
        
        //divides by actCounter since this code 
        //runs actCounter times before game is cleared
        int wins = playerBlackWinTotal/actCounter;
        int wins1 = playerRedWinTotal/actCounter;
        int games = wins + wins1 ;
        
        
        
        //calculates and shows all the stats
        showText("Wins: " + wins1,getWidth()-70,130); //shows the total wins
        double winPercentage = (double)(wins1)/(games);
        double winPercentageRounded = 100*Math.round(winPercentage*1000)/1000.0;
        showText(winPercentageRounded + "%",getWidth()-70,160); //shows the total win %
        double opponentPercentage = Math.round((100.0-winPercentageRounded)*1000)/1000.0;
        showText(opponentPercentage + "%",70,160); //shows the total win % for other player
    
        addObject(new BigRing(),getWidth()-70,130); //highlights winning name
        
        
    
    }
    
    public void resetGrid(){
        //resets 2d array after a victory
         for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
            
            grid[r][c] = null;
            
            
            }
            
        }
        
        
    }
    
    public void resetGame(){
        
        gameCounter++;
        showText("Games played : " + gameCounter,getWidth()/2,15); //shows number of games
        
        
        //clears all checkers, rings, and board
        List objects = getObjects(null);
        removeObjects(objects);
        
        addObject(new Board(),300,200); //adds game board
        
        resetGrid(); //clears 2d array
        firstPlay = true; //resets firstPlay to true
        lastPlayedInitial = ""; //allows the first player of the next game to alternate
        playerTurn = 0;
        //so the first player of each game will alternate
        
    }
    
    
    public String[][] getGrid(){
        return this.grid;
    }
}



