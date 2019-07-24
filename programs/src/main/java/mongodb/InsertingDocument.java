package mongodb;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertingDocument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  MongoClient client=new MongoClient();
  
  MongoCredential credential=MongoCredential.createCredential("sampleUser", "test","password".toCharArray()); 
	System.out.println("Connected to the database successfully"); 
	 MongoDatabase database = client.getDatabase("test");
	 
	 MongoCollection<Document> collection=database.getCollection("newcollection");
	 System.out.println("collection recieved succesfully"); 
	 
	 Document document=new Document("name", "Gowru");
	 document.append("profession", "Developer");
	 document.append("age", 27);
	 document.append("hobby", "movies");
	 
	 collection.insertOne(document);
	 
	 System.out.println("insertion into document is comp[leted");
	}

}
