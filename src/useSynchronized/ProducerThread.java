package useSynchronized;

public class ProducerThread extends Thread{
	private Resource resource;
	public ProducerThread(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		//���ϵ�������Դ
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource.add();
		}
	}
}
