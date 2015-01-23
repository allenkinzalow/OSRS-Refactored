import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClientVerifier extends Node {

   public int verifyCount;
   public Field[] clientFields;
   public int anInt1932;
   public int[] errorIdentifiers;
   public int[] type;
   public int[] fieldValues;
   public Method[] clientMethods;
   public byte[][][] methodByteArray;


   public static Class resolveType(String var0, byte var1) throws ClassNotFoundException {
      return var0.equals("B") ?  Byte.TYPE :
			(var0.equals("I") ? Integer.TYPE :
			(var0.equals("S") ? Short.TYPE :
			(var0.equals("J") ? Long.TYPE :
			(var0.equals("Z") ? Boolean.TYPE :
			(var0.equals("F") ? Float.TYPE :
			(var0.equals("D") ? Double.TYPE :
			(var0.equals("C") ? Character.TYPE :
			(var0.equals("void") ? Void.TYPE :
				Class.forName(var0)))))))));
   }
}
