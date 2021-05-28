package InterviewPrograms;

public class HexToBinary {

	public static void main(String[] args) {
		String hexAddr ="7";
		
		String binAddr = Integer.toBinaryString(Integer.parseInt(hexAddr, 16));
		

		System.out.println(binAddr);
		
		String octAddr= Integer.toOctalString(Integer.parseInt(hexAddr,8));
		
		System.out.println(octAddr);
		
		String bin=Integer.toBinaryString(Integer.parseInt(hexAddr,16));
		
		System.out.println(bin);

	}

}
