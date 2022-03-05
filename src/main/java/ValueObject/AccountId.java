package ValueObject;


import java.util.Objects;
import java.util.UUID;

public class AccountId {
    private String id;

    public AccountId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

}
