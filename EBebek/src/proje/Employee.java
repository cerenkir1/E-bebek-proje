
package proje;
import java.util.Scanner;

public class Employee {
	String name;
    float salary;
    float workHours;
    int hireYear;
		/* Employee(String name,float salary,float workHours,int hireYear) {
			this.name=name;
			this.salary=salary;
			this.workHours=workHours;
			this.hireYear=hireYear;
				}*/ 
    	//Buradaki methodu olu�turdum fakat toString methoduna ait oldu�u i�in yorum sat�r�na d�n��t�rd�m.
		
    static float tax(float salary) {
			float salaryTax=0;
		    if(salary>1000) {
				
				salaryTax = salary*3/100;
				return salaryTax;
			}
			else if(salary<1000){
				System.out.println("0");
				return salaryTax;
			}
			
			else {
				System.out.println("Vergi olup olmad��� belirtilmedi.");
				return salaryTax;
			}	
		}
		
		 static float bonus(float workHours) {
			 int extraBonus=0;
			 if(workHours>40) {
				 
				 for(float i=40;i<workHours;i++) {
					 
					  extraBonus +=30;	
					  
				 }
		  return extraBonus ;
			 }
		  return extraBonus ;
		 }
		 
		 static float raiseSalary(int hireYear,float salary) {
		 
			 int calismaSuresi =2021-1985;
			 float salaryRaise = 0;
			 if(calismaSuresi<10)
             {	 
				 salaryRaise= salary*5/100;
			     return salaryRaise;
			 }
			 
			 else if (calismaSuresi>9 && calismaSuresi<20) {
				 salaryRaise=salary*10/100;
				 return salaryRaise; 
			 }
			 else if(calismaSuresi>19) {
				 salaryRaise= salary*15/100;
				 return salaryRaise; 
			 }
		  return salaryRaise;
		 }
		/*@Override
		 public String toString () {
			 return "Ad�: " + name + "Maa��: " + salary + "�al��ma Saati: " + workHours + "Ba�lang�� Y�l�: " + hireYear;
		}*/ 
		 //ToString methodunu yazmay� denedim fakat ba�ar�l� olamad�m ona ait olan k�s�mlar� yorum sat�rana �evirdim.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ad� : ");
		String name=input.nextLine();
		System.out.print("Maa�� : ");
		Float salary=input.nextFloat();
		System.out.print("�al��ma Saati : ");
		Float workHours=input.nextFloat();
		System.out.print("Ba�lang�� Y�l� : ");
		int hireYear=input.nextInt();
		System.out.println("Vergi : " + tax(salary));
		System.out.println("Bonus : "+ bonus(workHours));
		System.out.println("Maa� art��� : " + raiseSalary(hireYear,salary));
		System.out.println("Vergi ve Bonuslar ile birlikte maa� : " + (salary- tax(salary) + bonus(workHours)));
		System.out.println("Toplam Maa� :"+ (salary-tax(salary)+bonus(workHours)+ raiseSalary(hireYear,salary)));
		
		/*Employee employee=new Employee("Kemal",2000,45,1985);
		System.out.println(employee);*/
	   
}}