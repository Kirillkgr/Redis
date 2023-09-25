package kirill.zhdanov.redis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Model")
public class Model {
    @Id
    private Integer id;
    private String name = "";
    private Integer age = 0;
    private String sex = "";
}
