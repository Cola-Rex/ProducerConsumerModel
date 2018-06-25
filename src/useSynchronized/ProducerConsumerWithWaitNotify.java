package useSynchronized;

public class ProducerConsumerWithWaitNotify {

	public static void main(String[] args) {
		Resource resource = new Resource();
		//�������߳�
		ProducerThread p1 = new ProducerThread(resource);
		ProducerThread p2 = new ProducerThread(resource);
		ProducerThread p3 = new ProducerThread(resource);
		//�������߳�
		ConsumerThread c1 = new ConsumerThread(resource);
		
		p1.start();
		p2.start();
		p3.start();
		c1.start();
	}
}
