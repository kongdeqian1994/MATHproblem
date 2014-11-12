/*This program is going to count the Stirling Number by Using recursion*/
public class StirlingNumber {
	public static int Stirling(int total,int choose){
		if(total >= 0 && total == choose){
			return 1;
		}
		if(total>=1 && choose == 0){
			return 0;
		}
		return choose*Stirling(total - 1,choose)+Stirling(total -1,choose -1);
	}
	public static void main(String args[]){
		System.out.println(Stirling(8,7));
	}

}
