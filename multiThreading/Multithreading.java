package theoryJava.multiThreading;


// public class Multithreading extends Thread {

// 	private int	threadNumber;
// 	public Multithreading(int threadNumber) {
// 		this.threadNumber = threadNumber ;
// 	}

// 	@Override
// 	public void	run() {
// 		for (int i = 0; i <= 5; i++) {
// 			System.out.println(i + " from thread: " + threadNumber);

// 			if (threadNumber == 3) {
// 				throw new RuntimeException();
// 			}

// 			//try-catch to access sleep()
// 			try {
// 				Thread.sleep(1000);
// 			} catch (InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

public class Multithreading implements Runnable {

	private int	threadNumber;
	public Multithreading(int threadNumber) {
		this.threadNumber = threadNumber ;
	}

	@Override
	public void	run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " from thread: " + threadNumber);

			if (threadNumber == 3) {
				throw new RuntimeException();
			}

			//try-catch to access sleep()
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
