package Com.Demo.Test;

public class TestVisit {

	public static void main(String[] args) {
		visit vis = new visit("John",40.0);
		System.out.println("After the visit has taken place");
		System.out.println(vis);
		
		String name = vis.getName();
		double price = vis.getPrice();
		String result =  vis.getResult();
		int duration = vis.getDuration();
		boolean done = vis.hasTakenplace();
		System.out.println("Information on the visit: ");
		System.out.println("Name: " +name);
		System.out.println("Result: " +result);
		System.out.println("Duration: "+duration);
		System.out.println("Done: " +done);
		
		vis.visit("Carlo Bruni", 50);
		System.out.println("Visit again");
		}
    }
