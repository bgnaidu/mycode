package mongodb;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class SelectingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MongoClient client=new MongoClient("127.0.0.1" , 27017);
		
		MongoCredential credential=MongoCredential.createCredential("sampleUser", "myDb","password".toCharArray()); 
		System.out.println("Connected to the database successfully"); 
		 MongoDatabase database = client.getDatabase("myDb");
		 
		 MongoCollection<Document> collection=database.getCollection("Naiducollection");
		 System.out.println("collection recieved succesfully:"+collection.getReadPreference());
	}

}
