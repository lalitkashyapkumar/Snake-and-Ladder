# Snake-and-Ladder
It is a "Snake and Ladder" game developed in Java. This project illustrates how we can use basic data Structure like an array to create a DSA project.
For the GUI I had used "awt and swing" library of java.

![gui](https://github.com/lalitkashyapkumar/Snake-and-Ladder/blob/master/src/images/image1.png)

## Working
In the src folder, there is basically 4 modules available Main.java, Scene.java, Playbutton.java.java, and Play.java
### Main.java
    As the name suggests it contains your main class and calls the scene and other class to create
    the GUI and enable the game application to work and it also contains the function for moving the 
    coin on the board.
### Scene.java
    This module creates a JPanel background scene that is visible to us as Snake and Ladder board and
    it also creates a Dice score section below the board.
### Playbutton.java
    Playbutton module is used to create the customize button in Java. It creates a circular button 
    instead of a rectangular one. It is used to create the Dice roller button and also it is used 
    for creating a System and Player Coin-like button in red and green color.
### Play.java
    This is the last module, it receives an array and position of the coin from the main method, and
    then it generates a random number between 1 and 6 (inclusive) and then by adding this pseudo-random
    number to the previous position of coin check is there any ladder or Snake exist on new position if
    exist then return the value that is stored in an array on that location but before checking these 
    things we also check new position does not exceed more 99 if the new position is 99 the Winner is 
    declared otherwise 0 is returned by the function or if on that position if there is no snake and 
    ladder and also not exceeding 99 then just return the that generated random number.
    
![winnerGui](https://github.com/lalitkashyapkumar/Snake-and-Ladder/blob/master/src/images/image2.png)
