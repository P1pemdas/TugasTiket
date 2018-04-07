import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiketPesawat {

        static int counter = 0;
    
	static String datarute[][] = new String[1][4]; //asal, tujuan, jml penumpang, kelas
	static String temp_rute[][] = new String[1][4];
        
    static String nama_rute[][] = {
        
        //////GARUDA, JKT/////
        //EKONOMI            
        {"Garuda Indonesia", "SBY","JKT", "1000000", "1"},
        {"Garuda Indonesia", "DPS","JKT", "1250000", "1"},
        {"Garuda Indonesia", "SMG","JKT", "700000", "1"},
        
        //BISNIS
        {"Garuda Indonesia", "SBY", "JKT", "1500000", "2"},
        {"Garuda Indonesia", "DPS", "JKT", "1750000", "2"},
        {"Garuda Indonesia", "SMG", "JKT", "1200000", "2"},
        
        //FIRST CLASS
        {"Garuda Indonesia", "SBY", "JKT", "2000000", "3"},
        {"Garuda Indonesia", "DPS", "JKT", "2250000", "3"},
        {"Garuda Indonesia", "SMG", "JKT", "1700000", "3"},
        
        /////CITILINK, JKT/////
        //EKONOMI
        {"Citilink", "SBY", "JKT", "850000", "1"},
        {"Citilink", "DPS", "JKT", "1000000", "1"},
        {"Citilink", "SMG", "JKT", "600000", "1"},
        
        //BISNIS
        {"Citilink", "SBY", "JKT", "1050000", "2"},
        {"Citilink", "DPS", "JKT", "1200000", "2"},
        {"Citilink", "SMG", "JKT", "800000", "2"},
        
        //FIRST CLASS
        {"Citilink", "SBY", "JKT", "1250000", "3"},
        {"Citilink", "DPS", "JKT", "1400000", "3"},
        {"Citilink", "SMG", "JKT", "1000000", "3"},
        
        /////LION AIR, JKT/////
        //EKONOMI
        {"Lion Air", "SBY", "JKT", "650000", "1"},
        {"Lion Air", "DPS", "JKT", "900000", "1"},
        {"Lion Air", "SMG", "JKT", "400000", "1"},
        
        //BISNIS
        {"Lion Air", "SBY", "JKT", "800000", "2"},
        {"Lion Air", "DPS", "JKT", "1050000", "2"},
        {"Lion Air", "SMG", "JKT", "550000", "2"},

        //FIRST CLASS
        {"Lion Air", "SBY", "JKT", "1050000", "3"},
        {"Lion Air", "DPS", "JKT", "1300000", "3"},
        {"Lion Air", "SMG", "JKT", "800000", "3"},
        
        /////GARUDA, SBY/////
        //EKONOMI
        {"Garuda Indonesia", "JKT", "SBY", "1200000", "1"},
        {"Garuda Indonesia", "DPS", "SBY", "520000", "1"},  
        {"Garuda Indonesia", "SMG", "SBY", "400000", "1"},
        
        //BISNIS
        {"Garuda Indonesia", "JKT", "SBY", "1700000", "2"},
        {"Garuda Indonesia", "DPS", "SBY", "1200000", "2"},  
        {"Garuda Indonesia", "SMG", "SBY", "900000", "2"},
        
        //FIRST CLASS
        {"Garuda Indonesia", "JKT", "SBY", "2200000", "3"},
        {"Garuda Indonesia", "DPS", "SBY", "1520000", "3"},  
        {"Garuda Indonesia", "SMG", "SBY", "1900000", "3"},
        
        /////CITILINK, SBY/////
        //EKONOMI
        {"Citilink", "JKT", "SBY", "700000", "1"},
        {"Citilink", "DPS", "SBY", "400000", "1"},
        {"Citilink", "SMG", "SBY", "300000", "1"},
        
        //BISNIS
        {"Citilink", "JKT", "SBY", "900000", "2"},
        {"Citilink", "DPS", "SBY", "600000", "2"},
        {"Citilink", "SMG", "SBY", "500000", "2"},
        
        //FIRST CLASS
        {"Citilink","JKT","SBY","1100000","3"},
        {"Citilink","DPS","SBY","800000","3"},
        {"Citilink","SMG","SBY","700000","3"},
        
        //////LION AIR, SBY/////
        //EKONOMI
        {"Lion Air","JKT","SBY", "6000000","1"},
        {"Lion Air","DPS","SBY", "390000","1"},
        {"Lion Air","SMG","SBY", "350000","1"},
        
        //BISNIS
        {"Lion Air","JKT","SBY", "7500000","2"},
        {"Lion Air","DPS","SBY", "540000","2"},
        {"Lion Air","SMG","SBY", "500000","2"},
        
        //FIRST CLASS
        {"Lion Air","JKT","SBY", "9000000","3"},
        {"Lion Air","DPS","SBY", "790000","3"},
        {"Lion Air","SMG","SBY", "650000","3"},

        /////GARUDA, DPS/////
        //EKONOMI
        {"Garuda Indonesia","JKT","DPS","1100000","1"},
        {"Garuda Indonesia","SBY","DPS","500000","1"},  
        {"Garuda Indonesia","SMG","DPS","450000","1"},
        
        //BISNIS
        {"Garuda Indonesia","JKT","DPS","1600000","2"},
        {"Garuda Indonesia","SBY","DPS","1000000","2"},  
        {"Garuda Indonesia","SMG","DPS","950000","2"},
        
        //FIRST CLASS
        {"Garuda Indonesia","JKT","DPS","2100000","3"},
        {"Garuda Indonesia","SBY","DPS","1500000","3"},  
        {"Garuda Indonesia","SMG","DPS","1450000","3"},
        
        /////CITILINK, DPS/////
        //EKONOMI
        {"Citilink","JKT","DPS","900000"},
        {"Citilink","SBY","DPS","400000"},
        {"Citilink","SMG","DPS","450000"},
        
        /////LION AIR, DPS/////
        //EKONOMI
        {"Lion Air","JKT","DPS", "800000"},
        {"Lion Air","SBY","DPS", "390000"},
        {"Lion Air","SMG","DPS", "420000"},
        
        
        //////GARUDA, SMG/////
        //EKONOMI
        {"Garuda Indonesia","JKT","SMG","900000"},
        {"Garuda Indonesia","SBY","SMG","800000"},  
        {"Garuda Indonesia","SMG","SMG", "700000"},
        
        /////CITILINK, SMG/////
        //EKONOMI
        {"Citilink","JKT","SMG","700000"},
        {"Citilink","SBY","SMG","500000"},
        {"Citilink","DPS","SMG","465000"},
        
        /////LION AIR, SMG/////
        //EKONOMI
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