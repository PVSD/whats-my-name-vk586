package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner Reader = new Scanner(System.in);
	System.out.print("What is your first name?");
	String fName = Reader.next();
	System.out.print("What is your last name?");
	String lName = Reader.next();

	System.out.print("Your full name is " + fName + " " + lName + ".");
    }
}
