/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/**
 * MidTerm-Exam
 * @author srinivsi
 */

 
public class StausUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        statusDetail(input);
    }
    public static void statusDetail(String code) {
        Status status = Status.fromCode(code);
        if (status == null) {
            System.out.println("NOT VALID CODE");
        } else {
            System.out.println(status.getDescription());
        }
    }
}

