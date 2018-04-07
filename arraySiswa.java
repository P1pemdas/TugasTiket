import java.io.*;

public class arraySiswa {
	static int i = 1;
	static int counter = 0;
	static String data[][] = new String[i][3];
	static String temp[][] = new String[i][3];
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tanya = "y";

		do{
			System.out.println();
			System.out.print("Masukkan nama : ");
			data[counter][0] = br.readLine();
			System.out.print("Masukkan nim : ");
			data[counter][1] = br.readLine();
			System.out.print("Masukkan noTelp : ");
			data[counter][2] = br.readLine();
			System.out.print("apa nambah?");
			tanya = br.readLine();
			if(tanya.equals("y")){
				System.arraycopy(data,0, temp,0, data.length);
				i++;
				data = new String[i][3];
				System.arraycopy(temp,0, data,0, temp.length);
				counter++;
			}
		}while(tanya.equals("y"));

		for (int j = 0; j<data.length; j++) {
			System.out.println();
			System.out.println("Nama ke-"+j+" : "+data[j][0]);
			System.out.println("Nim ke-"+j+" : "+data[j][1]);
			System.out.println("Nomor Telp ke-"+j+" : "+data[j][2]);
		}
	}
}