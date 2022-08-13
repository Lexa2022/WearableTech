package LR_CA.RingMouseControlService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import LR_CA.FitnessTrackersService.FitnessTrackersServiceGrpc.FitnessTrackersServiceBlockingStub;
import LR_CA.FitnessTrackersService.FitnessTrackersServiceGrpc.FitnessTrackersServiceStub;
import LR_CA.RingMouseControlService.RingMouseControlServiceGrpc.RingMouseControlServiceBlockingStub;

import LR_CA.RingMouseControlService.RingMouseControlServiceGrpc.RingMouseControlServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class RMCClient {
	
	private static RingMouseControlServiceBlockingStub blockingStub;
	private static RingMouseControlServiceStub asyncStub;


	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = RingMouseControlServiceGrpc.newBlockingStub(channel);

		asyncStub = RingMouseControlServiceGrpc.newStub(channel);


		//calling client RPC
	//	numberOfSteps();
		
		//calling bi-directional RPC
		//heartRateMonitor();
		

	}

}



