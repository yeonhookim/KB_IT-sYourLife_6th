import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Updates.*;

public class UpdateManyTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("users");

        int age = 20; // 기준 나이 값 (원하는 값으로 수정하세요)

        // age가 지정 값보다 큰 문서들 선택
        Bson query = gt("age", age);

        // name 필드 수정, lastUpdated 필드 현재 시각으로 갱신
        Bson updates = combine(
                set("name", "modify name"),
                currentTimestamp("lastUpdated")
        );

        // updateMany로 여러 문서 수정
        UpdateResult result = collection.updateMany(query, updates);
        System.out.println("==> UpdateManyResult : " + result.getModifiedCount());

        Database.close();
    }
}
