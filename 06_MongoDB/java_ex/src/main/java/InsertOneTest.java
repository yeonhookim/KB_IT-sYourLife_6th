
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertManyResult;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class InsertOneTest {
    public static void main(String[] args) {
        // 컬렉션 객체 얻기
        MongoCollection<Document> collection = Database.getCollection("todo");

        // 추가할 문서 리스트 생성
        List<Document> insertList = new ArrayList<>();

        Document document1 = new Document();
        document1.append("title", "Dune2 영화보기");
        document1.append("desc", "이번 주말 IMAX로 Dune2 영화보기");
        document1.append("done", false);

        Document document2 = new Document();
        document2.append("title", "Java MongoDB 연동");
        document2.append("desc", "Java로 MongoDB 연동 프로그래밍 연습하기");
        document2.append("done", false);

        insertList.add(document1);
        insertList.add(document2);

        // 여러 문서 한 번에 추가
        InsertManyResult result = collection.insertMany(insertList);
        System.out.println("==> InsertManyResult : " + result.getInsertedIds());

        Database.close();
    }
}
