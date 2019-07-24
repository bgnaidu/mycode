package mongodb;

import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  

public class ConnectToDB { 
   
   public static void main( String args[] ) {  
      
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "127.0.0.1" , 27017 ); 
   //   mongodb://127.0.0.1:27017
      // Creating Credentials 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("sampleUser", "myDb", 
         "password".toCharArray()); 
      System.out.println("Connected to the database successfully");  
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase("myDb"); 
      System.out.println("Credentials ::"+ credential);     
   } 
}