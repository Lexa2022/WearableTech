package LR_CA.FitnessTrackersService;
//
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Random;
	import com.google.protobuf.GeneratedMessageV3.Builder;

//	import LR_CA.FitnessTrackersService.FitnessTrackersServiceGrpc.FitnessTrackersServiceBlockingStub;
	//import LR_CA.FitnessTrackersService.FitnessTrackersServiceGrpc.FitnessTrackersServiceStub;
	import io.grpc.ManagedChannel;
	import io.grpc.ManagedChannelBuilder;
	import io.grpc.StatusRuntimeException;
	import io.grpc.stub.StreamObserver;


	public class FTSClient {

		private static FitnessTrackersServiceGrpc.FitnessTrackersServiceBlockingStub blockingStub;
		private static FitnessTrackersServiceGrpc.FitnessTrackersServiceStub asyncStub;


		public static void main(String[] args) throws Exception{

			ManagedChannel channel = ManagedChannelBuilder
					.forAddress("localhost", 50051)
					.usePlaintext()
					.build();

			//stubs -- generate from proto
			blockingStub = FitnessTrackersServiceGrpc.newBlockingStub(channel);

			asyncStub = FitnessTrackersServiceGrpc.newStub(channel);


			//calling client RPC
			numberOfSteps();
			
			//calling bi-directional RPC
			//heartRateMonitor();
			channel.shutdown();
		}
		
		public static void numberOfSteps() {


	           // Handling the stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
	            StreamObserver<StepsResponse> responseObserver = new StreamObserver<StepsResponse>() {


	               @Override
	                public void onNext(StepsResponse value) {
	            	  
	                    System.out.println("receiving the fitness status : " + value.getOutput());
	                }


	               @Override
	                public void onError(Throwable t) {
	                    // TODO Auto-generated method stub



	               }

	               @Override
	                public void onCompleted() {
	                    System.out.println("completed ");

	               }
	            };
	    	           
		// Here, we are calling the Remote length method. Using onNext, client sends a stream of messages.
      StreamObserver<StepsRequest> requestObserver = asyncStub.numberOfSteps(responseObserver);
	            //  StreamObserver<StepsRequest> requestObserver = asyncStub.numberOfSteps(requestObserver);
        /**
        ArrayList<Integer>  stepInput = new ArrayList<Integer>();
        stepInput.add(3345);
        stepInput.add(3778);
        stepInput.add(8947);
        stepInput.add(9874);
     
       Random r = new Random();
        
        int randomSteps = r.nextInt(stepInput.size());
        int randSP = stepInput.get(randomSteps);
       
        
       // return randCoulID;
        **/
        
        try {
            
            //requestObserver.onNext(StepsRequest.newBuilder().setSteps(String.valueOf(randSP)).build());
          requestObserver.onNext(StepsRequest.newBuilder().setSteps("2338").build());



           System.out.println("SENDING MESSAGES");



           // Mark the end of requests
            requestObserver.onCompleted();




            // Sleep for a bit before sending the next one.
            Thread.sleep(new Random().nextInt(1000) + 200);




        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }



	            }   
    
		
}
