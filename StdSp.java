package StandartSapma;

public class StdSp {
	
	
	public static double Hesapla(double array[]) {
		double top = 0.0,  StdS = 0.0;
		int length = array.length;
		
		for(double s : array) {
			top += s;
			
		}
		double ort = top / length;
		
		for(double s : array) {
			StdS += Math.pow(s -  ort, 2);
		}
		
		return Math.sqrt(StdS / length );
		
	}
	

	public static void main(String[] args) {
		
		
		double[] array = {1,2,3,4,5,6,7,8,9,10};
		double StdS = Hesapla(array);
		
		System.out.print("Sayılar: ");
		for(double sayi : array) {
			System.out.print(sayi + ",");
		}
		
		System.out.format("\n Sayıların Standart Sapması = %.6f \n", StdS);
		
	}

}
