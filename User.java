package socmedSample;

import java.util.*;

class User {
    private String username;
    private String password;
    private List<User> friends;
    private List<Post> posts;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    public void removeFriend(User friend) {
        friends.remove(friend);
    }

    public List<User> getFriends() {
        return friends;
    }

    public void createPost(String content) {
        Post post = new Post(this, content);
        posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }
}

