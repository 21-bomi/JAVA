package org.opentutorials.javatutorials.object;
 
class Calculator{
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
  
public class CalculatorDemo4 {
      
    public static void main(String[] args) {
          
        CalculatorDemo4 c1 = new CalculatorDemo4();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
          
        CalculatorDemo4 c2 = new CalculatorDemo4();
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }

	private void avg() {
		// TODO Auto-generated method stub
		
	}

	private void sum() {
		// TODO Auto-generated method stub
		
	}

	private void setOprands(int i, int j) {
		// TODO Auto-generated method stub
		
	}
  
}