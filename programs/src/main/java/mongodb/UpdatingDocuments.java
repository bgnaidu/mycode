package mongodb;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class UpdatingDocuments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MongoClient client=new MongoClient();
		  
		  MongoCredential credential=MongoCredential.createCredential("sampleUser", "test","password".toCharArray()); 
			System.out.println("Connected to the database successfully"); 
			 MongoDatabase database = client.getDatabase("test");
			 
			 MongoCollection<Document> collection=database.getCollection("newcollection");
			 System.out.println("collection recieved succesfully");
			 
//			 collection.updateOne(Filters.eq("age",26), Updates.set("profession", "Software Developer"));
//			  System.out.println("Document update successfully...");
			 collection.deleteOne(Filters.eq("name", "naidu"));
			 System.out.println("deleted document succesfully");
			 
			// Retrieving the documents after updation 
		      // Getting the iterable object
		      FindIterable<Document> iterDoc = collection.find(); 
		      int i = 1; 

		      // Getting the iterator 
		      Iterator it = iterDoc.iterator(); 

		      while (it.hasNext()) {  
		         System.out.println(it.next());  
		         i++; 
	}

}
}