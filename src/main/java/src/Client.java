package src;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client{

    private final ManagedChannel managedChannel;

    public Client(String host, int port){

        managedChannel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext(true)
                .build();

    }

    public void sayHello(){
       //Input input = Input.newBuilder().setMessage("Hello!").build();





    }
}