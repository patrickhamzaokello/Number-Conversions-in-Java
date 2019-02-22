package conversions;

import java.util.Scanner;

public class Conversions {
    public static void main(String args[]) {
            BinToAll bta = new BinToAll();
            bta.Oct();
            bta.Dec();
            bta.Hex();
            
            OctToAll ota= new OctToAll();
            ota.Bin();
            ota.Dec();
            ota.Hex();
            
            DecToAll dta = new DecToAll();
            dta.Bin();
            dta.Oct();
            dta.Hex();
            
            HexToAll hta = new HexToAll();
            hta.Bin();
            hta.Oct();
            hta.Dec();
           
    }
}

class BinToAll{
    Scanner scan;
    int num;
    String decimal, octal, hexa;
        void Oct() {
            System.out.println("Convert Binary to All");
            System.out.print("\nEnter the Binary number: ");
            scan = new Scanner(System.in);
            num = Integer.parseInt(scan.nextLine(), 2);
            octal = Integer.toOctalString(num);
            System.out.println("Octal Value is: " + octal);
            }
               void Dec() {
            decimal = Integer.toString(num);
            System.out.println("Decimal Value is: " + decimal);
            }
             void Hex(){
            hexa = Integer.toHexString(num);
             System.out.println("HexaDecimal Value is: " + hexa);
           }
}
class OctToAll{
    Scanner scan;
    int num;
    String binary, decimal, hexa;

          void Bin() {
            System.out.println("\nConvert Octal to All");
            System.out.print("\nEnter the Octal number: ");
            scan = new Scanner(System.in);
            num = Integer.parseInt(scan.nextLine());
            
            binary = Integer.toBinaryString(num);
            System.out.println("Binary Value is: " + binary);
         }
          
          void Dec() {
            decimal = Integer.toString(num);
            System.out.println("Decimal Value is: " + decimal);
            }
     
       void Hex() {
            hexa = Integer.toHexString(num);
            System.out.println("HexaDecimal Value is: " + hexa);
    } 
}

class DecToAll{
    Scanner scan;
    int num;
    String binary, octal, hexa;

        void Bin() {
            System.out.println("\nConvert Decimal to All");
            System.out.print("\nEnter the Decimal number: ");
            scan = new Scanner(System.in);
            num = Integer.parseInt(scan.nextLine());
            
            binary = Integer.toBinaryString(num);
            System.out.println("Binary Value is: " + binary);
         }
          void Oct() {
            octal = Integer.toOctalString(num);
            System.out.println("Octal Value is: " + octal);
            }
        void Hex() {
            hexa = Integer.toHexString(num);
            System.out.println("HexaDecimal Value is: " + hexa);
    }     
}

class HexToAll{
    Scanner scan;
    int num;
    String binary, octal, decimal;

        void Bin() {
            System.out.println("\nConvert HexaDecimal to All");
            System.out.print("\nEnter the HexaDecimal number: ");
            scan = new Scanner(System.in);
            num = Integer.parseInt(scan.nextLine());
            
            binary = Integer.toBinaryString(num);
            System.out.println("Binary Value is: " + binary);
         }
          void Oct() {
            octal = Integer.toOctalString(num);
            System.out.println("Octal Value is: " + octal);
            }
            void Dec() {
            decimal = Integer.toString(num);
            System.out.println("Decimal Value is: " + decimal);
            }   
}