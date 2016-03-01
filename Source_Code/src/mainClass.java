import java.util.Scanner;
public class mainClass {
    public static void main(String[] args){
        MDA_EFSM mda = new MDA_EFSM();       
        Scanner in = new Scanner(System.in);
        
        //Menu options
        System.out.println("\tSELECT GP-1, GP-2 OR GP-3:\n");
        System.out.println("\t1. GP-1\n\t2. GP-2\n\t3. GP-3\n");
        System.out.print("\tSelect GP: ");
        int gptype;
        try{
            gptype= Integer.parseInt(in.nextLine());
        }catch(NumberFormatException ne){
            gptype = 1;
        }
        switch(gptype){
            case 1: showGP1Options(mda);
                    break;
            case 2: showGP2Options(mda);
                    break;
            case 3: showGP3Options(mda);
                    break;
            default:showGP1Options(mda);
                    break;
        }
    }

    private static void showGP1Options(MDA_EFSM m) {
        GasPump1 gp1 = new GasPump1(m);
        Scanner sc =new Scanner(System.in);
       
        System.out.println("\t\tGP-1 Execution\n");
        for(;;){
            System.out.println("\tSelect Operations:");
            System.out.println("0-Activation, 1-Start, 2-PayCredit, 3-PayCash, 4-Reject, 5-Approved, "
                    + "\n6-Cancel, 7-StartPump, 8-PumpGallon, 9-StopPump, q-Quit");
            System.out.print("\nEnter your choice:");
            String choice = sc.nextLine();

            switch(choice){
                case "0":System.out.println("\n\tOperation Activation(int a)");
                         System.out.print("\n\tEnter value of the parameter a: ");
                         int a;
                         try{
                            a=Integer.parseInt(sc.nextLine());
                         }catch(NumberFormatException ne){
                            a=-1;
                         }
                         gp1.Activate(a);
                         break;
                case "1":System.out.println("\n\tOperation Start()");
                         gp1.Start();
                         break;                    
                case "2":System.out.println("\n\tOperation PayCredit()");
                         gp1.PayCredit();
                         break;
                case "3":System.out.println("\n\tOperation PayCash(int c)");
                         System.out.print("\n\tEnter value of the parameter c: ");
                         int c;
                         try{
                            c=Integer.parseInt(sc.nextLine());
                         }catch(NumberFormatException ne){
                            c=-1;
                         }
                         gp1.PayCash(c);
                         break;
                case "4":System.out.println("\n\tOperation Reject()");
                         gp1.Reject();
                         break;
                case "5":System.out.println("\n\tOperation Approved()");
                         gp1.Approved();
                         break;
                case "6":System.out.println("\n\tOperation Cancel()");
                         gp1.Cancel();
                         break;
                case "7":System.out.println("\n\tOperation StartPump()");
                         gp1.StartPump();
                         break;
                case "8":System.out.println("\n\tOperation PumpGallon()");
                         gp1.PumpGallon();
                         break;
                case "9":System.out.println("\n\tOperation StopPump()");
                         gp1.StopPump();
                         break;
                case "q":System.exit(0);
                default: System.out.println("\n\tInvalid choice\n");
            }                        
        }//end of for        
    }//end of function showGP1Options

    private static void showGP2Options(MDA_EFSM m) {
        GasPump2 gp2 = new GasPump2(m);
        Scanner sc =new Scanner(System.in);
       
        System.out.println("\t\tGP-2 Execution\n");
        for(;;){
            System.out.println("\tSelect Operations:");
            System.out.println("0-Activation, 1-Start, 2-PayCredit, 3-Reject, 4-Approved, 5-Cancel,"
                    + "\n6-Regular, 7-Super, 8-StartPump, 9-PumpGallon, a-StopPump, q-Quit");
            System.out.print("\nEnter your choice:");
            String choice = sc.nextLine();

            switch(choice){
                case "0":System.out.println("\n\tOperation Activation(float a, float b)");
                         System.out.print("\n\tEnter value of the parameter a: ");
                         float a;
                         try{
                            a=Float.parseFloat(sc.nextLine());
                         }catch(NumberFormatException ne){
                            a=-1;
                         }
                         System.out.print("\n\tEnter value of the parameter b: ");
                         float b;
                         try{
                            b=Float.parseFloat(sc.nextLine());
                         }catch(NumberFormatException ne){
                            b=-1;
                         }
                         gp2.Activate(a,b);
                         break;
                case "1":System.out.println("\n\tOperation Start()");
                         gp2.Start();
                         break;                    
                case "2":System.out.println("\n\tOperation PayCredit()");
                         gp2.PayCredit();
                         break;
                case "3":System.out.println("\n\tOperation Reject()");
                         gp2.Reject();
                         break;
                case "4":System.out.println("\n\tOperation Approved()");
                         gp2.Approved();
                         break;
                case "5":System.out.println("\n\tOperation Cancel()");
                         gp2.Cancel();
                         break;
                case "6":System.out.println("\n\tOperation Regular()");
                         gp2.Regular();
                         break;
                case "7":System.out.println("\n\tOperation Super()");
                         gp2.Super();
                         break;    
                case "8":System.out.println("\n\tOperation StartPump()");
                         gp2.StartPump();
                         break;
                case "9":System.out.println("\n\tOperation PumpGallon()");
                         gp2.PumpGallon();
                         break;
                case "a":System.out.println("\n\tOperation StopPump()");
                          gp2.StopPump();
                         break;
                case "q":System.exit(0);
                default: System.out.println("\n\tInvalid choice\n");
            }            
        }//end of for        
    }//end of function showGP2Options

    private static void showGP3Options(MDA_EFSM m) {
        GasPump3 gp3 = new GasPump3(m);
        Scanner sc =new Scanner(System.in);
       
        System.out.println("\t\tGP-3 Execution\n");
        for(;;){
            System.out.println("\tSelect Operations:");
            System.out.println("0-Activation, 1-Start, 2-PayCash, 3-Cancel, 4-Regular, 5-Premium,"
                    + "\n6-StartPump, 7-PumpLiter, 8-StopPump, 9-Receipt, a-NoReceipt, q-Quit");
            System.out.print("\nEnter your choice:");
            String choice = sc.nextLine();

            switch(choice){
                case "0":System.out.println("\n\tOperation Activation(float a, float b)");
                         System.out.print("\tEnter value of the parameter a: ");
                         float a;
                         try{
                            a=Float.parseFloat(sc.nextLine());
                         }catch(NumberFormatException ne){
                            a=-1;
                         }
                         System.out.print("\n\tEnter value of the parameter b: ");
                         float b;
                         try{
                            b=Float.parseFloat(sc.nextLine());
                         }catch(NumberFormatException ne){
                            b=-1;
                         }
                         gp3.Activate(a,b);
                         break;
                case "1":System.out.println("\n\tOperation Start()");
                         gp3.Start();
                         break;                    
                case "2":System.out.println("\n\tOperation PayCash(float c)");
                         System.out.print("\n\tEnter value of the parameter c: ");
                         float c;
                         try{
                            c=Float.parseFloat(sc.nextLine());
                         }catch(NumberFormatException ne){
                            c=-1;
                         }
                         gp3.PayCash(c);
                         break;
                case "3":System.out.println("\n\tOperation Cancel()");
                         gp3.Cancel();
                         break;
                case "4":System.out.println("\n\tOperation Regular()");
                         gp3.Regular();
                         break;
                case "5":System.out.println("\n\tOperation Premium()");
                         gp3.Premium();
                         break;    
                case "6":System.out.println("\n\tOperation StartPump()");
                         gp3.StartPump();
                         break;
                case "7":System.out.println("\n\tOperation PumpGallon()");
                         gp3.PumpLiter();
                         break;
                case "8":System.out.println("\n\tOperation StopPump()");
                          gp3.StopPump();
                          break;
                case "9":System.out.println("\n\tOperation Receipt()");
                          gp3.Receipt();
                          break;
                case "a":System.out.println("\n\tOperation NoReceipt()");
                          gp3.NoReceipt();
                          break;    
                case "q":System.exit(0);
                default: System.out.println("\n\tInvalid choice\n");
            }            
        }//end of for   
    }//end of function showGP3Options
}
