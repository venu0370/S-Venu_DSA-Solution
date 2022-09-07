package com.greatlearning.Driver1;

import java.io.IOException;
import java.util.Scanner;

import com.greatlearning.Service1.Service;

public class Driver {
	
public static void main(String []args)throws IOException {
	
	int noofFloors;
	int[]floors;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the total no of Floors in the Building :- ");
	
	noofFloors  = sc.nextInt();
	floors = new int[noofFloors];
	
	for(int i =0;i<noofFloors;i++)
	{
		System.out.println("Enter the Floor size given on Day : "+(i+1));
		floors[i] = sc.nextInt();
	}
	System.out.println();
	
	Service service = new Service();
	
	service.printConstructionTable(floors);
	
	sc.close();
	}
} 
