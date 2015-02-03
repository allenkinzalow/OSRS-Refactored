/**
 * This is actually something beyond just a ping request - will be refactored later.
 */
public class SessionRequest {

   SessionRequest nextSessionRequest;
   public volatile int anInt1292 = 0;

   /**
    * The type of connection and/or session
    * 1 - Socket Connection
    * 2 - Thread
    * 3 - IP Host Address
    * 4 - URL Connection
    *
    */
   int connectionType;

   /**
    *
    */
   public volatile Object connectionObject;

   /**
    * IP, URL, Thread Name
    */
   Object connectionAddress;

   /**
    * Port, Thread Priority, IpAddress
    */
   public int connectParameter;


}
