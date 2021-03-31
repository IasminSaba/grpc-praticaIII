import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import ufc.crateus.sd.service.CarServiceImpl;

public class App {

	public static void main(String[] args) throws IOException, InterruptedException {
		 System.out.println("Server start");
	        Server server = ServerBuilder.forPort(8080)
	                .addService(new CarServiceImpl())
	                .build();
	        server.start();
	        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	            server.shutdown();
	        }));
	        server.awaitTermination();

	}

}
