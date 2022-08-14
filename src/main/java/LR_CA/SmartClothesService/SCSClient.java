package LR_CA.SmartClothesService;
//CA Leticia Romeu dos Santos 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import LR_CA.SmartClothesService.SmartClothesServiceGrpc;
import LR_CA.FitnessTrackersService.FitnessTrackersServiceGrpc.FitnessTrackersServiceBlockingStub;
import LR_CA.FitnessTrackersService.FitnessTrackersServiceGrpc.FitnessTrackersServiceStub;
import LR_CA.SmartClothesService.SmartClothesServiceGrpc.SmartClothesServiceBlockingStub;
import LR_CA.SmartClothesService.SmartClothesServiceGrpc.SmartClothesServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class SCSClient {
	
	private static SmartClothesServiceBlockingStub blockingStub;
	private static SmartClothesServiceStub asyncStub;


	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = SmartClothesServiceGrpc.newBlockingStub(channel);

		asyncStub = SmartClothesServiceGrpc.newStub(channel);


		//calling client RPC
	//	numberOfSteps();
		
		//calling bi-directional RPC
		//heartRateMonitor();
		

	}

}



