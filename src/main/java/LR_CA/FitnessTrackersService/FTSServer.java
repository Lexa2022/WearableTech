package LR_CA.FitnessTrackersService;  //CA Leticia Romeu dos Santos 


	import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
	import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.net.InetAddress;
	import java.util.ArrayList;
	import java.util.Properties;
	import java.util.Random;

	import javax.jmdns.JmDNS;
	import javax.jmdns.ServiceInfo;

	//import LR_CA.FitnessTrackersService.StepsRequest.Operation;
	import LR_CA.FitnessTrackersService.FitnessTrackersServiceGrpc.FitnessTrackersServiceImplBase;
	import LR_CA.FitnessTrackersService.StepsResponse.Builder;
import io.grpc.Server;
	import io.grpc.ServerBuilder;
	import io.grpc.stub.StreamObserver;
	

	public class FTSServer extends FitnessTrackersServiceImplBase {


		public static void main(String[] args) {
			FTSServer ftsServer = new FTSServer();

			Properties prop = ftsServer.getProperties();
			
			ftsServer.registerService(prop);
			
			int port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

			try {

				Server server = ServerBuilder.forPort(port)
						.addService(ftsServer)
						.build()
						.start();

				System.out.println("FTS Server started, listening on " + port);

				server.awaitTermination();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

		
		private Properties getProperties() {
			
			Properties prop = null;		
			
			 try (InputStream input = new FileInputStream("src/main/resources/wearable.properties")) {

		            prop = new Properties();

		            // load a properties file
		            prop.load(input);

		            // get the property value and print it out
		            System.out.println("Smart Wearables Service properies ...");
		            System.out.println("\t service_type: " + prop.getProperty("service_type"));
		            System.out.println("\t service_name: " +prop.getProperty("service_name"));
		            System.out.println("\t service_description: " +prop.getProperty("service_description"));
			        System.out.println("\t service_port: " +prop.getProperty("service_port"));

		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		
			 return prop;
		}
		
		
		private  void registerService(Properties prop) {
			
			 try {
		            // Create a JmDNS instance
		            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
		            
		            String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
		            String service_name = prop.getProperty("service_name")  ;// "example";
		           // int service_port = 1234;
		            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

		            
		            String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
		            
		            // Register a service
		            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
		            jmdns.registerService(serviceInfo);
		            
		            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
		            
		            // Wait a bit
		            Thread.sleep(1000);

		            // Unregister all services
		            //jmdns.unregisterAllServices();

		        } catch (IOException e) {
		            System.out.println(e.getMessage());
		        } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			 
			 @Override
			    public StreamObserver<StepsRequest> numberOfSteps(StreamObserver<StepsResponse> responseObserver) {
			        
			        // Retrieve the value from the stream of requests of the client.
			        return new StreamObserver<StepsRequest>() {
			            
			        
			            
			        
			            StringBuffer sb = new StringBuffer();
			            
			            // For each message in the stream, get one stream at a time.
			            // NOTE: YOU MAY MODIFY THE LOGIC OF onNext, onError, onCompleted BASED ON YOUR PROJECT.
			            @Override
			            public void onNext(StepsRequest value) {
			                // Here, in this example we compute the value of string length for each message in the stream.
			                System.out.println("Your steps you performed is -> " + value.getSteps());
			       
			                
			            }



			           @Override
			            public void onError(Throwable t) {
			                // TODO Auto-generated method stub
			                
			            }



			           // Once the complete stream is received this logic will be executed.
			            @Override
			            public void onCompleted() {
			                // Preparing and sending the reply for the client. Here, response is build and with the value (length) computed by above logic.
			                 // Here, response is sent once the client is done with sending the stream.
			                
			                
			                responseObserver.onNext(StepsResponse.newBuilder().setOutput("Your fitness step status are: "+  sb.toString()).build());
			                
			               // Builder medList =StepsResponse.newBuilder();
			               // String sStats = medList.toString();
			                
			                
			                // Preparing the reply for the client. Here, response is build and with the value (output) computed by above logic.  
			                        
			                StepsResponse fitStats = StepsResponse.newBuilder().setOutput("You are fit enough").build();
			                  responseObserver.onNext(fitStats);
			                  responseObserver.onCompleted();
			            }
			            
			            
			        };
			    }

				
				/**
				public StreamObserver<ConvertMessage> convertBase(StreamObserver<ConvertResponse> responseObserver) {
					
					return new StreamObserver<ConvertMessage> () {

						@Override
						public void onNext(ConvertMessage msg) {
							System.out.println("receiving convertBase method num: "+ msg.getNumber() + " from-base: "+ msg.getFromBase() + " to-base: "+ msg.getToBase()  );
							
							String converted =  Integer.toString(Integer.parseInt(msg.getNumber(), msg.getFromBase()), msg.getToBase());
							
							ConvertResponse reply = ConvertResponse.newBuilder().setNumber(converted).setBase(msg.getToBase()).build();
							
							responseObserver.onNext(reply);
							
						}

						@Override
						public void onError(Throwable t) {
							
							t.printStackTrace();
							
						}

						@Override
						public void onCompleted() {
							System.out.println("receiving convertBase completed ");
							
							//completed too
							responseObserver.onCompleted();
						}
						
					};
				 
		}**/
		
		
		
}
