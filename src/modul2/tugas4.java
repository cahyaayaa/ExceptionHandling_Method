/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author WINDOWS 10
 */
public class tugas4 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(bil/0);
            System.out.println(b[3]);
        } catch (ArithmeticException ai) {
            System.out.println("Eror Aritmetik");
            System.out.println(ai.getMessage());
        } catch (ArrayIndexOutOfBoundsException n){
            System.out.println("Eror karena melebihi kapasitas array");
            System.out.println(n.getMessage());
        } catch (Exception e){
            System.out.println("Ada eror");
            System.out.println(e.getMessage());
        }
    }
    
}
