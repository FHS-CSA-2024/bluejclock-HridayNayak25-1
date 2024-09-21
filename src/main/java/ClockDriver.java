package src.main.java;
import java.lang.String;
public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00

        System.out.println("testing clock display");

        ClockDisplay test1 = new ClockDisplay();

        String test1Output = test1.getTime();

        System.out.println("\tempty Can.Test-" + test1Output);

        ClockDisplay test2 = new ClockDisplay (2,45);

        String test2Output = test2.getTime();

        System.out.println("\t2 Arg Con. Test -  " + test2Output);

        ClockDisplay test3 = new ClockDisplay (12,45);

        String test3Output = test3.getTime();

        System.out.println("\t Set Time Test - " + test3Output);
        // TODO: Read time and tick timetests
        ClockDisplay tickTest =  new ClockDisplay (3, 32);

        String tickTest1Output = tickTest.getTime();

        System.out.println("\tTickTest Before increment - "+ tickTest1Output);

        tickTest.timeTick();

        tickTest1Output = tickTest.getTime();

        System.out.println("\tTickTest1 After increment - " + test2Output);
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00

        ClockDisplaySeconds emptyConTest = new ClockDisplaySeconds();
        System.out.println("Seconds empty con test: " + emptyConTest.getTime());
        
        
        
        System.out.println("testing clock display for seconds");

        ClockDisplaySeconds testsec1 = new ClockDisplaySeconds();

        String testSecOutput = testsec1.getTime();

        System.out.println("\tempty Can.Test-" + testSecOutput);

        ClockDisplaySeconds testsec2 = new ClockDisplaySeconds(2,45,48);

        String testsecOutput2 = testsec2.getTime();

        System.out.println("\t2 Arg Con. Test -  " + testsecOutput2);

        ClockDisplaySeconds testsec3 = new ClockDisplaySeconds(12,45,55);

        String testsecOutput3 = testsec3.getTime();

        System.out.println("\t Set Time Test - " + testsecOutput3);
        // TODO: Read time and tick timetests
        
        //test 1
        ClockDisplaySeconds tickTestSeconds =  new ClockDisplaySeconds(3,32,59);

        String tickTestSecO1 = tickTestSeconds.getTime();

        System.out.println("\tTickTest Before increment - "+ tickTestSecO1);

        tickTestSeconds.timeTickSeconds();

        tickTestSecO1 = tickTestSeconds.getTime();

        System.out.println("\tTickTest1 After increment - " + tickTestSecO1);
        
        //test 2
        ClockDisplaySeconds tickTestSeconds1 =  new ClockDisplaySeconds(1,00,59);

        String tickTestSecO2 = tickTestSeconds1.getTime();

        System.out.println("\tTickTest Before increment - "+ tickTestSecO2);

        tickTestSeconds1.timeTickSeconds();

        tickTestSecO2 = tickTestSeconds1.getTime();

        System.out.println("\tTickTest1 After increment - " + tickTestSecO2);
        
        
        
        
        //test 3
        
        ClockDisplaySeconds tickTestSeconds3 =  new ClockDisplaySeconds(1,59,59);

        String tickTestSecO3 = tickTestSeconds3.getTime();

        System.out.println("\tTickTest Before increment - "+ tickTestSecO3);

        tickTestSeconds3.timeTickSeconds();

        tickTestSecO3 = tickTestSeconds.getTime();

        System.out.println("\tTickTest1 After increment - " + tickTestSecO3);
        
        //test 4
        ClockDisplaySeconds tickTestSeconds4 =  new ClockDisplaySeconds(3,32,59);

        String tickTestSecO4 = tickTestSeconds4.getTime();

        System.out.println("\tTickTest Before increment - "+ tickTestSecO4);

        tickTestSeconds4.timeTickSeconds();

        tickTestSecO4 = tickTestSeconds4.getTime();

        System.out.println("\tTickTest1 After increment - " + tickTestSecO4);
        
        
        
        
        

        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}
