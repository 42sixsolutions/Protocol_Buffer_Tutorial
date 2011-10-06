import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import proto_example.SocialNetworkUser;


public class ProtocolBufferTutorial {
	
	public static void printUser(SocialNetworkUser.User user) {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ").append(user.getName()).append("\n");
		sb.append("Number of Likes: ").append(user.getNumLikes()).append("\n");
		sb.append("Number of Groups: ").append(user.getNumGroups()).append("\n");
		sb.append("Number of Photos: ").append(user.getNumPhotos()).append("\n");
		System.out.println(sb.toString());
	}
	
	public static void main(String [] args) throws FileNotFoundException, IOException {
		SocialNetworkUser.User.Builder user = SocialNetworkUser.User.newBuilder();
		user.setName("Sapan Shah");
		user.setNumGroups(21);
		user.setNumPhotos(15);
		user.setNumLikes(10);
		
		user.build().writeTo(new FileOutputStream("/Users/sshah/output.proto"));
		
		SocialNetworkUser.User readInUser = SocialNetworkUser.User.parseFrom(new FileInputStream("/Users/sshah/output.proto"));
		printUser(readInUser);
		
	}
}
