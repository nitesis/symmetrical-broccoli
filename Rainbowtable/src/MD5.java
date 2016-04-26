import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static void main(String[] args){
		System.out.print("Message: ");
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			byte[] data = reader.readLine().getBytes("US-ASCII");
			md5.update(data);
			byte[] hash = md5.digest();
			StringBuilder stbuild= new StringBuilder("");
			for(int i = 0; i < hash.length; ++i){
				//Object temp1 = Integer.parseInt(new String(hash[i]), 16 );
				
				stbuild.append(hash[i]);
				System.out.print(String.format("%02x", hash[i]));
				
				
			}
			System.out.println();
			 
			
			System.out.println(hex2decimal(stbuild.toString()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int hex2decimal(String s) {
        //String digits = "5d41402abc4b2a76b9719d911017c592";
        //s = s.toUpperCase();
        int val = 0;
        StringBuilder r = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = s.indexOf(c);
            val = 16*val + d;
            r.append(val%36);
            val=val/36;
            
            r.append(val%36);
            val=val/36;
            
            r.append(val%36);
            val=val/36;
            
            r.append(val%36);
            val=val/36;
            
            r.append(val%36);
            val=val/36;
            
            r.append(val%36);
            val=val/36;
            
            r.append(val%36);
            val=val/36;
            
            
            
        }
        
       // System.out.println(r.toString());
        return val;
    }

}