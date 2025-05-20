package pertemuan10.pkg1;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Ihfald
 * TGL: 20 Mei 2025
 */
public class Pertemuan101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        dbkoneksi cnn = new  dbkoneksi ();
        Statement st = cnn.koneksi ().createStatement();
        
        String sql = "SELECT * FROM mhs;";
        ResultSet res= st.executeQuery (sql);
        
        while ( res.next()){
            
            System.out.println ("Nama: "+res.getString("NAMA"));
            System.out.println ("Nim: "+res.getString("NIM"));
            System.out.println ("Alamat: "+res.getString("ALAMAT"));
            System.out.println ("Prodi: "+res.getString("PRODI"));
        }
    }
    
}
