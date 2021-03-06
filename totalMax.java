/**
 *        
 * 
 * @author [Javee Nedia]
 * @link   [hhttps://github.com/javened/DSA/blob/master/totalMax.java]
 * @version[1.0]
 * @since  [9/21/2016]
 * 
 * */

import java.util.Scanner;
import java.util.Random;

public class totalMax {
	private int []array;
	private int capacity;
	private int sum=0;
	private double average=0;
	private int max=0;
	
	private totalMax(int num){
		capacity=num;
		array=new int[capacity];
	}
	public void input(){
		for(int i=0;i<capacity;i++){
			array[i]=(int)(1+Math.random()*1000);
		}
		for(int i=0;i<capacity;i++){
			if (i%10==0){
				System.out.println();
			}
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
	public void sum(){
		for(int i = 0;i<capacity;i++){
			sum+=array[i];
		}
		System.out.println("Sum = "+sum);
	}
	public void average(){
		average=sum/capacity;
		System.out.println("Average = "+average);
	}
	public void max(){
		for(int i = 0;i<capacity;i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		System.out.println("Max = "+max);
	}

	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int amount;
		System.out.print("Please input amount : ");
		amount=input.nextInt();
		totalMax totalMax=new totalMax(amount);
		totalMax.input();
		totalMax.sum();
		totalMax.average();
		totalMax.max();
	}
	
}
