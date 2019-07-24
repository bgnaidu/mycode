package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class CreatingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MongoClient mongo=new  MongoClient("127.0.0.1" , 27017 );
 
 MongoCredential credential;
 
 credential=MongoCredential.createCredential("sampleUser", "myDb", 
         "password".toCharArray());
 System.out.println("Connected to the database successfully");  
 
 MongoDatabase database=mongo.getDatabase("mydb") ;
 
 database.createCollection("Naiducollection");
 System.out.println("Collection created successfully"); 
	}

}
