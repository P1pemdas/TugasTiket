import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiketPesawat {

        static int counter = 0;
    
	static String datarute[][] = new String[1][4]; //asal, tujuan, jml penumpang, kelas
	static String temp_rute[][] = new String[1][4];
        
    static String nama_rute[][] = {
        //GARUDA, TUJUAN JKT            
        {"Garuda Indonesia","SBY","JKT","1000000"},
        {"Garuda Indonesia","DPS","JKT","1250000"},
        {"Garuda Indonesia","SMG","JKT","700000"},
        
        //CITILINK, TUJUAN JKT
        {"Citilink","SBY","JKT","850000"},
        {"Citilink","DPS","JKT","1000000"},
        {"Citilink","SMG","JKT","600000"},
        
        //LION AIR, TUJUAN JKT
        {"Lion Air","SBY","JKT", "650000"},
        {"Lion Air","DPS","JKT", "900000"},
        {"Lion Air","SMG","JKT", "400000"},


        //GARUDA, TUJUAN SBY
        {"Garuda Indonesia","JKT","SBY","1200000"},
        {"Garuda Indonesia","DPS","SBY","520000"},  
        {"Garuda Indonesia","SMG","SBY", "400000"},
        
        //CITILINK, TUJUAN SBY
        {"Citilink","JKT","SBY","700000"},
        {"Citilink","DPS","SBY","400000"},
        {"Citilink","SMG","SBY","300000"},
        
        //LION AIR, TUJUAN SBY
        {"Lion Air","JKT","SBY", "6000000"},
        {"Lion Air","DPS","SBY", "390000"},
        {"Lion Air","SMG","SBY", "350000"},

        
        //GARUDA, TUJUAN DPS
        {"Garuda Indonesia","JKT","DPS","1100000"},
        {"Garuda Indonesia","SBY","DPS","500000"},  
        {"Garuda Indonesia","SMG","DPS", "450000"},
        
        //CITILINK, TUJUAN DPS
        {"Citilink","JKT","DPS","900000"},
        {"Citilink","SBY","DPS","400000"},
        {"Citilink","SMG","DPS","450000"},
        
        //LION AIR, TUJUAN DPS
        {"Lion Air","JKT","DPS", "800000"},
        {"Lion Air","SBY","DPS", "390000"},
        {"Lion Air","SMG","DPS", "420000"},
        
        
        //GARUDA, TUJUAN SMG
        {"Garuda Indonesia","JKT","SMG","900000"},
        {"Garuda Indonesia","SBY","SMG","800000"},  
        {"Garuda Indonesia","SMG","SMG", "700000"},
        
        //CITILINK, TUJUAN SMG
        {"Citilink","JKT","SMG","700000"},
        {"Citilink","SBY","SMG","500000"},
        {"Citilink","DPS","SMG","465000"},
        
        //LION AIR, TUJUAN SMG
        {"Lion Air","JKT","SMG", "450000"},
        {"Lion Air","SBY","SMG", "370000"},
        {"Lion Air","DPS","SMG", "495000"}


        
    }; //keberangkatan, kedatangan, harga
        
    static String datapbl[][] = new String[1][5]; //nama, tgl_lahir, jenkel, no_telp, email 
    static String temp_pbl[][] = new String[1][5];
        
	static String dataplg[][] = new String[1][3]; //nama, tgl_lahir, jenkel
	static String temp_plg[][] = new String[1][3];

	static String datatrk[][] = new String [1][]; //cetak_tiket, cetak_dataplg
	static String temp_trk[][] = new String[1][];

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
            
            
        do{
        	System.out.println();
            System.out.println("=====SELAMAT DATANG=====");
            System.out.println();
            System.out.println("**Isi data pembeli");
            
            System.out.print("Nama Lengkap \t: ");
            datapbl[counter][0] = br.readLine();
            
            System.out.print("Jenis Kelamin \t: ");
            datapbl[counter][1] = br.readLine();
            
            System.out.print("Tanggal Lahir \t: ");
            datapbl[counter][2] = br.readLine();
            
            System.out.print("Nomor Telepon \t: ");
            datapbl[counter][3] = br.readLine();
            
            System.out.print("E-mail \t: ");
            datapbl[counter][4] = br.readLine();
                    
            
			System.out.println("\n\n>>>>Menu Utama<<<<");
			System.out.println("1. Penerbangan");
			System.out.println("2. Tampil History Pembelian");
			System.out.println("3. Exit");
                    
            System.out.print("Masukkan Pilihan Menu Anda : ");
            int pil_menu = Integer.parseInt(br.readLine());
                    
            switch(pil_menu){
                case 1 : //penerbangan
                    
                    System.out.println("\n=====Pilih Kelas=====");
                    System.out.println("1. Kelas Ekonomi");
                    System.out.println("2. Kelas Bisnis");
                    System.out.println("3. Kelas Utama");
                    
                    System.out.print("Masukkan Pilihan Menu Anda : ");
                    int pil_kelas = Integer.parseInt(br.readLine());
                    
                    switch(pil_kelas){
                        case 1 : //kelas ekonomi
                            System.out.println("\n====KELAS EKONOMI====");
                            System.out.println("1. Satu Perjalanan");
                            System.out.println("2. Pulang Pergi");
                        
                            System.out.println("Pilih Perjalanan : ");
                            int pil_perjalanan = Integer.parseInt(br.readLine());
                    
                            switch(pil_perjalanan){
                                case 1 : //satu perjalanan
                                    System.out.println("Perjalanan Sekali Jalan");
                                    System.out.println("Pilih Keberangkatan");
                            
                                    System.out.println("Pilih Kedatangan");
                            		break;
                        
                                case 2 : //pulang pergi
                                    System.out.println("Perjalanan Pulang Pergi");
                            		break;
                    		}
                    		break;
                        case 2 : //kelas bisnis
                        System.out.println("\n====KELAS BISNIS====");
                        System.out.println("1. Satu Perjalanan");
                        System.out.println("2. Pulang Pergi");
                        
                        System.out.print("Pilih Perjalanan : ");
                        pil_perjalanan = Integer.parseInt(br.readLine());
                    
                        switch(pil_perjalanan){
                            case 1 : //satu perjalanan
                                System.out.println("Perjalanan Sekali Jalan");
                                System.out.println("Pilih Keberangkatan");
                        
                                System.out.println("Pilih Kedatangan");
                        		break;
                    
                            case 2 : //pulang pergi
                                System.out.println("Perjalanan Pulang Pergi");
                        		break;
                		}
                        break;
                        case 3 : //first class
                        System.out.println("\n====KELAS UTAMA====");
                        System.out.println("1. Satu Perjalanan");
                        System.out.println("2. Pulang Pergi");
                        
                        System.out.print("Pilih Perjalanan : ");
                        pil_perjalanan = Integer.parseInt(br.readLine());
                    
                            switch(pil_perjalanan){
                                case 1 : //satu perjalanan
                                    System.out.println("Perjalanan Sekali Jalan");
                                    System.out.println("Pilih Keberangkatan");
                            
                                    System.out.println("Pilih Kedatangan");
                            		break;
                                case 2 : //pulang pergi
                                    System.out.println("Perjalanan Pulang Pergi");
                            		break;
                        	}
                        break;
                    }
                    break;
                            
				case 2 : //Tampil history transaksi
                            
                	break;
				}


	}while(true);
            
	}

	// static void inputrute(){

	// }

	// static void transaksi(){

	// }

	// static void exit(){
		
	// }
}