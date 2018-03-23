/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exactohackerprogram;

import java.util.Scanner;

/*import exactohackerprogram.ComboLockSim;*/

// THIS IS A GIT PROJECT COMMENT FROM MY LAPTOP

/**
 *
 * @author thecoderschool
 */
public class ExactoHackerProgram {
    /**
     * @param args the command line arguments
     * 
     */
    int passwordText;
    private static String silence;
    double max = 9999;
    String username = "Vishal Yathish";
    
     public boolean openLock(String combination) {
        if (combination.equals(this.username)) {
            return true;
        }else {
        //System.out.println(this.silence);
        return false;
        }
    } 

     
    public boolean correctUsername(String username) {
        if (username.equals(this.silence)) {
            return true;
        }else {
        //System.out.println(this.silence);
        return false;
        }
    } 
    
    public ExactoHackerProgram() {
        this.silence = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989380952572010654858632788659361533818279682303019520353018529689957736225994138912497217752834791315155748572424541506959508295331168617278558890750983817546374649393192550604009277016711390098488240128583616035637076601047101819429555961989467678374494482553797747268471040475346462080466842590694912933136770289891521047521620569660240580";
    }
    
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        System.out.println("Print username below:");
        
        String enteredUsername = sc01.next();
        
        ExactoHackerProgram myUsername = new ExactoHackerProgram();
        
        boolean checkUsername =  myUsername.correctUsername(enteredUsername);
        
        if (checkUsername) {
            System.out.println("next -->");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Print password below:");
        
            ExactoHackerProgram myLock = new ExactoHackerProgram();
        

            String comboFailure = sc.next();
            boolean isOpen = myLock.openLock(comboFailure);
        
            if (isOpen) {
            System.out.println("click");
            } else {
            System.out.println("You are a complete and utter loser");
            }
        } else {
             System.out.println("You are a complete and utter loser");
        
        }
        }
    }
    
    /* STEPS FOR THE PROGRAM (4 VERY VERY VERY VERY VERY HARD STEPS):
    ********** 1) FIND WHERE THE PASSWORD IS LOCATED 
    2) TAKE IT APART INTO ITS SEPERATE DIGIT VALUES
    3) COMPARE EACH VALUE WITH ALL OTHER 61 OPTIONS
    4) PUT THE FINAL PRODUCT TOGETHER INTO A SINGLE VARIABLE
    
    */
    

