package mongodb;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class RetrievingDocuments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MongoClient client=new MongoClient();
		  
		  MongoCredential credential=MongoCredential.createCredential("sampleUser", "test","password".toCharArray()); 
			System.out.println("Connected to the database successfully"); 
			 MongoDatabase database = client.getDatabase("test");
			 
			 MongoCollection<Document> collection=database.getCollection("newcollection");
			 System.out.println("collection recieved succesfully"); 
			 
			 FindIterable<Document> findIterable=collection.find();
			 int i=1;
			 
			 // Getting the iterator 
			 Iterator iterator=findIterable.iterator();
			 
			 while(iterator.hasNext()) {
				System.out.println(iterator.next()); 
				i++;
			 }
				 
			 
	}

}
