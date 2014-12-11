/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author Jack Navin-Weinstein
 * @version Thurs 11 December
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;


public class Lab10 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
		 Athlete athena = new Athlete();
 		 clearMaze(athena);
	    
    }
	 
	   
		 
    public static void clearMaze(Athlete arg){
     while (!arg.nextToABeeper()){
      
       if (arg.frontIsClear() && !arg.leftIsClear()){
       arg.move();
       }
       
       if (arg.leftIsClear()){
       arg.turnLeft();
       arg.move();
       }
       
       if (!arg.frontIsClear()&&!arg.leftIsClear()&&arg.rightIsClear()){
       arg.turnRight();
       arg.move();
       }
       
       if (!arg.frontIsClear()&&!arg.leftIsClear()&&!arg.rightIsClear()){
       arg.turnAround();
       arg.move();
       }
     }
    }
} 

      
                
         
	   
      
		 //TODO Write an algorithm that directs arg to the beeper at the end of the maze
	 
