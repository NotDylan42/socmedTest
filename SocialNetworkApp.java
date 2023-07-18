package socmedSample;

import java.util.*;

public class SocialNetworkApp {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("john123", "password1");
        User user2 = new User("jane456", "password2");
        User user3 = new User("mark789", "password3");

        // Add friends
        user1.addFriend(user2);
        user1.addFriend(user3);

        // Create posts
        user1.createPost("Hello, everyone! This is my first post.");
        user2.createPost("Excited to join this social network!");
        user3.createPost("Happy Friday!");

        // Display user information
        System.out.println("User: " + user1.getUsername());
        System.out.println("Friends: " + user1.getFriends().size());
        System.out.println("Posts: " + user1.getPosts().size());
    }
}
