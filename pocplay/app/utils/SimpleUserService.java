//package utils;
//
//import java.util.HashMap;
//
//public class SimpleUserService {
//    private final HashMap<String, Identity> users = new HashMap<>();
//    private final HashMap<String, Token> tokens = new HashMap<>();
//    public SimpleUserService(Application application) {
//    super(application);
//    }
//    @Override
//    public Identity doSave(Identity user) {
//    users.put(user.id().id() + user.id().providerId(), user);
//    return user;
//    }
//    @Override
//    public void doSave(Token token) {
//    tokens.put(token.uuid, token);
//    }
//    @Override
//    public Identity doFind(UserId userId) {
//    return users.get(userId.id() + userId.providerId());
//    }
//    @Override
//    public Token doFindToken(String tokenId) {
//    return tokens.get(tokenId);
//    }
//    @Override
//    public Identity doFindByEmailAndProvider(String email,
//    String providerId) {
//    for (Identity user : users.values()) {
//    if(user.id().providerId().equals(providerId) &&
//    user.email().isDefined() && user.email().get()
//    .equalsIgnoreCase(email)) {
//    return user;
//    }
//    }
//    return null;
//    }
//    @Override
//    public void doDeleteToken(String uuid) {
//    tokens.remove(uuid);
//    }
//    @Override
//    public void doDeleteExpiredTokens() {
//    for (Map.Entry<String, Token> entry : tokens.entrySet()) {
//    if(entry.getValue().isExpired()) {
//    tokens.remove(entry.getKey());
//    }
//    }
//    }
//    }
// }
