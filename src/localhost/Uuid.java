package localhost;

import java.util.UUID;

public class Uuid {
	
	public static final String EMPTY = "";

	public static void main (String[] args) {
        StringBuffer buffer = new StringBuffer();

        for (String value : args) {
            buffer.append(UUID.nameUUIDFromBytes((value != null) ? value.getBytes() : Uuid.EMPTY.getBytes()).toString() + ' ');
        }
        
        System.out.println(buffer.toString().toUpperCase());
    }

}
