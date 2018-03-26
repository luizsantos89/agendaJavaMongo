/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Set;
import org.bson.Document;



public class MongoConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        //MongoClientURI uri = new MongoClientURI("mongodb+srv://dbuser:20709891@androiddev-7ypx9.mongodb.net/");
        
        MongoClient mongoClient = new MongoClient("localhost",27017);
        DB database = mongoClient.getDB("agenda");        
        DBCollection colecao = database.getCollection("contatos");
        
        BasicDBObject objeto = new BasicDBObject();
        objeto.put("_id","3");
        objeto.put("nome","Luiz Santos");
        objeto.put("idade",28);
        
        System.out.println(objeto);
        
        colecao.insert(objeto);
    }
}
